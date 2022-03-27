Feature: hours and location
This feature is testing if user is able to check hours and location
  
  @chrome
  Scenario: User should be able to select Location and hours
    Given User is on Macys homepage Macy’s– Official Site 
		When User hoovers over to bottom of page Location and hours is displayed 
		Then User should click on Location and hours
 