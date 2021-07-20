package june6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowsernaukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");
		
	    WebDriver driver;

	    driver = new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.quit();
	    

	}

}
 