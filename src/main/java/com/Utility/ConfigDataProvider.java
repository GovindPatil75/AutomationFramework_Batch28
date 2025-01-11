package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String location="C:\\Users\\Dell\\eclipse-workspace\\AutomationFramework_Batch28\\Config\\config.Properties";
		FileInputStream fis=new FileInputStream(location);
		pro=new Properties();
		pro.load(fis);
	}

	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
}
