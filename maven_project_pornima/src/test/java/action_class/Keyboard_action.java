package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import dynamic_code.Reserved_code;

public class Keyboard_action extends Reserved_code {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		url("https://www.flipkart.com/");
		Actions action = new Actions(driver);

		WebElement electronics = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		action.moveToElement(electronics).click().build().perform();
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
		action.moveToElement(login).click().build().perform();

		WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='off']) [2]"));
		action.moveToElement(email).sendKeys("asdsgsdgasdg").build().perform();

		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		email.clear();
		Thread.sleep(1000);
		email.click();
		Thread.sleep(1000);

		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);

		action.keyDown(Keys.PAGE_DOWN);
		action.keyUp(Keys.PAGE_UP);

	}

}
