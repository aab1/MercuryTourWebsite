package cucumber.pages;




import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class FlightFinderPage extends Helper{
	private WebElement flightFinderLogo;
	private WebElement flightTypeRadioButtons;
	private WebElement numOfPassengers;
	private WebElement departingFrom;
	private WebElement departingMonth;
	private WebElement departingDay;
	private WebElement destinationCity;
	private WebElement returnMonth;
	private WebElement returnDay;
	private List<WebElement>serviceClassRadioButtons;
	private WebElement airline;
	private WebElement continueButton;
	
	
	public void isFlightFinderPageDisplayed()throws Exception{
		flightFinderLogo = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
		VerifyAnElementIsDisplayed(flightFinderLogo);
	}
	
	public void selectFlightType(String selectedTripType)throws Exception{
		try{
			if(selectedTripType.equals("oneway")){
				flightTypeRadioButtons = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");
				clickAnElement(flightTypeRadioButtons);
				System.out.println(selectedTripType+ " clicked");
				
			}else{
				flightTypeRadioButtons = getElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]");
				clickAnElement(flightTypeRadioButtons);
				System.out.println(selectedTripType+ " clicked");
				
			}
			
		}catch(Exception e){
			
			System.out.println("There is a problem with the radio button");
		}
		
	}
	
	public void selectPassengers(String numberOfPassengers)throws Exception{
		numOfPassengers = getElementByName("passCount");
		selectByText(numOfPassengers, numberOfPassengers);
	}
	
	public void selectDepartFrom(String departFrom)throws Exception{
		departingFrom = getElementByName("fromPort");
		selectByText(departingFrom, departFrom);
	}
	
	public void selectDepartureMonth(String departureMonth)throws Exception{
		departingMonth = getElementByName("fromMonth");
		selectByText(departingMonth, departureMonth);
	}
	public void selectDepartureDay(String departureDay)throws Exception{
		departingDay = getElementByName("fromDay");
		selectByText(departingDay, departureDay);
	}
	public void selectArrivingIn(String arrivalCity)throws Exception{
		destinationCity = getElementByName("toPort");
		selectByText(destinationCity, arrivalCity);
	}
	public void selectReturnMonth(String inputReturnMonth)throws Exception{
		returnMonth = getElementByName("toMonth");
		selectByValue(returnMonth, inputReturnMonth); 
		//selectByText(returnMonth, "inputReturnMonth");
	}
	
	public void selectReturnDay(String inputReturnDay)throws Exception{
		returnDay = getElementByName("toDay");
		selectByText(returnDay, inputReturnDay);
	}
	
	public void selectServiceClass(String inputServiceClass)throws Exception{
		serviceClassRadioButtons = getElementsByName("servClass");
		if(inputServiceClass.equals("Economy class")){
			serviceClassRadioButtons.get(0).click();
		}else if(inputServiceClass.equals("Business class")){
			clickAnElement(serviceClassRadioButtons.get(1));
		}else{
			clickAnElement(serviceClassRadioButtons.get(2));
		}
		
	}
	
	public void selectAirline(String inputAirline)throws Exception{
		airline = getElementByName("airline");
		selectByText(airline, inputAirline);
	}
	
	public SelectAFlightPage clickContinueButton()throws Exception{
		continueButton = getElementByName("findFlights");
		clickAnElement(continueButton);
		return new SelectAFlightPage();
	}
}
