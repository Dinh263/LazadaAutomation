package pages.ParentPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import customizedLibrary.PropertyUtility;

public class BasePage {
	WebDriver driver;
	WebDriverWait driverWait;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driverWait=new WebDriverWait(driver, 120);
	}
	
	
	public void loadPage(String pageURL) {
		driver.get(pageURL);
	}
	
	private void waitForElement(WebElement element) {
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void setTextForElement(WebElement element, String text) {
		waitForElement(element);
		element.sendKeys(text);
	}
	
	public void clickElement(WebElement element) {
		waitForElement(element);
		element.click();
	}
	
	public void maximazieWindow() {
		driver.manage().window().maximize();
	}
	
	public boolean pageContainsElement(WebElement element) {
		try {
			waitForElement(element);
			return true;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public void setTextForDropDownlist(WebElement element, String text) {
		waitForElement(element);
		Select ddList = new Select(element);
		ddList.selectByVisibleText(text);
	}
	
	public String getTextOfElement(WebElement element) {
		waitForElement(element);
		return element.getText();
	}
	
	public void waitForPageLoad(WebElement element) {
		waitForElement(element);
	}
	
	
}
