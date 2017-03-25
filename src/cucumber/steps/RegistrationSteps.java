package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.FlightFinderPage;
import cucumber.pages.HomePage;
import cucumber.pages.RegisterationConfirmationPage;
import cucumber.pages.RegisterationPage;
import cucumber.pages.SignOnPage;

public class RegistrationSteps extends Helper{
	//create an object of homepage here
	HomePage homepage = new HomePage();
	RegisterationPage registerationPage;
	RegisterationConfirmationPage registerationConfirmationPage;
	SignOnPage signOnPage;
	FlightFinderPage flightFinderPage;
	
	@Given("^I navigate to mercury tour website$")
	public void i_navigate_to_mercury_tour_website() throws Throwable {
	    homepage.navigateToMercuryHomepage();
	}

	@Given("^mercury tour logo is displayed$")
	public void mercury_tour_logo_is_displayed() throws Throwable {
	  homepage.isMecuryTourLogoDisplayed();
	}
	
	@When("^I click register$")
	public void i_click_register() throws Throwable {
		registerationPage = homepage.clickRegisterLink();
	}

	@When("^I enter my first name \"([^\"]*)\"$")
	public void i_enter_my_first_name(String first_Name) throws Throwable {
		registerationPage.enterFirstName(first_Name);
	}

	@When("^I enter my last name \"([^\"]*)\"$")
	public void i_enter_my_last_name(String last_Name) throws Throwable {
		registerationPage.enterLastName(last_Name); 
	}

	@When("^I enter my phone number \"([^\"]*)\"$")
	public void i_enter_my_phone_number(String phonenumber) throws Throwable {
		registerationPage.enterPhoneNumber(phonenumber); 
	}
	
	@When("^I enter email address \"([^\"]*)\"$")
	public void i_enter_email_address(String email) throws Throwable {
		registerationPage.enterEmail(email);
	}
	
	@When("^I enter the firstline of my adress \"([^\"]*)\"$")
	public void i_enter_the_firstline_of_my_adress(String address_lineOne) throws Throwable {
		registerationPage.enterAddressLineOne(address_lineOne);
	}

	@When("^I enter the second line of my address \"([^\"]*)\"$")
	public void i_enter_the_second_line_of_my_address(String address_lineTwo) throws Throwable {
		registerationPage.enterAddressLineTwo(address_lineTwo);
	}

	@When("^I enter my city \"([^\"]*)\"$")
	public void i_enter_my_city(String city) throws Throwable {
		registerationPage.enterCityName(city);
	}
	
	@When("^I enter my state  or province \"([^\"]*)\"$")
	public void i_enter_my_state_or_province(String stateOrProvince) throws Throwable {
		registerationPage.enterStateOrProvince(stateOrProvince);
	}

	@When("^I enter my postcode \"([^\"]*)\"$")
	public void i_enter_my_postcode(String postcode) throws Throwable {
		registerationPage.enterPostcode(postcode);
	}

	@When("^I select country \"([^\"]*)\"$")
	public void i_select_country(String countryName) throws Throwable {
		registerationPage.selectCountry(countryName);
	}

	@When("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String username) throws Throwable {
		registerationPage.enterUserName(username);
	}

	@When("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String enterPassword) throws Throwable {
		registerationPage.enterPassword(enterPassword);
	}

	@When("^I enter confirm password \"([^\"]*)\"$")
	public void i_enter_confirm_password(String enterConfirmPassword) throws Throwable {
		registerationPage.enterConfirmPassword(enterConfirmPassword);
	}

	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		registerationPage.clickSubmit();
	}

	@Then("^my registration is successful$")
	public void my_registration_is_successful() throws Throwable {
		registerationConfirmationPage = registerationPage.isRegisterationConfirmationPageDisplayed();
	}

	@Then("^I click the sign-in link$")
	public void i_click_the_sign_in_link() throws Throwable {
		signOnPage = registerationConfirmationPage.clickSignInLink();
	}

	@Then("^the sign-on page displayed$")
	public void the_sign_on_page_displayed() throws Throwable {
		signOnPage.isSignOnPageDisplayed();
	}
	
	

	@Then("^I sign-on successfully$")
	public void i_sign_on_successfully() throws Throwable {
		signOnPage.isSignOnPageDisplayed();
	}




}
