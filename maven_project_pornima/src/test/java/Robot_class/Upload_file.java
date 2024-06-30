package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamic_code.Reserved_code;

public class Upload_file extends Reserved_code {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		url("https://www.adobe.com/in/acrobat/online/word-to-pdf.html");
		driver.findElement(By.xpath("//button[text()=\"Select a file\"]")).click();
		StringSelection ss = new StringSelection("\"C:\\Users\\kalya\\OneDrive\\Documents\\father RESUME.docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robo = new Robot();
		robo.delay(1000);		
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
	 robo.delay(2000);

		robo.keyPress(KeyEvent.VK_ENTER);
	 robo.keyRelease(KeyEvent.VK_ENTER);

	}

}
