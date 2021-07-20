package june11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExOnMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    
	    driver.get("https://www.bigbasket.com/");
	    Actions act = new Actions(driver);
	    WebElement shopBycat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
	    act.moveToElement(shopBycat).build().perform();
	    Thread.sleep(5000);
	    if(shopBycat.isDisplayed() && shopBycat.isEnabled()) {
	    	driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
	    }
	    else 
	    {
	    	System.out.println("Web Elelement is not present");
	    }
	}
}
	
 
	    	
	    
