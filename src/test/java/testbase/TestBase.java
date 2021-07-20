package testbase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excel.ExcelReader;
import june28_log4j.LogTest;
import listeners.EventListener;
import pages.AuthenticationPage;
import pages.Homepage;

public class TestBase {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	public static WebDriver driver;
	protected Homepage homePageObj;
	protected AuthenticationPage authPageObj;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public Properties prop;
	public FileInputStream fis;
	public static ExcelReader excelReader;
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");

		//load the file using below command
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		
		}
		else {
			System.out.println("no browser is supported here");
			System.exit(0);
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));	
		
		//class file which we created in above step
		EventListener ecapture = new EventListener(); 
		
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);
		
		homePageObj = new Homepage(eventHandler);
		authPageObj = new AuthenticationPage(eventHandler);
		
		excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\InputDataForTestCases.xlsx");
	}
	
	@AfterMethod
	public void afterTest() {
		driver.close();
		extent.endTest(logger);
		extent.flush();
	}
	
	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}
	
	@AfterTest
	public void testafter() {
		 
		extent.close();
	}
}

