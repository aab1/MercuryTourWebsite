$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FindFlight.feature");
formatter.feature({
  "line": 1,
  "name": "Find flight",
  "description": "In order to find flight in to mercury tour website  \r\nAs mercury tour website customer\r\nI want to be able to find flight after login",
  "id": "find-flight",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login and find flight for one passenger online",
  "description": "",
  "id": "find-flight;login-and-find-flight-for-one-passenger-online",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I navigate to mercury tour website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "mercury tour logo is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my user name \"\u003cUserName\u003e\" on the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter my Password \"\u003cpassword\u003e\" on the homepage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click sign-In",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the flight finder page displayed correctly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select travel type \"\u003ctripType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"\u003cnumberOfPassenger\u003e\" passenger",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select departing from \"\u003cdepatureCity\u003e\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select departure month \"\u003cDepatureMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select departure day \"\u003cDepatureDay\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select arriving In \"\u003carrivalCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select return month \"\u003creturnMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select return day \"\u003creturnDay\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Select Service Class \"\u003cserviceClass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select airline \"\u003cairline\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click continue button on flight finder page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select flight page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select \"\u003cdepart\u003e\"flight under depart section",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select \"\u003creturn\u003e\"flight under return section",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click continue button on the select flight page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "book a flight page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter first name\"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter last name\"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select meal \"\u003cMeal\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select card type \"\u003ccreditCardType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter credit card number \"\u003ccreditCardNum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I select the credit card expiration month \"\u003ccreditCardExpirationMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select the credit card expiration year \"\u003ccreditCardExpirationYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter first name as it appear on credit card \"\u003ccreditCardOwnerFirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter middle name as it appear on credit card \"\u003ccreditCardOwnerMidleName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I enter last name on credit card \"\u003ccreditCardOwnerLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click the checkbox for ticketless travel",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter the firstline of the credit card billing address\"\u003ccreditCardBillingAddress1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter the secondline of the credit card billing address\"\u003ccreditCardBillingAddress2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I enter the city of the credit card billing address\"\u003ccreditCardBillingCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I enter the state or province from the credit card billing address\"\u003ccreditCardBillingProvince\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I enter the postcode of the billing address \"\u003cpostcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I select the country \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click the check box for the same billing address",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click the secure purchase button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "the Flight Confirmation page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Flight confirmation number is displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 52,
  "name": "",
  "description": "",
  "id": "find-flight;login-and-find-flight-for-one-passenger-online;",
  "rows": [
    {
      "cells": [
        "UserName",
        "password",
        "tripType",
        "numberOfPassenger",
        "depatureCity",
        "DepatureMonth",
        "DepatureDay",
        "arrivalCity",
        "returnMonth",
        "returnDay",
        "serviceClass",
        "airline",
        "depart",
        "return",
        "firstName",
        "lastName",
        "Meal",
        "creditCardType",
        "creditCardNum",
        "creditCardExpirationMonth",
        "creditCardExpirationYear",
        "creditCardOwnerFirstName",
        "creditCardOwnerMidleName",
        "creditCardOwnerLastName",
        "creditCardBillingAddress1",
        "creditCardBillingAddress2",
        "creditCardBillingCity",
        "creditCardBillingProvince",
        "postcode",
        "country"
      ],
      "line": 53,
      "id": "find-flight;login-and-find-flight-for-one-passenger-online;;1"
    },
    {
      "cells": [
        "another",
        "tester",
        "roundtrip",
        "1",
        "New York",
        "June",
        "3",
        "London",
        "7",
        "24",
        "First class",
        "Unified Airlines",
        "Blue Skies Airlines 361",
        "Unified Airlines 633",
        "John",
        "Smith",
        "Diabetic",
        "MasterCard",
        "4319887766666",
        "11",
        "2000",
        "John",
        "-",
        "Terry",
        "1325 Borregas Ave.",
        "Selenuim street",
        "Sunnyvale",
        "CA",
        "94089",
        "UNITED STATES"
      ],
      "line": 54,
      "id": "find-flight;login-and-find-flight-for-one-passenger-online;;2"
    }
  ],
  "keyword": "Scenarios"
});
formatter.before({
  "duration": 7742159004,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "Login and find flight for one passenger online",
  "description": "",
  "id": "find-flight;login-and-find-flight-for-one-passenger-online;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I navigate to mercury tour website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "mercury tour logo is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my user name \"another\" on the homepage",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter my Password \"tester\" on the homepage",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click sign-In",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the flight finder page displayed correctly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select travel type \"roundtrip\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"1\" passenger",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select departing from \"New York\" dropdown",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select departure month \"June\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select departure day \"3\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select arriving In \"London\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select return month \"7\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select return day \"24\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Select Service Class \"First class\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select airline \"Unified Airlines\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click continue button on flight finder page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select flight page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select \"Blue Skies Airlines 361\"flight under depart section",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select \"Unified Airlines 633\"flight under return section",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click continue button on the select flight page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "book a flight page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter first name\"John\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter last name\"Smith\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select meal \"Diabetic\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select card type \"MasterCard\"",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter credit card number \"4319887766666\"",
  "matchedColumns": [
    18
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I select the credit card expiration month \"11\"",
  "matchedColumns": [
    19
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select the credit card expiration year \"2000\"",
  "matchedColumns": [
    20
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter first name as it appear on credit card \"John\"",
  "matchedColumns": [
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter middle name as it appear on credit card \"-\"",
  "matchedColumns": [
    22
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I enter last name on credit card \"Terry\"",
  "matchedColumns": [
    23
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click the checkbox for ticketless travel",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter the firstline of the credit card billing address\"1325 Borregas Ave.\"",
  "matchedColumns": [
    24
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter the secondline of the credit card billing address\"Selenuim street\"",
  "matchedColumns": [
    25
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I enter the city of the credit card billing address\"Sunnyvale\"",
  "matchedColumns": [
    26
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I enter the state or province from the credit card billing address\"CA\"",
  "matchedColumns": [
    27
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I enter the postcode of the billing address \"94089\"",
  "matchedColumns": [
    28
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I select the country \"UNITED STATES\"",
  "matchedColumns": [
    29
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click the check box for the same billing address",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click the secure purchase button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "the Flight Confirmation page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Flight confirmation number is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationSteps.i_navigate_to_mercury_tour_website()"
});
formatter.result({
  "duration": 1912561976,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.mercury_tour_logo_is_displayed()"
});
formatter.result({
  "duration": 106681330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "another",
      "offset": 22
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_my_user_name_on_the_homepage(String)"
});
formatter.result({
  "duration": 98941356,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tester",
      "offset": 21
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_my_Password_on_the_homepage(String)"
});
formatter.result({
  "duration": 96333995,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.i_click_sign_In()"
});
formatter.result({
  "duration": 1356642841,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_flight_finder_page_displayed_correctly()"
});
formatter.result({
  "duration": 85892005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "roundtrip",
      "offset": 22
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_travel_type(String)"
});
formatter.result({
  "duration": 73441371,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 10
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_passenger(String)"
});
formatter.result({
  "duration": 95607933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 25
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_departing_from_dropdown(String)"
});
formatter.result({
  "duration": 110207482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "June",
      "offset": 26
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_departure_month(String)"
});
formatter.result({
  "duration": 109401972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 24
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_departure_day(String)"
});
formatter.result({
  "duration": 103577509,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 22
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_arriving_In(String)"
});
formatter.result({
  "duration": 115262167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 23
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_return_month(String)"
});
formatter.result({
  "duration": 106774083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 21
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_return_day(String)"
});
formatter.result({
  "duration": 104335883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First class",
      "offset": 24
    }
  ],
  "location": "LoginAndBookFlightSteps.i_Select_Service_Class(String)"
});
formatter.result({
  "duration": 90473799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Unified Airlines",
      "offset": 18
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_airline(String)"
});
formatter.result({
  "duration": 108390047,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.i_click_continue_button_on_flight_finder_page()"
});
formatter.result({
  "duration": 511525570,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.select_flight_page_is_displayed()"
});
formatter.result({
  "duration": 43039136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blue Skies Airlines 361",
      "offset": 10
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_flight_under_depart_section(String)"
});
formatter.result({
  "duration": 94323449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Unified Airlines 633",
      "offset": 10
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_flight_under_return_section(String)"
});
formatter.result({
  "duration": 77913685,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.i_click_continue_button_on_the_select_flight_page()"
});
formatter.result({
  "duration": 857478953,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.book_a_flight_page_is_displayed()"
});
formatter.result({
  "duration": 42729704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 19
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_first_name(String)"
});
formatter.result({
  "duration": 102496780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smith",
      "offset": 18
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_last_name(String)"
});
formatter.result({
  "duration": 93926585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Diabetic",
      "offset": 15
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_meal(String)"
});
formatter.result({
  "duration": 110380825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MasterCard",
      "offset": 20
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_card_type(String)"
});
formatter.result({
  "duration": 103497300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4319887766666",
      "offset": 28
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_credit_card_number(String)"
});
formatter.result({
  "duration": 104266698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 43
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_the_credit_card_expiration_month(String)"
});
formatter.result({
  "duration": 106632292,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 42
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_the_credit_card_expiration_year(String)"
});
formatter.result({
  "duration": 110603206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 48
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_first_name_as_it_appear_on_credit_card(String)"
});
formatter.result({
  "duration": 98896120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-",
      "offset": 49
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_middle_name_as_it_appear_on_credit_card(String)"
});
formatter.result({
  "duration": 92767548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Terry",
      "offset": 34
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_last_name_on_credit_card(String)"
});
formatter.result({
  "duration": 97322731,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.i_click_the_checkbox_for_ticketless_travel()"
});
formatter.result({
  "duration": 70919160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1325 Borregas Ave.",
      "offset": 57
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_the_firstline_of_the_credit_card_billing_address(String)"
});
formatter.result({
  "duration": 126548441,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenuim street",
      "offset": 58
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_the_secondline_of_the_credit_card_billing_address(String)"
});
formatter.result({
  "duration": 2137902380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 52
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_the_city_of_the_credit_card_billing_address(String)"
});
formatter.result({
  "duration": 123507343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CA",
      "offset": 67
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_the_state_or_province_from_the_credit_card_billing_address(String)"
});
formatter.result({
  "duration": 98368870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "94089",
      "offset": 45
    }
  ],
  "location": "LoginAndBookFlightSteps.i_enter_the_postcode_of_the_billing_address(String)"
});
formatter.result({
  "duration": 104254534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UNITED STATES",
      "offset": 22
    }
  ],
  "location": "LoginAndBookFlightSteps.i_select_the_country(String)"
});
formatter.result({
  "duration": 79597693,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.i_click_the_check_box_for_the_same_billing_address()"
});
formatter.result({
  "duration": 3066913655,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.i_click_the_secure_purchase_button()"
});
formatter.result({
  "duration": 956227199,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.the_Flight_Confirmation_page_is_displayed()"
});
formatter.result({
  "duration": 23244250,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndBookFlightSteps.flight_confirmation_number_is_displayed()"
});
formatter.result({
  "duration": 30030,
  "status": "passed"
});
formatter.after({
  "duration": 1080961626,
  "status": "passed"
});
formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Mercury Tour login process",
  "description": "In order to sign in to mercury tour  \r\nAs mercury tour customer\r\nI want to be able to manage my account online",
  "id": "mercury-tour-login-process",
  "keyword": "Feature"
});
formatter.uri("features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Mercury Tour registration process",
  "description": "In order to register to mercury tour  \r\nAs a potential mercury tour customer\r\nI want to be able to complete the registration online",
  "id": "mercury-tour-registration-process",
  "keyword": "Feature"
});
});