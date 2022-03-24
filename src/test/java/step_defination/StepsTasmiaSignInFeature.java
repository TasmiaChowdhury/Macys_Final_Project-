package step_defination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Elements.ElementsTasmia;
import Utilities.Helper;
import Utilities.Set_Drivers;
import actions.ActionsTasmia;
import io.cucumber.java.en.*;

public class StepsTasmiaSignInFeature {
	
	ActionsTasmia action = new ActionsTasmia();

	@Given("User is on Macys sign is page")
	public void user_is_on_Macys_sign_is_page() {
		
		action.openMacysSignin();	
	}

	@When("User enters a valid email address")
	public void user_enters_a_valid_email_address() throws InterruptedException {
		action.inputEmail();
	}

	@And("User enters a Valid password")
	public void user_enters_a_Valid_password() {
		action.inputPass(); 
	}

	@And("User clicks on sign-in")
	public void user_clicks_on_sign_in() {
		action.clickSignin();

	}


	@Then("User should be nevigated to Macys homepage")
	public void user_should_be_nevigated_to_Macys_homepage() {
		Assert.assertEquals(Helper.getCurrentUrl(), "https://www.macys.com/myaccount/home");

	}




}
