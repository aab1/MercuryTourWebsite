Feature:Mercury Tour login process
		In order to sign in to mercury tour  
		As mercury tour customer
		I want to be able to manage my account online 
		
@smokeTest	@ignore
Scenario Outline:	Login to an account on mercury tour website
			Given I navigate to mercury tour website
			And mercury tour logo is displayed
			When I click the sign-on button
			And the sign-on page displayed correctly
			And I enter my user name "<UserName>"
			And I enter my Password "<password>"
			And I click signInSubmitButton
			Then the flight finder page displayed correctly

Scenarios:
			|UserName	|password	|	
			|automa		|tester		|	
			|yemi		|jesuss		|