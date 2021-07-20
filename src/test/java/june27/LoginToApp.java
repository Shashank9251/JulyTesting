package june27;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.TestBase;

public class LoginToApp extends TestBase{

@Test
	public void Login() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test is Started");
		
		logger.log(LogStatus.INFO, "Clicking on the Sign-in link");
		homePageObj.getSignInLink().click();
		
		logger.log(LogStatus.INFO, "Enter the username and password in authentication Page");
		authPageObj.setLoginEmail(prop.getProperty("Username"));
		authPageObj.setLoginPassword(prop.getProperty("Password"));
		authPageObj.getLoginSubmitButton().click();
		
		logger.log(LogStatus.PASS, "Logged in Successfully");
	}
	
	@Test
	public void search() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test is Started");
		
		logger.log(LogStatus.INFO, "In Home page Serch with T-Shirts");
		homePageObj.setSearchTextBox("T-Shirts");
		
		logger.log(LogStatus.PASS, "Searhed successfully");
	}
	
		@Test
	public void verifyContactUs() {
		homePageObj.getContactUs().click();
	}
	
	@Parameters({"username","password"})
	@Test
	public void login2(String uname, String pword) {
		homePageObj.getSignInLink().click();
		
		authPageObj.LoginToApplication(uname, pword);
	}
	
	
	@Test
	public void login3UsingExcel() {
		homePageObj.getSignInLink().click();
		
		String username = excelReader.getCellData("Login-Cred", "Username", 2);
		String password = excelReader.getCellData("Login-Cred", "Password", 2);
		System.out.println("excel username is : " + username);
		System.out.println("excel password is : " + password);
		
		authPageObj.LoginToApplication(username, password);
	}
	
	
	
}
