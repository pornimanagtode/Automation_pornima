package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import dynamic_code.Reserved_code;

public class Hard_assert extends Reserved_code {
  @Test
  public void Browser_and_hiturl() {
	  launch_browser("chrome");
	  url("https://www.hubspot.com/");
	  
	 String Expected_url = "https://www.hubspot.com/";
	 String Actual_url = "https://www.hubspot/";
	 
//	 assertEquals(Actual_url, Expected_url);
//	 assertNotEquals(Actual_url, Expected_url);
	 assertTrue(Actual_url.equals(Expected_url),"url is not matched");
	 
  }
  @Test
  public void Software() {
	 WebElement software = driver.findElement(By.xpath("(//span[@class=\"hsg-nav__link-label\"])[1]"));
	 
  }
}
