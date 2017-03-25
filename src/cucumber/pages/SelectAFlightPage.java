package cucumber.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class SelectAFlightPage extends Helper{

	private WebElement pageTitle;
	private List<WebElement> outFlights;
	private List<WebElement> inFlights;
	private WebElement continueButton;
	
	public void isDisplayed()throws Exception{
		pageTitle = getElementByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > img");
		VerifyAnElementIsDisplayed(pageTitle);
	}
	
	public void selectDepartureFlight(String departureFlight)throws Exception{
		outFlights = getElementsByName("outFlight");
		if (departureFlight.equals("Unified Airlines 363")){
			clickAnElement(outFlights.get(3));
		}else if(departureFlight.equals("Pangaea Airlines 362")){
			clickAnElement(outFlights.get(2));
		}else if(departureFlight.equals("Blue Skies Airlines 361")){
			clickAnElement(outFlights.get(1));
		}else{
			clickAnElement(outFlights.get(0));
		}
	}
	
	public void selectReturnFlight(String returnFlight)throws Exception{
		inFlights = getElementsByName("inFlight");
		if (returnFlight.contains("633")){
			clickAnElement(inFlights.get(3));
		}else if(returnFlight.contains("632")){
			clickAnElement(inFlights.get(2));
		}else if(returnFlight.contains("631")){
			clickAnElement(inFlights.get(1));
		}else{
			clickAnElement(inFlights.get(0));
		}
	}
	
	public BookAFlightPage clickContinueButton()throws Exception{
		continueButton = getElementByName("reserveFlights");
		clickAnElement(continueButton);
		return new  BookAFlightPage();
	}
}
