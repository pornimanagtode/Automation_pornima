package end_to_end_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dynamic_code.Reserved_code;

@Listeners(Listener_normal.class)
public class Flipkart extends Reserved_code {
  @Test(priority = 1)
  public void fashion() throws Throwable {
WebElement fashion = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
	action.moveToElement(fashion).build().perform();
	  System.out.println("move on fashion");
	  Thread.sleep(1000);
  }
  
  @Test(priority =2 )
  public void beauty_and_toys() throws Throwable {
WebElement Beauty_and_toys = driver.findElement(By.xpath("//div[@aria-label='Beauty, Toys & More']"));
	action.moveToElement(Beauty_and_toys).build().perform();
	  System.out.println("move to Beauty_and_toys");
	  Thread.sleep(1000);
  }
  @Test(priority =3 )
  public void elecronics() throws Throwable {
WebElement elecronics = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
	action.moveToElement(elecronics).build().perform();
	  System.out.println("move to elecronics");
	  Thread.sleep(1000);
  }
  @Test(priority =5)
  public void Two_Whiller() throws Throwable {
WebElement  Two_Whiller= driver.findElement(By.xpath("//div[@aria-label='Two Wheelers']"));
	action.moveToElement( Two_Whiller).build().perform();
	  System.out.println("move to  Two_Whiller");
	  Thread.sleep(1000);
  }
  @Test(priority =4 )
  public void Home_and_kitchen() throws Throwable {
WebElement HK = driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));
	action.moveToElement(HK).build().perform();
	  System.out.println("move to Home and kitchen");
	  Thread.sleep(1000);
  }
}
