package utilityPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("onTestStart: "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure "+result.getMethod().getMethodName());
	}
}
