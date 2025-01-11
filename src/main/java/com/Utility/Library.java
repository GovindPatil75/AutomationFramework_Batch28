package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	 public static ExtentTest test;
	 
	public static void custom_SendKeys(WebElement element,String Value,String Fieldname) {
		
		try {
			element.sendKeys(Value);
			test.log(Status.PASS, Fieldname+"==Value Entered Succefully...=="+Value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	
	public static void custom_Click(WebElement element,String Fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, Fieldname+"==Clicked Succesfully...");
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
		
	}
}
