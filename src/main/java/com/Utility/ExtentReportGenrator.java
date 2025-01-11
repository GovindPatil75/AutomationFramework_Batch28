package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
	String ReportPath="C:\\Users\\Dell\\eclipse-workspace\\AutomationFramework_Batch28\\Reports\\index.html";
	
	ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
	reporter.config().setDocumentTitle("Automation Test Report");
	reporter.config().setReportName("Batch 28 Automation Test Report");
	reporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	
	extent.setSystemInfo("Project Name", "Batch 28");
	extent.setSystemInfo("Module Name", "Login");
	extent.setSystemInfo("Automation Tool", "Selenium WebDriver");
	extent.setSystemInfo("O.S.", "Window 10");
	extent.setSystemInfo("QA", "ABC");
	
	return extent;
	
	}
}
