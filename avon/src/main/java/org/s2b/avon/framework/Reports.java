package org.s2b.avon.framework;

import java.io.File;
import java.io.IOException;

import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	private static final String DEFAULT_DESCRIPTION = "Avon Test Suite";
	private static ExtentReports extent;
	private static ExtentTest logger;

	public static void create(String title, String description) {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);
	}

	public static void startTest(String testDescription) {
		if (extent == null) {
			create(DEFAULT_DESCRIPTION, testDescription);
		}
		logger = extent.startTest(testDescription);

		extent.addSystemInfo("Host Name", "Avon.com");
		extent.addSystemInfo("Environment", "Teste Codigo");
		extent.addSystemInfo("User Name", "Fabio e Pedro Henrique");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));*/
	}

	public static void log(LogStatus logStatus, String message, String imagePath) throws IOException {		
		if(logger == null) {
			startTest(DEFAULT_DESCRIPTION);
		}
		
		logger.log(logStatus, message + logger.addScreenCapture(imagePath) + imagePath );
	}
	public static void log(LogStatus logStatus, String message) {		
		if(logger == null) {
			startTest(DEFAULT_DESCRIPTION);
		}
		
		logger.log(logStatus, message);
	}
	
	public static void close() throws IOException {
		if(extent != null) {
			extent.flush();
		} else {
			startTest("O TestCase passou!");
			log(LogStatus.INFO, "O teste encerrou.", null);
			close();
		}
		/* public static void getResult(ITestResult result){
			 if(result.getStatus() == ITestResult.FAILURE){
			 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
			 }else if(result.getStatus() == ITestResult.SKIP){
			 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
			 }
			 extent.endTest(logger);
			 }*/
			 
	}

	
}

/*
 * public static ExtentTest getLogger() { return logger; }
 * 
 * public static void setLogger(ExtentTest logger) { Reports.logger = logger; }
 */