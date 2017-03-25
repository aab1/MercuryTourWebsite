Feature:Find flight
		In order to find flight in to mercury tour website  
		As mercury tour website customer
		I want to be able to find flight after login 
		

Scenario Outline:	Login and find flight for one passenger online
			Given I navigate to mercury tour website
			And mercury tour logo is displayed
			When I enter my user name "<UserName>" on the homepage
			And I enter my Password "<password>" on the homepage
			And I click sign-In 
			And the flight finder page displayed correctly
			And I select travel type "<tripType>" 
			And I select "<numberOfPassenger>" passenger
			And I select departing from "<depatureCity>" dropdown
			And I select departure month "<DepatureMonth>"
			And I select departure day "<DepatureDay>"
			And I select arriving In "<arrivalCity>"
			And I select return month "<returnMonth>"
			And I select return day "<returnDay>"
			And I Select Service Class "<serviceClass>"
			And I select airline "<airline>"
			And I click continue button on flight finder page
			And Select flight page is displayed
			And I select "<depart>"flight under depart section
			And I select "<return>"flight under return section
			And I click continue button on the select flight page
			And book a flight page is displayed
			And I enter first name"<firstName>"
			And I enter last name"<lastName>"
			And I select meal "<Meal>"
			And I select card type "<creditCardType>"
			And I enter credit card number "<creditCardNum>"
			And I select the credit card expiration month "<creditCardExpirationMonth>"
			And I select the credit card expiration year "<creditCardExpirationYear>"
			And I enter first name as it appear on credit card "<creditCardOwnerFirstName>"
			And I enter middle name as it appear on credit card "<creditCardOwnerMidleName>"
			And I enter last name on credit card "<creditCardOwnerLastName>"
			And I click the checkbox for ticketless travel
			And I enter the firstline of the credit card billing address"<creditCardBillingAddress1>"
			And I enter the secondline of the credit card billing address"<creditCardBillingAddress2>"
			And I enter the city of the credit card billing address"<creditCardBillingCity>"
			And I enter the state or province from the credit card billing address"<creditCardBillingProvince>"
			And I enter the postcode of the billing address "<postcode>"
			And I select the country "<country>"
			And I click the check box for the same billing address
			And I click the secure purchase button
			Then the Flight Confirmation page is displayed
			And Flight confirmation number is displayed

Scenarios:
			|UserName	|password|tripType	|numberOfPassenger|depatureCity	|DepatureMonth|DepatureDay |arrivalCity|returnMonth|returnDay	|serviceClass	|airline  			|depart 				|return 				|firstName	|lastName	 |Meal 			  |creditCardType|creditCardNum |creditCardExpirationMonth| creditCardExpirationYear|creditCardOwnerFirstName|creditCardOwnerMidleName|creditCardOwnerLastName|creditCardBillingAddress1|creditCardBillingAddress2|creditCardBillingCity |creditCardBillingProvince|postcode|country	 				|	
			|another	|tester	 |roundtrip	|	1			  |New York		|June		  |	3		   |London	   |7          |24			|First class	|Unified Airlines	|Blue Skies Airlines 361|Unified Airlines 633	|John		|Smith		 |Diabetic 		  |MasterCard    |4319887766666	|11						  |2000 					|John					 |	-					  |	Terry				  |1325 Borregas Ave.		|Selenuim street		  |Sunnyvale			 |CA					   |94089   |UNITED STATES 				|
			|yemi		|jesuss	 |oneway	|	1			  |Frankfurt	|June		  |	15		   |Paris      |8          |15			|Business class |Pangea Airlines	|Unified Airlines 363	|Pangea Airlines 632	|Jason		|Bourne		 |Low Cholesterol |Diners Club   |4525252525252	|12						  |2002						|Mark					 |	Andrew				  |	Peter				  |1325 Mona Ave.			|Learning street		  |Abule				 |Wolftone				   |10098  	|ASHMORE AND CARTIER ISLANDS|
			
			

