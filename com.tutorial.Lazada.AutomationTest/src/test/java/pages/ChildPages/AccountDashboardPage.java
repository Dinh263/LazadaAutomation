package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ChildPages.DashBoards.DashBoardCustomer;

public class AccountDashboardPage extends DashBoardCustomer {

	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	WebElement btnEdit;
	
	
	
	
	public AccountDashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private void clickEditButton() {
		clickElement(btnEdit);
	}
	
	
	public void changePersonalInformation() {
		clickEditButton();
	}

}
