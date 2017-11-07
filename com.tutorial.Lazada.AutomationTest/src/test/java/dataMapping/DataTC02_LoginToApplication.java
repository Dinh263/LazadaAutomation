package dataMapping;

import java.io.IOException;

import customizedLibrary.ExcelUtility;

public class DataTC02_LoginToApplication {
	ExcelUtility excelobj;
	public final String SHEETNAME = "TC02_LoginToApplication";

	public DataTC02_LoginToApplication(String fileName) throws IOException {
		excelobj =  new ExcelUtility(fileName, SHEETNAME);
	}
	
	
	public String getEmail() {
		return excelobj.getValueAt(0, 1);
	}
	
	
	public String getPassword() {
		return excelobj.getValueAt(1, 1);
	}
		
	
	
}
