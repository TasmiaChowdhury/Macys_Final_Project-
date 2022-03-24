package step_defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utilities.Helper;
import actions.Reg_Action_Rubyat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class Step_def_Rubyat {
	
	 Reg_Action_Rubyat objActions=new Reg_Action_Rubyat();
	 
	   
	 @Given("User is on Macys sign-in page")
	public void user_is_on_Macys_sign_in_page() {
		objActions.getCreatePage();

	}

	@When("Click on Create Account")
	public void click_on_Create_Account() {
		objActions.Click_create_button();

	}

	@Then("the user is navigated to the create an account page")
	public void the_user_is_navigated_to_the_create_an_account_page() {
		objActions.ConfirmCreatePage();

	}

	@And("the User inputs first name")
	public void the_User_inputs_first_name() {
		objActions.input_firstname();
	}

	@When("inserts last name")
	public void inserts_last_name() {
		objActions.input_lastname();

	}

	@When("User inserts an email address")
	public void user_inserts_an_email_address() {
		objActions.input_email();

	}

	@When("Inserts the password")
	public void inserts_the_password() {
		objActions.input_password();

	}

	@When("User select  month and day from the Birthday dropdown")
	public void user_select_month_and_day_from_the_Birthday_dropdown() {
		objActions.Birthdate();

	}

	@When("User select checkbox Join Star Rewards")
	public void user_select_checkbox_Join_Star_Rewards() {
		objActions.Checkbox();

	}

	@When("Click on the Create Account button")
	public void click_on_the_Create_Account_button() {
		objActions.Account_Create();

	}

	@Then("User is navigated to the account homepage")
	public void user_is_navigated_to_the_account_homepage() {
		Assert.assertEquals(Helper.getCurrentUrl(), "https://www.macys.com/myaccount/home");
		objActions.HomePage();
	}

}
