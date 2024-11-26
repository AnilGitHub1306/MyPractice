package utilityPackage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGeneration {

	public static void main(String[] args) throws Throwable {
		
		ExtentReports extentReport = new ExtentReports();
		
		String extentReportPath = System.getProperty("user.dir")+"\\ExtentReport\\extentReportHTML.html";
		File file = new File(extentReportPath);
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReport.attachReporter(sparkReporter);
		
//		extentReport.setSystemInfo("Operating System", System.getProperty("os.name"));
//		extentReport.setSystemInfo("Java Version", System.getProperty("java.version"));
		
		ExtentTest test1= extentReport.createTest("SmokeTest");
		test1.pass("Massage-SmokeTestPass");
		test1.log(Status.INFO, "URL Opened");
		test1.log(Status.INFO, "Chrome opened");
		test1.log(Status.INFO, "Chrome closed");
		test1.log(Status.INFO, "execution completed");
		
		
		
		ExtentTest test2= extentReport.createTest("Massage-SanityTest");
		test2.fail("Massage-SanityTestPass");
		test2.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\screenshots\\addFile.png");
		
		ExtentTest test3= extentReport.createTest("Massage-RegressionTest");
		test3.skip("Massage-RegressionTestPass");
		
	
		
		extentReport.flush();
	
	
	//To automatically open the report
		Desktop.getDesktop().browse(file.toURI());
	
	    
	
	}

}
