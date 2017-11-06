package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import customizedLibrary.EnviromentSetting;
import customizedLibrary.PropertyUtility;
import pages.ChildPages.DashboardPage;
import pages.ChildPages.SignUpPage;

public class TC01_SignUpAnAccount {
	
	WebDriver driver;
	DashboardPage dashboardpage;
	SignUpPage signuppage;
	
	@BeforeTest
	public void openBrowser() throws IOException {
		EnviromentSetting.setGeckoDriverPath();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void signUpAnAccount() throws IOException {
		dashboardpage =  new DashboardPage(driver);
		dashboardpage.loadPage(PropertyUtility.getBaseUrl());
		dashboardpage.maximazieWindow();
		dashboardpage.signUpAccount();
		signuppage = new SignUpPage(driver);
		signuppage.createNewAccount(true,"user003@gmail.com","John david","30","March","1972","123456789aA");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("done");
		driver.quit();
	}

}
