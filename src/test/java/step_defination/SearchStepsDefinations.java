package step_defination;

import org.testng.Assert;

import Utilities.Helper;
import actions.Search_actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsDefinations {
	
	Search_actions action=new Search_actions();
	
	@Given("User is on macys homepage")
	public void user_is_on_macys_homepage() {
		action.getoMacysHomePage();
	   
	}

	@When("User enters items in search box")
	public void user_enters_items_in_search_box() {
	  action.searchItem();  
	}

	@And("User press enter")
	public void user_press_enter() {
		action.clickSearch();
	    
	}

	@Then("User is navigated to search result")
	public void user_is_navigated_to_search_result() {
		Assert.assertEquals(Helper.getPageTitle(), "Shirt-Macy's");
	    
	}


}
