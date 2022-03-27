package step_defination;

import actions.HoursAndLocationsActionClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HoursAndLocationsStepdef {

	HoursAndLocationsActionClass Actions = new HoursAndLocationsActionClass();
	
	
	
	@Given("User is on Macys homepage Macy’s– Official Site")
	public void user_is_on_Macys_homepage_Macy_s_Official_Site() {
	   Actions.gethomepage();
	    
	}

	@When("User hoovers over to bottom of page Location and hours is displayed")
	public void user_hoovers_over_to_bottom_of_page_Location_and_hours_is_displayed() {
	   Actions.scrolldown();
	    
	}

	@Then("User should click on Location and hours")
	public void user_should_click_on_Location_and_hours() {
	   Actions.HoursandLocation();
	    
	}
	
	
	
	
	
	
}
