package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("email")).sendKeys("shashankreddy630@gmail.com");
	    String str = driver.findElement(By.id("email")).getAttribute("value");
	    System.out.println("Value:  " + str);
	    
	}

}
