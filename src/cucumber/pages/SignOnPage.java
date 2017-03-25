package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class SignOnPage extends Helper{
	WebElement signOnLogo;
	WebElement user_name;
	WebElement signInPassword;
	WebElement submitButtonToLogin;
	
	
	public void isSignOnPageDisplayed()throws Exception{
		signOnLogo = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
		VerifyAnElementIsDisplayed(signOnLogo);
	}
	
	public void enterUserNameToSignIn(String signUserName)throws Exception{
		user_name = getElementByName("userName");
		typeGivenValueInto(user_name, signUserName);
	}
	
	public void enterPasswordToSignIn(String password)throws Exception{
		signInPassword = getElementByName("password"); 
		typeGivenValueInto(signInPassword, password);
	}
	
	public FlightFinderPage clickSignInSubmitButton()throws Exception{
		submitButtonToLogin = getElementByName("login");
		clickAnElement(submitButtonToLogin);
		return new FlightFinderPage();
	}
	
	
}
