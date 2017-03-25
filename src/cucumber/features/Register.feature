Feature:Mercury Tour registration process
		In order to register to mercury tour  
		As a potential mercury tour customer
		I want to be able to complete the registration online 
 @ignore @smokeTest		
Scenario:	Create an account on mercury tour website
			Given I navigate to mercury tour website
			And mercury tour logo is displayed
			When I click register
			And I enter my first name "firstName"
			And I enter my last name "lastName"
			And I enter my phone number "085662727"
			And I enter email address "something@test.cpm"
			And I enter the firstline of my adress "22 holyhill heightt"
			And I enter the second line of my address "holyhill lane"
			And I enter my city "cork"
			And I enter my state  or province "Cork"
			And I enter my postcode "TXW234"
			And I select country "Ireland"
			And I enter username "test"
			And I enter password "test"
			And I enter confirm password "test"
			And I click submit button
			Then my registration is successful
			#And the registration confirmation page is displayed

@fullRegressionTest	@ignore	
Scenario Outline:	Create an account on mercury tour website and login
			Given I navigate to mercury tour website
			And mercury tour logo is displayed
			When I click register
			And I enter my first name "<firstName>"
			And I enter my last name "<lastName>"
			And I enter my phone number "<PhoneNumber>"
			And I enter email address "<Email>"
			And I enter the firstline of my adress "<Address1>"
			And I enter the second line of my address "<Address2>"
			And I enter my city "<City>"
			And I enter my state  or province "<State>"
			And I enter my postcode "<Postcode>"
			And I select country "<Country>"
			And I enter username "<UserName>"
			And I enter password "<password>"
			And I enter confirm password "<ConfirmPassword>"
			And I click submit button
			Then my registration is successful
			And I click the sign-in link
			And the sign-on page displayed
			And I enter my user name "<UserName>"
			And I enter my Password "<password>"
			And I click signInSubmitButton
			And I sign-on successfully

Scenarios:
			|firstName	 |lastName	|PhoneNumber	|Email			   |Address1	   |Address2	|City	|State	|Postcode	|Country	|UserName	|password	|ConfirmPassword	|		
			|Ady		 |Abak		|098876543		|sfgdfg@asdasd.com |22 baler street|monastrey te|Dublin	|Cork	|d15tw65	|Ireland	|another	|tester		|tester				|	
			|Boy		 |Boys		|098876543		|boy@asdasd.com	   |22 baler street|monastrey te|Cork	|Cork	|d15tw65	|Ireland	|automate	|tester		|tester				|	
			