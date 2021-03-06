package cucumber.steps;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DriverCommand;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.helper.Helper;

public class MercurySiteHooks extends Helper{
	
	public Scenario scenario;
	
	/*This runs before and after anything runs in the code
	 * you can close db, close spreadsheet etc in after*/
	@Before
	public void setUp(Scenario scenario) throws Exception
	{
		this.scenario = scenario;
		LaunchBrowser("Chrome");
	}
	
	@After
	public void tearDown() throws Exception
	{
		String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
		String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
		  //String name = scenario.getName();
		String fileName = String.format("C:/seleniumTraining/AutoTrader/report/%s/report_%s.html", dateNow, timeNow);
		  
		  if (scenario.isFailed()) 
		  {
		   try {
		    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		    scenario.embed(screenshot, fileName);
		   } catch (Exception e) {
		    e.printStackTrace();
		   }
		  }
		
		closeBrowser();
	}
}
