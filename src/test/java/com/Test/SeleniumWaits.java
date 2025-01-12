package com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {

	public static void main(String[] args) throws Exception {
		
		// Selenium Waits
		
		Thread.sleep(2000); //  2 sec
		//Element Action 
		
		//1.Implicit wait
	//	-------------------------------
		// Applicable Element globally 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2.Explict wait /Fluent wait -- 30 -- 5 Check -- pulling freuncy 
		
		// Applicable perticular element With Condition 
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(null));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
