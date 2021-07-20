package june24;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Sample2 {
  @Test
  public void f() {
	  System.out.println("I am from Test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am from before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am from after Test");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from after class");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from after method");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am from before suite");
  }

  @AfterSuite
  public void afteSuite() {
	  System.out.println("I am from after suite");
  }

}
