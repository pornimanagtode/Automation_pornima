package listeners;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Reserved_code;

public class Netmed_listener extends Reserved_code implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		action = new Actions(driver);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takesscreenshot_1(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takesscreenshot_2(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		launch_browser("chrome");
		url("https://www.netmeds.com/");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//driver.close();
		
	}

}
