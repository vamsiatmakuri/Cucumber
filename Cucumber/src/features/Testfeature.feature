Feature: Problem
 
Scenario: Need to verify the right number of values appear on the screen
	Given values on the screen
	When User Navigate to screen
	And right number of values appear
	Then values are verified
 
 Scenario: Need to verify the values on the screen are greater than 0
	Given values on the screen
	When User Navigate to screen
	And values greater than 0
	Then values are verified
	
	Scenario: Need to verify the values are formatted as currencies
	Given values on the screen
	When User Navigate to screen
	And values are formatted as currencies
	Then values are verified
	
	Scenario: Need to verify the total balance matches the sum of the values
	Given values on the screen
	When User Navigate to screen
	And total balance matches sum of values
	Then total balance is verified
	
	Scenario: Output the results
	Given values on the screen
	When User Navigate to screen
	Then results are displayed 