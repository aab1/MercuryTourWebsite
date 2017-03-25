package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.BookAFlightPage;
import cucumber.pages.FlightConfirmationPage;
import cucumber.pages.FlightFinderPage;
import cucumber.pages.HomePage;
import cucumber.pages.SelectAFlightPage;

public class LoginAndBookFlightSteps extends Helper{
	HomePage homepage = new HomePage();
	FlightFinderPage  flightFinderPage;
	SelectAFlightPage selectAFlightPage;
	BookAFlightPage bookAFlightPage;
	FlightConfirmationPage flightConfirmationPage;
	
	@When("^I enter my user name \"([^\"]*)\" on the homepage$")
	public void i_enter_my_user_name_on_the_homepage(String username) throws Throwable {
	   homepage.inputUsername(username);
	}

	@When("^I enter my Password \"([^\"]*)\" on the homepage$")
	public void i_enter_my_Password_on_the_homepage(String userPassword) throws Throwable {
	    homepage.inputUsersPassword(userPassword);
	}

	@When("^I click sign-In$")
	public void i_click_sign_In() throws Throwable {
		flightFinderPage = homepage.clickSignIn();
	}

	@When("^I select travel type \"([^\"]*)\"$")
	public void i_select_travel_type(String selectTripTypeFromRadioButton) throws Throwable {
		flightFinderPage.selectFlightType(selectTripTypeFromRadioButton);
	}

	@When("^I select \"([^\"]*)\" passenger$")
	public void i_select_passenger(String numberOfPassengers) throws Throwable {
		flightFinderPage.selectPassengers(numberOfPassengers);
	}

	@When("^I select departing from \"([^\"]*)\" dropdown$")
	public void i_select_departing_from_dropdown(String departFrom) throws Throwable {
		flightFinderPage.selectDepartFrom(departFrom);
	}

	@When("^I select departure month \"([^\"]*)\"$")
	public void i_select_departure_month(String departureMonth) throws Throwable {
		flightFinderPage.selectDepartureMonth(departureMonth);
	}

	@When("^I select departure day \"([^\"]*)\"$")
	public void i_select_departure_day(String departureDay) throws Throwable {
		flightFinderPage.selectDepartureDay(departureDay);
	}

	@When("^I select arriving In \"([^\"]*)\"$")
	public void i_select_arriving_In(String arrivalCity) throws Throwable {
		flightFinderPage.selectArrivingIn(arrivalCity);
	}

	@When("^I select return month \"([^\"]*)\"$")
	public void i_select_return_month(String returnMonth) throws Throwable {
		flightFinderPage.selectReturnMonth(returnMonth);
	}
	
	@When("^I select return day \"([^\"]*)\"$")
	public void i_select_return_day(String inputReturnDay) throws Throwable {
		flightFinderPage.selectReturnDay(inputReturnDay);
	}

	@When("^I Select Service Class \"([^\"]*)\"$")
	public void i_Select_Service_Class(String inputServiceClass) throws Throwable {
		flightFinderPage.selectServiceClass(inputServiceClass);
	}

	@When("^I select airline \"([^\"]*)\"$")
	public void i_select_airline(String inputAirline) throws Throwable {
		flightFinderPage.selectAirline(inputAirline);
		
	}

	@When("^I click continue button on flight finder page$")
	public void i_click_continue_button_on_flight_finder_page() throws Throwable {
		selectAFlightPage = flightFinderPage.clickContinueButton();
		
	}

	@When("^Select flight page is displayed$")
	public void select_flight_page_is_displayed() throws Throwable {
		selectAFlightPage.isDisplayed();
		
	}

	@When("^I select \"([^\"]*)\"flight under depart section$")
	public void i_select_flight_under_depart_section(String departureFlight) throws Throwable {
		selectAFlightPage.selectDepartureFlight(departureFlight);
		
	}

	@When("^I select \"([^\"]*)\"flight under return section$")
	public void i_select_flight_under_return_section(String returnFlight) throws Throwable {
		selectAFlightPage.selectReturnFlight(returnFlight);
	}

	@When("^I click continue button on the select flight page$")
	public void i_click_continue_button_on_the_select_flight_page() throws Throwable {
		bookAFlightPage = selectAFlightPage.clickContinueButton();
	}

	@When("^book a flight page is displayed$")
	public void book_a_flight_page_is_displayed() throws Throwable {
		bookAFlightPage.isPageDisplayed();
	}

	@When("^I enter first name\"([^\"]*)\"$")
	public void i_enter_first_name(String fName) throws Throwable {
		bookAFlightPage.typePassengerOneFirstName(fName);
	}

