package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	public static String getCurrentUrl() {
		return Set_Drivers.driver.getCurrentUrl();
	}
	public static boolean delay(WebElement element) {
		boolean bool;
		WebDriverWait wait = new WebDriverWait(Set_Drivers.driver, 15);
		bool = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		return bool;
	}
	public static String getPageTitle() {
		String pageTitle;
		pageTitle = Set_Drivers.driver.getTitle();
		return pageTitle;
	}
	public static String getParentWindow() {
		String parentWindow;
		parentWindow = Set_Drivers.driver.getWindowHandle();
		System.out.println(parentWindow);
		return parentWindow;
	}

}

