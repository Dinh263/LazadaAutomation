package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.util.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import customizedLibrary.EnviromentSetting;
import customizedLibrary.PropertyUtility;
import dataMapping.DataTC03_ChangeEmail;
import pages.ChildPages.AccountDashboardPage;
import pages.ChildPages.LoginPage;
import pages.ChildPages.PersonalInformation;
import pages.ChildPages.PhoneProfilePage;
import pages.ChildPages.UpdateEmailPage;
import pages.ChildPages.DashBoards.DashBoardCustomer;
import pages.ChildPages.DashBoards.DashboardPage;

public class TC04_ChangePhoneNumber {
	WebDriver driver;
	DashboardPage dashboardpage;
	LoginPage loginpage;
	DashBoardCustomer dashboardCustomer;
	AccountDashboardPage accountdashboardpage;
	PersonalInformation personpage;
	PhoneProfilePage phonepage;
	
	
	DataTC03_ChangeEmail data;
	
	
	String email;
	String password;
	String updateEmail;
	
	@BeforeTest
	public void openBrowser() throws IOException {
		EnviromentSetting.setGeckoDriverPath();
		initiateDataForTesting();
		driver = new FirefoxDriver();
	}
	
	
	@BeforeMethod
	public void goToAccountProfile() throws IOException {
		dashboardpage =  new DashboardPage(driver);
		dashboardpage.loadPage(PropertyUtility.getBaseUrl());
		dashboardpage.maximazieWindow();
		dashboardpage.loginAccount();
		loginpage = new LoginPage(driver);
		loginpage.loginToApplication(email,password);		
		dashboardCustomer = new DashBoardCustomer(driver);
		dashboardCustomer.UpdateAccountSetting();
	}
	
	@Test
	public void signUpAnAccount() throws IOException {
		accountdashboardpage = new AccountDashboardPage(driver);
		accountdashboardpage.changePersonalInformation();
		personpage = new PersonalInformation(driver);	
		personpage.changePhonenumber();
		phonepage= new PhoneProfilePage(driver);
		org.testng.Assert.assertTrue(phonepage.isPageLoadCorrect());
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("done");
		driver.quit();
	}
	
	
	public void initiateDataForTesting() throws IOException {
		data = new DataTC03_ChangeEmail(PropertyUtility.getDataFileNameWithPath());	
		email=data.getEmail();
		password=data.getPassword();		
	}
	
}
