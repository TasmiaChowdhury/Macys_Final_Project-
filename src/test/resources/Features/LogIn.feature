Feature: Login feature

  Scenario: user is able to login with a valid email and password
    Given user is on on macys homepage
    And the user put a valid password
    And Click on the sign-in button
    Then User is able to log into the homepage
