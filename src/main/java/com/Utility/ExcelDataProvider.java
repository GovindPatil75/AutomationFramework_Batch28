package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationFramework_Batch28\\TestData\\Data.xlsx";
	
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
		
	}
	
	public String getStringTestData(String Sheetname ,int row,int cell) {
		
	   return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}

}
