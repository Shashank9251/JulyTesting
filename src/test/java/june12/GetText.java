package june12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
		 WebDriver driver;

		    driver = new ChromeDriver();
		    
		    
		    driver.get("https://en.wikipedia.org/wiki/Main_Page");
		    WebElement element = driver.findElement(By.className("plainlinks"));
		System.out.println(element.getText());
	}

}
