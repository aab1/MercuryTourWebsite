package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class RegisterationPage extends Helper{
	//private WebDriver driver;
	WebElement usersfirstName;
	WebElement usersLaststName;
	WebElement phoneNum;
	WebElement usersEmail;
	WebElement userslineOneAddress;
	WebElement userslineTwoAddress;
	WebElement cityName;
	WebElement stateOrProvinceName;
	WebElement postCode;
	WebElement country;
	WebElement userName;
	WebElement password;
	WebElement confirmPassword;
	WebElement submitButton;
	WebElement signInLink;
	
	
	public void enterFirstName(String first_Name) throws Exception{
		usersfirstName = getElementByName("firstName");
		typeGivenValueInto(usersfirstName, first_Name);
	}
	
	public void enterLastName(String last_Name) throws Exception{
		usersLaststName = getElementByName("lastName");
		typeGivenValueInto(usersLaststName, last_Name);
	}
	
	public void enterPhoneNumber(String phoneNumber)throws Exception{
		phoneNum = getElementByName("phone");
		typeGivenValueInto(phoneNum, phoneNumber);
	}
	
	public void enterEmail(String email_id)throws Exception{
		usersEmail = getElementById("userName");
		typeGivenValueInto(usersEmail, email_id);
	}
	
	public void enterAddressLineOne(String addressLineOne)throws Exception{
		userslineOneAddress = getElementByName("address1");
		typeGivenValueInto(userslineOneAddress, addressLineOne);
	}
	
	public void enterAddressLineTwo(String addressLineTwo)throws Exception{
		userslineTwoAddress = getElementByName("address2");
		typeGivenValueInto(userslineOneAddress, addressLineTwo);
	}
	
	public void enterCityName(String city)throws Exception{
		cityName = getElementByName("city");
		typeGivenValueInto(cityName, city);
	}
	
	public void enterStateOrProvince(String stateOrProvince)throws Exception{
		stateOrProvinceName = getElementByName("state");
		typeGivenValueInto(stateOrProvinceName, stateOrProvince);
	}
	
	public void enterPostcode(String postcode)throws Exception{
		postCode = getElementByName("postalCode");
		typeGivenValueInto(postCode, postcode);
	}
	public void selectCountry(String countryName)throws Exception{
		country = getElementByName("country");
		selectByText(country, countryName.toUpperCase());
	}
	
	public void enterUserName(String username)throws Exception{
		userName = getElementById("email");
		typeGivenValueInto(userName, username);
	}
	public void enterPassword(String enterPassword)throws Exception{
		password = getElementByName("password");
		typeGivenValueInto(password, enterPassword);
	}
	public void enterConfirmPassword(String enterConfirmPassword)throws Exception{
		confirmPassword = getElementByName("confirmPassword");	
		typeGivenValueInto(confirmPassword, enterConfirmPassword);
	}
	
	public void clickSubmit()throws Exception{
		 submitButton = getElementByName("register");
		 clickAnElement(submitButton);
	}
	
	public RegisterationConfirmationPage isRegisterationConfirmationPageDisplayed()throws Exception{
		signInLink = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]");
		VerifyAnElementIsDisplayed(signInLink);
		//Assert.assertTrue("The registration confirmation page does NOT display the correct content", (driver.getPageSource().contains("Thank you for registering")));
		return new RegisterationConfirmationPage();
	}
	

	
}
