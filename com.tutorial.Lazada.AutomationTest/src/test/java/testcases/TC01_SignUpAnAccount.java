package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import customizedLibrary.EnviromentSetting;
import customizedLibrary.PropertyUtility;
import dataMapping.DataTC01_SignUpAnAccount;
import pages.ChildPages.DashBoards.DashboardPage;
import pages.ChildPages.SignUpPage;

public class TC01_SignUpAnAccount {
	
	WebDriver driver;
	pages.ChildPages.DashBoards.DashboardPage dashboardpage;
	SignUpPage signuppage;
	DataTC01_SignUpAnAccount data;
	
	
	boolean gender;
	String email;
	String fullName;
	String dayOfBirth;
	String monthOfBirth;
	String yearoOfBirth;
	String password;
	
	
	@BeforeTest
	public void openBrowser() throws IOException {
		EnviromentSetting.setGeckoDriverPath();
		initiateDataForTesting();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void signUpAnAccount() throws IOException {
		dashboardpage =  new pages.ChildPages.DashBoards.DashboardPage(driver);
		dashboardpage.loadPage(PropertyUtility.getBaseUrl());
		dashboardpage.maximazieWindow();
		dashboardpage.signUpAccount();
		signuppage = new SignUpPage(driver);
		//signuppage.createNewAccount(true,"user003@gmail.com","John david","30","March","1972","123456789aA");
		signuppage.createNewAccount(gender, email, fullName, dayOfBirth, monthOfBirth, yearoOfBirth, password);
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("done");
		//driver.quit();
	}
	
	public void initiateDataForTesting() throws IOException {
		data = new DataTC01_SignUpAnAccount(PropertyUtility.getDataFileNameWithPath());
		if(data.getGender().equals("Male")) {
			gender=true;
		}
		else {
			gender=false;
		}
		email=data.getEmail();
		fullName=data.getFullName();
		dayOfBirth=data.getDay();
		monthOfBirth=data.getMonth();
		yearoOfBirth=data.getYear();
		password=data.getPassword();
		
	}

}
