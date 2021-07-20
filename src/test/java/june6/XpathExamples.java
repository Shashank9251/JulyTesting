package june6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.get("http://automationpractice.com/");
	    driver.findElement(By.linkText("Sign in")). click();

	    driver.findElement(By.id("email_create")).sendKeys("digitalcutlet1@test.com");
	    driver.findElement(By.id("SubmitCreate")).click();
	    
	    
	    driver.findElement(By.xpath("//input[@name='id_gender' and @id='id_gender1']")).click();
	    driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("digital");
	    
	    driver.findElement(By.id("icon-home")).click();
	    
	    driver.quit();
	   // driver.findElement(By.id("submit_search")).click();
	    // driver.findElement(By.id("id_gender1")).click();

	}

}


