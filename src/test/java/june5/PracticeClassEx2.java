package june5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClassEx2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
	    driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
	    
	}

}
