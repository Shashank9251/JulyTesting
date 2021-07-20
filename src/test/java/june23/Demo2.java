package june23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo2 {
  @Test
  public void fox() {
	  System.out.println("I am from Fox method");
  }
  
  @Test
  public void apple() {
	  System.out.println("I am from Apple method");
  }
  
  @Test
  public void horse() {
	  System.out.println("I am from Horse method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from After method");
  }

}
