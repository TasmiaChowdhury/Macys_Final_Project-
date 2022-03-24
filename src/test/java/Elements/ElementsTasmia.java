package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Set_Drivers;

public class ElementsTasmia {
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailId;
	
	@FindBy (xpath = "//input[@id='pw-input']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='sign-in']")
	public WebElement clickSubmit;
	
	

}
