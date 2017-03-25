package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;
import junit.framework.Assert;

public class FlightConfirmationPage extends Helper{
	
	private boolean flightConfirmation;
	
	public void isPageDisplayed() throws Exception{
		//itinerary has been booked!
		flightConfirmation = getPageSource().contains("itinerary has been booked!");
		Assert.assertTrue("Flight Confirmation page is NOT displayed",flightConfirmation);
	}
	
	// you can write the flight confirmation nunber into a file or spreadsheet
	
	public void isFlightConfirmationNumberDisplayed()throws Exception{
		       
	}
}
