package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoursAndLocationElements {

	//WebDriver driver;
	
	//public HoursAndLocationElements(WebDriver driver) {
		//this.driver = driver;
	
	@FindBy(xpath ="//a[normalize-space()='Locations & Hours']")
	//@FindBy(linkText = "Locations & Hours")
	public WebElement HoursLocation;
}
