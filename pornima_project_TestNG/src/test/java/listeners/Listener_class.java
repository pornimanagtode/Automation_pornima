package listeners;

import java.awt.event.ItemListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestsuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTestskipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}
}


