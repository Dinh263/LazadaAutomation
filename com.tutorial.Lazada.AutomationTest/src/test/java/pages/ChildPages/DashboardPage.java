package pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ParentPage.BasePage;

public class DashboardPage extends BasePage {

	@FindBy(linkText="Signup")
	WebElement lnkSignUp;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void signUpAccount() {
		clickElement(lnkSignUp);
	}
	
	

}
