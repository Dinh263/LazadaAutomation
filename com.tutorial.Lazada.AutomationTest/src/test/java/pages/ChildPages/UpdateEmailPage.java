package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ChildPages.DashBoards.DashBoardCustomer;

public class UpdateEmailPage extends DashBoardCustomer {

	
	@FindBy(css="input[id=EmailForm_email]")
	WebElement txtEmai; 
	
	
	@FindBy(css="button[id=send]")
	WebElement btnSave;
	
	public UpdateEmailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private void setNewEmail(String email) {
		setTextForElement(txtEmai, email);
	}
	
	private void clickSaveButton() {
		clickElement(btnSave);
	}
	
	public void updateNewEmail(String email) {
		setNewEmail(email);
		clickSaveButton();
	}

}
