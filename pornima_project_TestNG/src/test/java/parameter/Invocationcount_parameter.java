package parameter;

import org.testng.annotations.Test;

public class Invocationcount_parameter {

  @Test (invocationCount = 2, dependsOnMethods = "installation")
  public void login () {
	  System.out.println("login the application");
  }
  
  @Test(invocationCount = 4,dependsOnMethods = "hit url")
  public void installation() {
	  System.out.println("install an application");
  }
  @Test(invocationCount = 4)
  public void hit_url() {
	  System.out.println("hit the Url");
  }
  
  @Test (invocationCount = 3)
  public void search() {
	  System.out.println("search the webelement");
  }
  
  @Test(invocationCount = 2)
  public void locate() {
	  System.out.println("locate the webelement");
  }
  
  @Test(invocationCount = 4)
  public void click() {
	  System.out.println("click on the result");
  }
  
}
