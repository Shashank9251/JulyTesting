package june11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExEnterCaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.bigbasket.com/");
       String vegName = "tamato";
       Actions act = new Actions (driver);
       WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
       act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();
       
      Thread.sleep(5000);
		
		
	}

}
