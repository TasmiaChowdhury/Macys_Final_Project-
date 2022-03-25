package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Elements.EndToEnd_Elements;
import Utilities.Set_Drivers;

public class EndToEnd_Actions {
	
	EndToEnd_Elements eTeElements;
	
	
	WebDriver driver = new ChromeDriver();

	public EndToEnd_Actions () {
		eTeElements = new EndToEnd_Elements();
		PageFactory.initElements(driver, eTeElements);
	}
	

	public void MacysHomePage() {
		Set_Drivers.driver.get("https://www.macys.com");
		Set_Drivers.driver.manage().window().maximize();
		Set_Drivers.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set_Drivers.driver.findElement(By.xpath("//*[@id=\"mb-j-header-image\"]/comment()"));
	}
	
	public void Click_men() {
		System.out.println("Clicking on Men");
		eTeElements.Men.click();
	}
	
	public void Click_Shirt() {
		System.out.println("Clicking on Shirt");
		eTeElements.Shirt.click();
}
	
	public void Click_desired_shirt() {
		System.out.println("Clicking on desired Shirt");
		eTeElements.desired_Shirt.click();
}


	public void Click_color_black() {
		System.out.println("Clicking on black color");
		eTeElements.color_black.click();
}

	public void Click_size_S() {
		System.out.println("Clicking on size S");
		eTeElements.size_S.click();
}
	public void Click_Add_To_Bag () {
		System.out.println("Clicking on Add to Bag");
		eTeElements.Add_To_Bag.click();

}
	public void Click_Checkout () {
		System.out.println("Clicking on Add to Bag");
		eTeElements.Checkout.click();

}

	
	
}

