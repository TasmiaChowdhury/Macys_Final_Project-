package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Elements.HoursAndLocationElements;
import Utilities.Set_Drivers;

public class HoursAndLocationsActionClass {
//zx
	HoursAndLocationElements elements;
	JavascriptExecutor js = (JavascriptExecutor) Set_Drivers.driver;

	public void HoursAndLocationsActions() {
		elements = new HoursAndLocationElements();
		PageFactory.initElements(Set_Drivers.driver, elements);

	}

	public void gethomepage() {
		Set_Drivers.driver.get("https://www.macys.com/");
		Set_Drivers.driver.manage().window().maximize();
		Set_Drivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	public void scrolldown() {
		js.executeScript("window.scrollBy(0,14000)");

	}

	public void HoursAndlocationLink() {
	try {
			elements.HoursLocation.click();
	}catch (Exception e){
	 
		System.out.println("Link text Failed! ");
	}
	}
	//public void HoursandLocation() {
		//elements.HoursLocation.click();
	//}
		

}
