package Utilities;

public class Helper {
	
	public static String getCurrentUrl() {
		return Set_Drivers.driver.getCurrentUrl();
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
