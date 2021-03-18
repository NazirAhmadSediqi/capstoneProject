@capston
Feature: Desktop Features

Background:

Given User is on Retail website
When User Click on Desktops tab
And User click on Show all desktops

Scenario:
Then User should see all items are present in Desktop page

Scenario:
And User click ADD TO CART option on 'HP LP3065' item
And User select quantity 1
And User click add to Cart button
Then User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'

Scenario:
And User click ADD TO CART option on 'Canon EOS 5D' item
And User select color from dropdown 'Red'
And User select quuantity 1
And User click add too Cart button
Then User should see a message 'Succes: You have added Canon EOS 5d to your shopping cart'

Scenario:
And User click on Canon EOS 5D item
And User click on write a review link
And user fill the review information with below information

|yourname|yourReview|Rating|
|Radmanish|VeryGoodVeryGoodVeryGood|Good|

And User click on Continue Button
Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval'







