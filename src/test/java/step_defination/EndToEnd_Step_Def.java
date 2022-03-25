package step_defination;


// Sayed branches
import actions.EndToEnd_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndToEnd_Step_Def {
	
	//EndToEnd_Actions eTeActions = new EndToEnd_Actions();
	EndToEnd_Actions eTeActions = new EndToEnd_Actions();
	
	//EndToEnd_Actions eTeActions;
	//WebDriver driver;
	
	@Given("User is on Macys.com home page.")
	public void user_is_on_Macys_com_home_page() {
		eTeActions.MacysHomePage();
	
		
	}

	@When("Click on Men")
	public void click_on_Men() {
		eTeActions.Click_men();
	    
	}

	@When("Click on Shirt")
	public void click_on_Shirt() {
		eTeActions.Click_Shirt();
	    
	}

	@When("Click on desired shirt")
	public void click_on_desired_shirt() {
		eTeActions.Click_desired_shirt();
	    
	}

	@When("Click color black")
	public void click_color_black() {
	    eTeActions.Click_color_black();
	    
	}

	@When("Click on size S")
	public void click_on_size_S() {
		eTeActions.Click_size_S();
	    
	}

	@When("Click on Add To Bag")
	public void click_on_Add_To_Bag() {
		eTeActions.Click_Add_To_Bag();
	    
	}

	@When("Click Checkout")
	public void click_Checkout() {
		eTeActions.Click_Checkout();
	    
	}

	@Then("user able to checkout successfully")
	public void user_able_to_checkout_successfully() {
	
	    
	    
	}
}
