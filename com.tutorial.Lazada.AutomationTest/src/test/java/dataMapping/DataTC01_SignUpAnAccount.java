package dataMapping;

import java.io.IOException;

import org.apache.tools.ant.taskdefs.Exec;

import customizedLibrary.ExcelUtility;

public class DataTC01_SignUpAnAccount {
	ExcelUtility excelobj;
	public final String SHEETNAME = "TC01_SIGNUPANACCOUNT";
	
	public DataTC01_SignUpAnAccount(String fileName) throws IOException {
		excelobj =  new ExcelUtility(fileName, SHEETNAME);
	}
	
	public  String getGender() {
		return excelobj.getValueAt(0, 1);
	}
	
	public String getEmail() {
		return excelobj.getValueAt(1, 1);
	}
	
	public String getFullName() {
		return excelobj.getValueAt(2, 1);
	}
	
	public String getDay() {
		return excelobj.getValueAt(3, 1);
	}
	
	public String getMonth() {
		return excelobj.getValueAt(4, 1);
	}
	
	public String getYear() {
		return excelobj.getValueAt(5, 1);
	}
	
	public String getPassword() {
		return excelobj.getValueAt(6, 1);
	}
	
	
	
	
	
}
