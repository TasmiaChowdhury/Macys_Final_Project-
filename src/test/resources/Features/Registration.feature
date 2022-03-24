#Author: Fatima Rubyat..
Feature: Regitration functionality
   
  Scenario: The user should be able to register for an account using valid data
    Given User is on Macys sign-in page
    When Click on Create Account 
    Then the user is navigated to the create an account page
    When the User inputs first name
    And inserts last name
    And User inserts an email address
    And Inserts the password
    And User select  month and day from the Birthday dropdown
    And User select checkbox Join Star Rewards
    And Click on the Create Account button
    Then User is navigated to the account homepage
