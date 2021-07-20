package june5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
	
    WebDriver driver;

    driver = new ChromeDriver();
    
    driver.get("http://automationpractice.com/index.php");
    
    driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
    driver.findElement(By.name("submit_search")).click();
    		
	}
}




