package cucumber.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class BookAFlightPage extends Helper{
	
	private WebElement pageTitle;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement mealForPassengerOne;
	private WebElement cardType;
	private WebElement creditCardNumber;
	private WebElement creditCardExpMonth;
	private WebElement creditCardExpYear;
	private WebElement creditCardFirstName;
	private WebElement creditCardMidleName;
	private WebElement creditCardLastName;
	private WebElement ticetlessCheckBox;
	private WebElement addressline1;
	private WebElement addressline2;
	private WebElement addressCity;
	private WebElement billState;
	private WebElement postcode;
	private WebElement billCountry;
	private WebElement sameBillingAddress;
	private WebElement securePurchaseButton;
	private WebDriver driver;
	
	
	public void isPageDisplayed()throws Exception{
		pageTitle = getElementByCssSelector("[src=\"/images/masts/mast_book.gif\"]");
		VerifyAnElementIsDisplayed(pageTitle);
	}
	
	public void typePassengerOneFirstName(String fName)throws Exception{
		firstName = getElementByName("passFirst0");
		typeGivenValueInto(firstName, fName);
	}
	
	public void typePassengerOneLastName(String lName)throws Exception{
		lastName = getElementByName("passLast0");
		typeGivenValueInto(lastName, lName);
	}
	
	public void selectPassengerOneMeal(String passengerOnemeal)throws Exception{
		mealForPassengerOne = getElementByName("pass.0.meal");
		selectByText(mealForPassengerOne, passengerOnemeal);
	}
	
	public void selectCardType(String creditCardtype)throws Exception{
		cardType = getElementByName("creditCard");
		selectByText(cardType, creditCardtype);
	}
	
	public void typeCreditCardNumber(String creditCardNum)throws Exception{
		creditCardNumber = getElementByName("creditnumber");
		typeGivenValueInto(creditCardNumber, creditCardNum);
	}
	
	public void selectCardExpMonth(String expMonth)throws Exception{
		creditCardExpMonth = getElementByName("cc_exp_dt_mn");
		selectByText(creditCardExpMonth, expMonth);
	}
	
	public void selectCardExpYear(String expYear)throws Exception{
		creditCardExpYear = getElementByName("cc_exp_dt_yr");
		selectByText(creditCardExpYear, expYear);
	}
	
	public void firstNameOnCdreditCard(String creditCardFName)throws Exception{
		creditCardFirstName = getElementByName("cc_frst_name");
		typeGivenValueInto(creditCardFirstName, creditCardFName);
	}
	
	public void middleNameOnCdreditCard(String creditCardMName)throws Exception{
		creditCardMidleName = getElementByName("cc_mid_name");
		typeGivenValueInto(creditCardMidleName, creditCardMName);
	}
	
	public void lastNameOnCdreditCard(String creditCardlName)throws Exception{
		creditCardLastName = getElementByName("cc_last_name");
		typeGivenValueInto(creditCardLastName, creditCardlName);
	}
	
	public void clickTicketlessTravelCheckBox()throws Exception{
		ticetlessCheckBox = getElementByName("ticketLess");
		clickAnElement(ticetlessCheckBox);
	}
	
	public void billingAddressFirstLine(String address)throws Exception{
		addressline1 = getElementByName("billAddress1");
		typeGivenValueInto(addressline1, address);
	}
	
	public void billingAddressSecondLine(String address2)throws Exception{
		addressline2 = getElementByName("billAddress2");
		typeGivenValueInto(addressline2, address2);
	}
	
	public void typeBillingAddressCity(String addCity)throws Exception{
		addressCity = getElementByName("billCity");
		typeGivenValueInto(addressCity, addCity);
	}
	
	public void enterBillState(String enterBillState)throws Exception{
		billState = getElementByName("billState");
		typeGivenValueInto(billState, enterBillState);
	}
	
	public void enterBillPostCode(String inputPostcode)throws Exception{
		postcode = getElementByName("billZip");
		typeGivenValueInto(postcode, inputPostcode);
	}
	
	public void selectBillCountry(String country) throws Exception{
		billCountry = getElementByName("delCountry");
		selectByText(billCountry, country);	
	}
	
	public void clickCheckBoxForSameBillingAddress()throws Exception{
		try{
			sameBillingAddress = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input");
			clickAnElement(sameBillingAddress);
		}catch(Exception e){
			acceptAlert();
			sameBillingAddress = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input");
			clickAnElement(sameBillingAddress);
		}
		
	}
	public FlightConfirmationPage clickSecurePurchaseButton()throws Exception{
		securePurchaseButton = getElementByName("buyFlights");
		clickAnElement(securePurchaseButton);
		return new FlightConfirmationPage();
	}
	
}
