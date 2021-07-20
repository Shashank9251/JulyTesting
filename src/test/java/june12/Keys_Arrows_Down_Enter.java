package june12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Arrows_Down_Enter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    
	    driver.get("http://www.amazon.in/");
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Colgate");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
	   
     if(driver.findElement(By.xpath("//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[3]")).getText().contains("colgate")) 
     {
System.out.println("PASS");
	   }
     else {
    	 System.out.println("FAIL");
     }

}
}
