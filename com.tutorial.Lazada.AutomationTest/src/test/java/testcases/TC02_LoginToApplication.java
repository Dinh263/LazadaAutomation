package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import customizedLibrary.EnviromentSetting;
import customizedLibrary.PropertyUtility;

import dataMapping.DataTC02_LoginToApplication;
import pages.ChildPages.DashBoards.*;
import pages.ChildPages.LoginPage;


public class TC02_LoginToApplication {
	
	WebDriver driver;
	
	DashboardPage dashboardpage;
	DataTC02_LoginToApplication data;
	LoginPage loginpage;
	
	
	String email;
	String password;
	
	
	
	@BeforeTest
	public void openBrowser() throws IOException {
		EnviromentSetting.setGeckoDriverPath();
		initiateDataForTesting();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void signUpAnAccount() throws IOException {
		dashboardpage =  new DashboardPage(driver);
		dashboardpage.loadPage(PropertyUtility.getBaseUrl());
		dashboardpage.maximazieWindow();
		dashboardpage.loginAccount();
		loginpage = new LoginPage(driver);
		loginpage.loginToApplication(email, password);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("done");
		driver.quit();
	}
	
	public void initiateDataForTesting() throws IOException {
		data = new DataTC02_LoginToApplication(PropertyUtility.getDataFileNameWithPath());	
		email=data.getEmail();
		password=data.getPassword();
		
	}
}
