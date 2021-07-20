package june6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shash\\eclipse-workspace\\SeleniumJune\\Driver\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		
	    
	   

		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		System.out.println((driver.findElement(By.id("Register")).getAttribute("textContent")));
		driver.findElement(By.linkText("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("Digital");
		driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'])[2]")).sendKeys("Cutlet");
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-valid ng-touched\"]")).sendKeys("1326 the alameda");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shashank@test.com");
		driver.findElement(By.xpath("//input[@name='radiooptions'])[1]")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("English");
		
	Select skill = new Select(driver.findElement(By.className("form-control ng-pristine ng-valid ng-touched")));
	skill.selectByVisibleText("Java");
	
	}

}
