package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ReportListner extends BaseClass implements ITestListener {
	
	ExtentReports extent=ExtentReportGenrator.getReports();
	
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
			
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
		
	}

	public void onTestSuccess(ITestResult result) {
		
		Library.test.log(Status.PASS, "Test Case Succefully Pass");
		Library.test.addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestFailure(ITestResult result) {
		
		Library.test.log(Status.FAIL, "Test Case Failed...");
		Library.test.addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		
		Library.test.log(Status.SKIP, "Test Case Skipped...");
		Library.test.addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onFinish(ITestContext context) {

		extent.flush();
	}
	
	public static String getScreenshot() {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
		
	}
	

}