	@When("^I enter last name\"([^\"]*)\"$")
	public void i_enter_last_name(String lName) throws Throwable {
		bookAFlightPage.typePassengerOneLastName(lName);
	}

	@When("^I select meal \"([^\"]*)\"$")
	public void i_select_meal(String passengerOnemeal) throws Throwable {
		bookAFlightPage.selectPassengerOneMeal(passengerOnemeal);
	}

	@When("^I select card type \"([^\"]*)\"$")
	public void i_select_card_type(String creditCardtype) throws Throwable {
		bookAFlightPage.selectCardType(creditCardtype); 
	}

	@When("^I enter credit card number \"([^\"]*)\"$")
	public void i_enter_credit_card_number(String creditCardNum) throws Throwable {
		bookAFlightPage.typeCreditCardNumber(creditCardNum); 
	}

	@When("^I select the credit card expiration month \"([^\"]*)\"$")
	public void i_select_the_credit_card_expiration_month(String expMonth) throws Throwable {
		bookAFlightPage.selectCardExpMonth(expMonth);
	}

	@When("^I select the credit card expiration year \"([^\"]*)\"$")
	public void i_select_the_credit_card_expiration_year(String expYear) throws Throwable {
		bookAFlightPage.selectCardExpYear(expYear);
	}

	@When("^I enter first name as it appear on credit card \"([^\"]*)\"$")
	public void i_enter_first_name_as_it_appear_on_credit_card(String creditCardFName) throws Throwable {
		bookAFlightPage.firstNameOnCdreditCard(creditCardFName);
	}

	@When("^I enter middle name as it appear on credit card \"([^\"]*)\"$")
	public void i_enter_middle_name_as_it_appear_on_credit_card(String creditCardMName) throws Throwable {
		bookAFlightPage.middleNameOnCdreditCard(creditCardMName); 
	}
	
	@When("^I enter last name on credit card \"([^\"]*)\"$")
	public void i_enter_last_name_on_credit_card(String creditCardlName) throws Throwable {
		bookAFlightPage.lastNameOnCdreditCard(creditCardlName);
	}
	

	@When("^I click the checkbox for ticketless travel$")
	public void i_click_the_checkbox_for_ticketless_travel() throws Throwable {
		bookAFlightPage.clickTicketlessTravelCheckBox();
	}

	@When("^I enter the firstline of the credit card billing address\"([^\"]*)\"$")
	public void i_enter_the_firstline_of_the_credit_card_billing_address(String address) throws Throwable {
		bookAFlightPage.billingAddressFirstLine(address);
	}

	@When("^I enter the secondline of the credit card billing address\"([^\"]*)\"$")
	public void i_enter_the_secondline_of_the_credit_card_billing_address(String address2) throws Throwable {
		bookAFlightPage.billingAddressSecondLine(address2);Thread.sleep(2000);
	}

	@When("^I enter the city of the credit card billing address\"([^\"]*)\"$")
	public void i_enter_the_city_of_the_credit_card_billing_address(String addCity) throws Throwable {
		bookAFlightPage.typeBillingAddressCity(addCity);
	}

	@When("^I enter the state or province from the credit card billing address\"([^\"]*)\"$")
	public void i_enter_the_state_or_province_from_the_credit_card_billing_address(String enterBillState) throws Throwable {
		bookAFlightPage.enterBillState(enterBillState);
	}

	@When("^I enter the postcode of the billing address \"([^\"]*)\"$")
	public void i_enter_the_postcode_of_the_billing_address(String inputPostcode) throws Throwable {
		bookAFlightPage.enterBillPostCode(inputPostcode);
	}

	@When("^I select the country \"([^\"]*)\"$")
	public void i_select_the_country(String country) throws Throwable {
		bookAFlightPage.selectBillCountry(country); 
	}

	@When("^I click the check box for the same billing address$")
	public void i_click_the_check_box_for_the_same_billing_address() throws Throwable {
		bookAFlightPage.clickCheckBoxForSameBillingAddress();
	}

	@When("^I click the secure purchase button$")
	public void i_click_the_secure_purchase_button() throws Throwable {
		flightConfirmationPage = bookAFlightPage.clickSecurePurchaseButton();
	}

	@Then("^the Flight Confirmation page is displayed$")
	public void the_Flight_Confirmation_page_is_displayed() throws Throwable {
		flightConfirmationPage.isPageDisplayed();
	}

	@Then("^Flight confirmation number is displayed$")
	public void flight_confirmation_number_is_displayed() throws Throwable {
	   
	}


}
