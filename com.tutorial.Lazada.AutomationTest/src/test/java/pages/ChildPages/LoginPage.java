package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ChildPages.DashBoards.DashboardPage;

public class LoginPage extends DashboardPage {

	@FindBy(xpath="//input[@id='LoginForm_email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='LoginForm_password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	WebElement btnLogin;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private void setEmail(String email) {
		setTextForElement(txtEmail, email);
	}
	
	private void setPassword(String password) {
		setTextForElement(txtPassword, password);
	}
	
	private void clickLoginButton() {
		clickElement(btnLogin);
	}
	
	public void loginToApplication(String email, String password) {
		setEmail(email);
		setPassword(password);
		clickLoginButton();
	}
	
	
	

}
