package june23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo3 {
  @Test
  public void method() {
	  
	  System.out.println("I am from fox method");
  }
  @Test
  public void method2() {
	  
	  System.out.println("I am from fox method2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from after class");
  }

}
