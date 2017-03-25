package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class HomePage extends Helper{
	WebElement logo;
	WebElement registerationLink;
	WebElement signOnLink;
	WebElement userName;
	WebElement password;
	WebElement signIn;
	
	public void navigateToMercuryHomepage() throws Exception{
		launchUrl("http://newtours.demoaut.com/mercurywelcome.php");
	}
	
	public void isMecuryTourLogoDisplayed() throws Exception{
		logo = getElementByXPath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img");
		VerifyAnElementIsDisplayed(logo);
	}
	
	public RegisterationPage clickRegisterLink() throws Exception{
		registerationLink = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
		clickAnElement(registerationLink);
		return new RegisterationPage();
	}
	
	public SignOnPage clickSignON()throws Exception{
		signOnLink = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a");
		clickAnElement(signOnLink);
		return new SignOnPage();
	}
	
	public void inputUsername(String username)throws Exception{
		userName = getElementByName("userName");
		typeGivenValueInto(userName, username);
	}
	
	public void inputUsersPassword(String userPassword)throws Exception{
		password = getElementByName("password");
		typeGivenValueInto(password, userPassword);
	}
	
	public FlightFinderPage clickSignIn()throws Exception{
		//signIn = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input");
		signIn = getElementByName("login");
		clickAnElement(signIn);
		return new FlightFinderPage();
	}
	
}

