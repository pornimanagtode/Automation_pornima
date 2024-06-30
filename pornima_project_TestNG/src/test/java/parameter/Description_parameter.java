package parameter;

import org.testng.annotations.Test;

public class Description_parameter {
  @Test(description = " data from record book",priority = 4)
  public void record() {
	 System.out.println();
  }
  @Test(description ="work alloted to the employ",priority =2)
  public void work() {
	  System.out.println();
  }
  
  @Test(description ="progress graph of the Company",priority =1)
  public void graph() {
	  System.out.println();
  }
  
  @Test(description ="work load is added",priority =3)
  public void add() {
	  System.out.println("");
  }
}
