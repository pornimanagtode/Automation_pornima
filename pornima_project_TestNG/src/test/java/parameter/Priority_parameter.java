package parameter;

import org.testng.annotations.Test;

public class Priority_parameter {
  @Test(priority = 2)
  public void login() {
	  System.out.println("login the page");
  }
  @Test(priority = 1)
  public void  application() {
	  System.out.println("install an application");
}
  @Test(priority = 3)
  public void verify() {
	  System.out.println("verify the page");
  }
  @Test(priority =8)
  public void close() {
	  System.out.println("close the application");
  }
  @Test(priority = 4)
  public void search() {
	  System.out.println("search the webelement");
	  }
  @Test(priority =5 )
  public void searchbox() {
	  System.out.println("click on the searchbox");
	  }
  @Test(priority = 6)
  public void select() {
	  System.out.println("select the option");
  }
  @Test(priority = 7)
  public void Result() {
	  System.out.println("see the result");
  }



}












	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
