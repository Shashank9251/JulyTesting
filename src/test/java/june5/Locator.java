package june5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
	    

      WebDriver  driver;
	   driver = new ChromeDriver();
	   driver.get("https://www.bigbasket.com/");
	   driver.findElement(By.xpath("(//a[@class='ng-scope'])[1]")).click();
	   driver.findElement(By.id("mobile")).sendKeys("9999999999");
	   driver.findElement(By.xpath("//button[@class='btn btn-default signup-btn']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.id("otp")).sendKeys("123456");
	   
	}

}
