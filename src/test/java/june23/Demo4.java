package june23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo4 {
  @Test
  public void Test() {
  System.out.println("I am from test");
  }
  @Test
  public void Test2() {
  System.out.println("I am from test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from After Class");
  }

}
