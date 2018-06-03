Feature: Test various features of Mercury Tours Website. 
Background: 
	Given user is on index page 
	When user chooses to sign up 
	
@Signup-DataDriven 
Scenario Outline: validate the Sign in functionality 

	And user provides first name as <firstName> 
	And user provides last name as <lastName> 
	And user provides Phone as <phone> 
	And user provides email as <email> 
	And user provides address as <address> 
	And user provides city as <city> 
	And user provides state/Province as <state> 
	And user provides postal Code as <postalCode> 
	And user selects country as <country> 
	And user provides user name as <username> 
	And user provides password as <password> 
	And user provides the confirm password again as <password> 
	And user Submits registration form 
	Then User should be signed in 
	Examples: 
		|firstName	|lastName 	| phone	|email		|address	| city	|state	|postalCode	|country	|username	|password	|
		|Cerosh  	| Jacob		| 12321	|mail@aq.com|address1234	|city	|state	|12321		|Australia	|cerosh		|password	|
		
		@Signup-datatable-example 
		Scenario: validate the Sign in functionality with data table example 
		
			And user provides details as follows: 
				|firstName	|lastName 	| phone	|email		|address		| city	|state	|postalCode	|country	|username	|password	|
				|Simi 		| Kurup		| 12321	|simi@aq.com|address1234	|Dubai	|state	|12321		|Australia	|simi		|simi123	|
			And user Submits registration form 
			Then User should be signed in 
    