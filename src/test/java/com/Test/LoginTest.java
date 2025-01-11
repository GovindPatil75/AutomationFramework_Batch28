package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ElementRepo.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class LoginTest extends BaseClass{
	
	@Test
	public void verifyLoginwithValidCredentials() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String Email=excel.getStringTestData("Login", 0, 0);
		String Pwd=excel.getStringTestData("Login", 0, 1);
		
		Library.custom_SendKeys(login.getEmail(), Email,"Email ID");
		Library.custom_SendKeys(login.getPassword(), Pwd,"Password");
		Library.custom_Click(login.getLoginBtn(),"Login Button");
		
	}

	@Test
	public void verifyLoginwithValidCredentials_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String Email=excel.getStringTestData("Login", 0, 0);
		String Pwd=excel.getStringTestData("Login", 0, 1);
		
		Library.custom_SendKeys(login.getEmail(), Email,"Emal Id");
		Library.custom_SendKeys(login.getPassword(), Pwd , "Password");
		Library.custom_Click(login.getLoginBtn(),"Login Button");
		
	}
}
