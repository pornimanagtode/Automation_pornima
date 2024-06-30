package action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import dynamic_code.Reserved_code;

public class Mouse_action_dragdrop extends Reserved_code {

	public static void main(String[] args) {
		
	
		launch_browser("chrome");
		
	url("https://jqueryui.com/droppable/");
	Actions act = new Actions(driver) ;
	
  driver.findElement(By.xpath("//a[text()=\"Droppable\"]")).click();
	 
     //for drag and drop method
	WebElement frame1 = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame1);
       
     WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
     WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
     
     act.dragAndDrop(drag, drop).build().perform();
     act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
    
	}
}
       
       
	    
	  
	



	
