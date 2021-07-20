package june10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromWebsite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    
	    driver.get("http://automationpractice.com/");
	    
	    String apw = "Automation Practice Website";
	   
	    String ap = driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).getText();
	    System.out.println(ap);
	 if (apw.equals(ap)) {
		 System.out.println("Automation practice website is Pass");
	 }
		 else {
			 System.out.println("Automation practice website is Fail");
		 }
	 String comeVisitUsText  = driver.findElement(By.xpath("(//div[@class='type-text']/h3)[1]")).getText();
	 System.out.println(comeVisitUsText);
		 }
}



