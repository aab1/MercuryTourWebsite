package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.helper.Helper;
import cucumber.pages.FlightFinderPage;
import cucumber.pages.HomePage;
import cucumber.pages.SignOnPage;

public class LoginSteps extends Helper{
	SignOnPage signOnPage = new SignOnPage();
	FlightFinderPage flightFinderPage = new FlightFinderPage();
	HomePage homepage = new HomePage();
	
	@Given("^I click the sign-on button$")
	public void i_click_the_sign_on_button() throws Throwable {
		signOnPage = homepage.clickSignON();
	}
	
	@Given("^the sign-on page displayed correctly$")
	public void the_sign_on_page_displayed_correctly() throws Throwable {
		signOnPage.isSignOnPageDisplayed();
	}
	@Then("^I enter my user name \"([^\"]*)\"$")
	public void i_enter_my_user_name(String signUserName) throws Throwable {
		signOnPage.enterUserNameToSignIn(signUserName);
	}
	
	@Then("^I enter my Password \"([^\"]*)\"$")
	public void i_enter_my_Password(String password) throws Throwable {
		signOnPage.enterPasswordToSignIn(password);
	}
	
	@Then("^I click signInSubmitButton$")
	public void i_click_signInSubmitButton() throws Throwable {
		flightFinderPage = signOnPage.clickSignInSubmitButton();
	}
	@Then("^the flight finder page displayed correctly$")
	public void the_flight_finder_page_displayed_correctly() throws Throwable {
		flightFinderPage.isFlightFinderPageDisplayed();
	}
}
