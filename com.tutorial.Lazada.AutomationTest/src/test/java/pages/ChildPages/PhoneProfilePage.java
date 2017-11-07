package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ChildPages.DashBoards.DashBoardCustomer;

public class PhoneProfilePage extends DashBoardCustomer {

	@FindBy(xpath="//div[contains(text(),'A verification email has been sent to']")
	WebElement lbel_Verification;
	
	public PhoneProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isPageLoadCorrect() {
		return pageContainsElement(lbel_Verification);
	}
	

}
