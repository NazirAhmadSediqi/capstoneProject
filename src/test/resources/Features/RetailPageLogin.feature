@capston
Feature: Retail Page Login Testing 

Background: 

	Given User is on Retail website 
	And User click  on MyAccount 
	When  User click on Login 
	And User enter username 'nazir12@gmail.com' and password 'Kabul' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard
	

Scenario: Register as an Affiliate userwith Cheque Payment Method 
	When User click on‘Register for an Affiliate Account’link 
	And User fill affiliate form with below information 
		|company|website|taxID|Cheque Payee Name|
		|Landover|www.Landover.com|121014|David Dawson|
	And User check on About us check box 
	And User click on Continue button affiliate
	Then User should see a success messages
 

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer 
	When User click on‘Edit your affiliate informationlink 
	And user click on Bank Transfer radio button 
	And User fill Bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|Bank of America|100200|225588|Suhrab|112233665544|
	And User click on Continue AffiliateButton 
	Then User should see a success message 
	
Scenario: Edit your account Information 
	When User click on‘Edit your account information’ link 
	And User modify below information 
		|firstname|lastName|email|telephone|
		|Suhrab|Khiabani|falconeagle@tek-school.com|301-401-7895|
	And User click on continue button 
	Then User should seea message ‘Success: Your account has been successfully updated.’  