@assignment
Feature: Retail Website Features 

#Every feature file starts with Feature: <Name of feature file>
#Every Scenario starts with Scenario: <Name of Test case we want to automate>
#Gherkin keywords are Given When Then
#Given is precondition
#When is an Action taken
#Then is an expected result (usually we write validation)
#And is repeating an action or can be used following Given keyword as well
#But is used for negative scenarios verification

Background: 
	Given User is on Retail website 
@Test 
Scenario: Search functionality Test case 

	When User search for 'iphone' 
	And User click on search button 
	Then User should see Iphone image 
	
	# In scenario Outline we can run same scenario with multiple set of data 
	# we will use examples keyword to pass different data
	# Every Scenario outline follows with Examples keyword
	# Under examples keyword we placed data inside the pipes | and we can separate
	# columns with pipes
	# in this examples each row represent one time of execution
	
@TestSmokee 
Scenario Outline: Test Search Funtionality with multiple set of Data 


	When User search for '<itemName>' 
	And User click on search button 
	
	Examples: 
		|itemName|
		|iphone|
		|mac book|
		|Canon|
@RegisterTest		
Scenario: Register and Account test case 
			When User click  on MyAccount 
			And User click on Register option 
			And User fill the Registration form with Below information 
				|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
				|Polina|Zohal|PolinaZohal@gmail.com|45414578920|testt|testt|no|
			And user acceptthe privacy and policy 
			And User click on Continue button 
			Then User should be registered in Retail Website
			
			
			
			
			
			
			
	