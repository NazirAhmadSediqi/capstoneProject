@testingtest
Feature: DataBase SQL Query Feature 


Scenario: Execute all information from Actor table 
	Given User Connects to PostgreSql DataBase 
	When User send query 'select first_name from public.actor' 
	Then User should get all information from that table 
