package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Set_Drivers {
	
	public static WebDriver driver;
	public static Set_Drivers set_drivers;
	
	public Set_Drivers(){
		WebDriverManager.chromedriver().setup();
		this.driver=new ChromeDriver();
	}
	
	public static void setupChromeDriver(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void setupFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDownDriver() {
		driver.quit();
	}

}
