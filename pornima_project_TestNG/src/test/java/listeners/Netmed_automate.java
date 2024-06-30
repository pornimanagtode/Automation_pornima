package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dynamic_code.Reserved_code;

@Listeners(Netmed_listener.class)

@Test
public class Netmed_automate extends Reserved_code {
	
  /*@Test
  public void beauty () throws Throwable {
	  WebElement beauty = driver.findElement(By.xpath("(//li[@class='mega-menu'])[1]"));
	 action.moveToElement(beauty).build().perform();
	 System.out.println("move to beauty option");
	 Thread.sleep(2000);
  } 
  
  @Test
  public void Health_and_care() throws Throwable  {
	 WebElement Health_and_care = driver.findElement(By.xpath("//a[text()=\" Health Corner\"]"));
	 action.moveToElement(Health_and_care);
	 System.out.println("Health_and_care");
	 Thread.sleep(2000);
  }*/
	
	
  @Test
  public void  pincode () throws Throwable {
	  WebElement pincode  = driver.findElement(By.xpath("//div[@class=\"pinCode\"]"));
	  pincode.click();
	  System.out.println("pincode");
	  Thread.sleep(2000);
	  
	   
  }
  @Test
  public void enter_pincode() throws Throwable {
	  WebElement enter_pin = driver.findElement(By.xpath("//span[@class=\"delivery_section\"]"));
	   enter_pin.sendKeys("442907");
       System.out.println("pincode is entered");
	    Thread.sleep(2000);
  }
  
  @Test
  public void sign_in() throws Throwable {
	  WebElement sign_in = driver.findElement(By.xpath("//button[@class=\"signin_btn\"]"));
	  sign_in.click();
       System.out.println("click on sign in button");
	    Thread.sleep(2000);
	    
	   WebElement enter_mobile_no = driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-invalid ng-touched\"]"));
	   enter_mobile_no .sendKeys("7984547545");
	   System.out.println("enter mobile number");
       Thread.sleep(2000);
}
  @Test
  public void cart() throws Throwable  {
	  WebElement cart = driver.findElement(By.xpath("//a[@class=\"text m-rgt ng-star-inserted\"]"));
	  cart.click();
       System.out.println("click on cart");
	    Thread.sleep(2000);
  
  }
  @Test
  public void more_items() throws Throwable  {
	   WebElement add_more_items = driver.findElement(By.xpath("//div[@class=\"cntshoppingbox\"]"));
	   add_more_items.click();
       System.out.println("click on add_more_items");
	   Thread.sleep(2000);
  }
  
  @Test
  public void Wellnes () throws Throwable  {
	  WebElement Wellnes = driver.findElement(By.xpath("(//div[@class=\"cat-list\"])[1]"));
	  Wellnes.click();
       System.out.println("click on Wellnes");
	   Thread.sleep(2000);
  }
  
//  @Test
//  public void Add_to_cart () throws Throwable   {
//	  WebElement Add_to_cart = driver.findElement(By.xpath("(//div[@class=\"swiper-slide swiper-slide-next\"])[2]"));
//	  Add_to_cart.click();
//	  System.out.println("click on  Add_to_cart");
//       javascript_scroll(0, 3500);
//       Thread.sleep(2000);
//    
//	   
// }


  
}


