package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ChildPages.DashBoards.DashboardPage;

public class SignUpPage extends DashboardPage {

	@FindBy(xpath="//input[@value='male']")
	WebElement rdioMale;
	
	@FindBy(xpath="//input[@value='female']")
	WebElement rdioFeMale;
	
	@FindBy(xpath="//input[@id='RegistrationForm_email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='RegistrationForm_first_name']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//select[@id='RegistrationForm_day']")
	WebElement ddDay;
	
	
	@FindBy(xpath="//select[@id='RegistrationForm_month']")
	WebElement ddMonth;
	
	@FindBy(xpath="//select[@id='RegistrationForm_year']")
	WebElement ddYear;
	
	@FindBy(xpath="//input[@id='RegistrationForm_password']")
	WebElement txtPass;
	
	
	@FindBy(xpath="//input[@id='RegistrationForm_password2']")
	WebElement txtConfirmPass;
	
	@FindBy(xpath="//button[@id='send']")
	WebElement btnSubmit;
	
	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private void checkMaleCheckBox() {
		clickElement(rdioMale);
	}
	
	private void checkFeMaleCheckBox() {
		clickElement(rdioFeMale);
	}
	
	private void setEmail(String email) {
		setTextForElement(txtEmail, email);
	}
	
	private void setFirstName(String firstname) {
		setTextForElement(txtFirstName, firstname);
	}
	
	private void selectDayOfBirth(String day) {
		setTextForDropDownlist(ddDay, day);
	}
	
	private void selectMonthOfBirth(String month) {
		setTextForDropDownlist(ddMonth, month);
	}
	
	private void selectYearOfBirth(String year) {
		setTextForDropDownlist(ddYear, year);
	}
	
	private void setPassWord(String password) {
		setTextForElement(txtPass, password);
	}
	
	private void setConfirmPassWord(String password) {
		setTextForElement(txtConfirmPass, password);
	}
	
	private void clickSubmitButton() {
		clickElement(btnSubmit);
	}
	
	
	
	public void createNewAccount(boolean gender,String email, String firstname, String day, String month, String year, String password) {
		if (gender==true) {
			checkMaleCheckBox();
		}else {
			checkFeMaleCheckBox();
		}
		
		setEmail(email);
		setFirstName(firstname);
		selectDayOfBirth(day);
		selectMonthOfBirth(month);
		selectYearOfBirth(year);
		setPassWord(password);
		setConfirmPassWord(password);
		clickSubmitButton();
	}
	
	

}
