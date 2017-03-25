package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class RegisterationConfirmationPage extends Helper{
	WebElement signInLink;
	
	public SignOnPage clickSignInLink()throws Exception{
		signInLink = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]");
		clickAnElement(signInLink);
		return new SignOnPage();
	}
	
	
}
