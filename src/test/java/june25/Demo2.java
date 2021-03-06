package june25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Demo2 {

	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("http://bigbasket.com/");
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		// Double click on the webElemebt
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		Thread.sleep(5000);
		// Right click on the web page
		act.moveToElement(search).contextClick().build().perform();
	}

	@Test
	public void f2() {
		driver.get("http://bigbasket.com/");
		String vegName = "tamato";

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();
	}

	@Test
	public void f3() throws InterruptedException {
		driver.get("http://bigbasket.com/");
		Actions act = new Actions(driver);
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		act.moveToElement(shopByCat).build().perform();
	
		Thread.sleep(5000);
		
		if(shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}
	
	@BeforeClass
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}

