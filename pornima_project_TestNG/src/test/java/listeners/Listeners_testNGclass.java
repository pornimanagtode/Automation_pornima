package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_class.class)

public class Listeners_testNGclass extends Listener_class {
  @Test
  public void test () {
	  System.out.println("test Method");
  }
  @Test
  public void Refresh() {
	  System.out.println("Refresh method");
  }
  @Test
  public void Addition() {
	  System.out.println("Addition method");
  }@Test
  public void fashion () {
	  System.out.println("fashion method");
  }
}
