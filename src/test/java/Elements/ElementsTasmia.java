package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsTasmia {
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailId;
	
	@FindBy (xpath = "//input[@id='pw-input']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='sign-in']")
	public WebElement clickSubmit;
	
	@FindBy (xpath="//input[@id='globalSearchInputField']")
	public WebElement searchBox;
	
	@FindBy (xpath="//li[@data-search-term='mens shirts']")
	public WebElement searchAutoSuggestions;
	 

}
