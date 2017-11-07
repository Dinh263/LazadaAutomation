package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ChildPages.DashBoards.DashBoardCustomer;

public class PersonalInformation extends DashBoardCustomer {

	@FindBy(xpath="//a[contains(text(),'Change Email')]")
	WebElement lnkChangeEmail;
	
	@FindBy(xpath="//a[contains(text(),'Add your phone number')]")
	WebElement lnkChangePhoneNumber;
	
	public PersonalInformation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private void clickChangeEmailLink() {
		clickElement(lnkChangeEmail);
	}
	
	private void clickChangePhoneNumber() {
		clickElement(lnkChangePhoneNumber);
	}
	
	public void changeEmail() {
		clickChangeEmailLink();
	}
	
	public void changePhonenumber() {
		clickChangePhoneNumber();
	}
	

}
