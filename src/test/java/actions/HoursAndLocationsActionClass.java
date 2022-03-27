package actions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.HoursAndLocationElements;


public class HoursAndLocationsActionClass {

	
	HoursAndLocationElements pageElements = new  HoursAndLocationElements();
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	public void gethomepage() {
	driver.get("https://www.macys.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
		
		
	}
	
	public void scrolldown (){
		js.executeScript("window.scrollBy(0,12000)");	
		
	}
	
	public void HoursandLocation() {
		pageElements.HoursLocation.click();

	

	
	}

}
