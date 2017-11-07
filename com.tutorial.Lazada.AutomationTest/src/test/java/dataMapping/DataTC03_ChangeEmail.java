package dataMapping;

import java.io.IOException;

import customizedLibrary.ExcelUtility;

public class DataTC03_ChangeEmail {
	ExcelUtility excelobj;
	public final String SHEETNAME = "TC03_ChangeEmail";

	public DataTC03_ChangeEmail(String fileName) throws IOException {
		excelobj =  new ExcelUtility(fileName, SHEETNAME);
	}
	
	
	public String getEmail() {
		return excelobj.getValueAt(0, 1);
	}
	
	
	public String getPassword() {
		return excelobj.getValueAt(1, 1);
	}
	
	public String getUpdateEmail() {
		return excelobj.getValueAt(2, 1);
	}
}
