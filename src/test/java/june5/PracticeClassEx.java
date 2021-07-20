package june5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClassEx {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    
	    driver.get("https://www.flipkart.in/");
		   Thread.sleep(5000); 

      driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']/following::input[1]")).sendKeys("shashank@test.com");
      driver.findElement(By.xpath("span[text()='Get access to your Orders, Wishlist and Recommendations']/following::input[2]")).sendKeys("passed");
	
	
	
	}


}

