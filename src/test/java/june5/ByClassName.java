package june5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
	
    WebDriver driver;

	
	  driver = new ChromeDriver();
	  
	  driver.get("http://automationpractice.com/index.php");
	  
	  driver.findElement(By.linkText("Contact us")).click();
	 
    		
    
	}
}





