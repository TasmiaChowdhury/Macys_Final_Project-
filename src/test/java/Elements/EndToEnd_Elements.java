package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EndToEnd_Elements {
	@FindBy(xpath="//*[@id=\"flexid_1\"]/a/span")
	public WebElement Men;
	
	@FindBy(xpath="//*[@id=\"categoryTree\"]/ul/li[4]/div[1]/div/div/ul/li[11]/a")
	public WebElement Shirt;

	@FindBy(xpath="//*[@id=\"5466924\"]/div[3]/div[2]/a")
	public WebElement desired_Shirt;
	
	
	@FindBy(xpath="//*[@id=\"mcom-a11y-3135856\"]/picture/img")
	public WebElement color_black;
	
	@FindBy(xpath="//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/ul/li[1]")
	public WebElement size_S;
	
	@FindBy(xpath="//*[@id=\"bag-add-5466924\"]")
	public WebElement Add_To_Bag;
	
	@FindBy(xpath="//*[@id=\"atbIntCheckout\"]")
	public WebElement Checkout;
}

