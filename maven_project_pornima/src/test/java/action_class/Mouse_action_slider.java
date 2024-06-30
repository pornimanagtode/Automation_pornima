package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Reserved_code;

public class Mouse_action_slider extends Reserved_code {

	public static void main(String[] args) throws Throwable {

		launch_browser("Chrome");
		url("https://jqueryui.com/slider/");
		Actions act = new Actions(driver);

		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);

		WebElement slider_box = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		act.moveToElement(slider_box).clickAndHold().moveByOffset(400, 0).release().build().perform();
		Thread.sleep(2000);
		act.moveToElement(slider_box).clickAndHold().moveByOffset(-200, 0).release().build().perform();
		act.dragAndDropBy(slider_box, 100, 0).build().perform();

	}
}


