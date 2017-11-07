package pages.ChildPages.DashBoards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ParentPage.BasePage;

public class DashBoardCustomer extends BasePage {
	
	@FindBy(xpath="//span[contains(text(),'account')]")
	WebElement linkAccount;
	
	
	@FindBy(linkText="Manage My Account")
	WebElement linkManageAccount;
	
	public DashBoardCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private void NavigateAccountSetting() {
		clickElement(linkAccount);
	}
	
	public void UpdateAccountSetting() {
		NavigateAccountSetting();
		clickElement(linkManageAccount);
	}
	
	
	

	
	

}
