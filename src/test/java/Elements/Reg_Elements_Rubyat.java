package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reg_Elements_Rubyat {
	 
	@FindBy(id="standard-sign-up")
	public WebElement Registration;
	
	
	@FindBy(xpath="//*[@id=\"create-account\"]/div/div[1]/div/h1")
	public WebElement ConfirmPge;
	
	@FindBy(xpath="//*[@id=\"ca-profile-firstname\"]")
	public WebElement First_Name;
	
	@FindBy(xpath="//*[@id=\"ca-profile-lastname\"]")
	public WebElement Last_Name;
	
	@FindBy(name="email")
	public WebElement Email;
	
	@FindBy(id="ca-profile-password")
	public WebElement Password;
	
	@FindBy(xpath="//*[@id=\"ca-profile-birth-month\"]")
	public WebElement Month;
	
	@FindBy(name="ca-profile-birth-day")
	public WebElement Day;
	
	@FindBy(xpath="//*[@id=\"ca-profile-star-rewards\"]")
	public WebElement Rewards;
	
	@FindBy(xpath="//*[@id=\"ca-profile-submit\"]")
	public WebElement Create_Account;
	
	
	

}
