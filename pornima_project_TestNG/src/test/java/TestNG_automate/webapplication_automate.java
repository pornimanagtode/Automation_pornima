package TestNG_automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dynamic_code.Reserved_code;

public class webapplication_automate extends Reserved_code{
	
  @BeforeSuite
  public void launch_browser() {
	launch_browser();
  }
  
  @BeforeTest
  public void url() {
	url("https://www.amazon.in/");
	
  }
  @Test
  public void dropdown () {
	  WebElement All_dropdown = driver.findElement(By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]"));
	  All_dropdown.click();
	 
  }
  }


