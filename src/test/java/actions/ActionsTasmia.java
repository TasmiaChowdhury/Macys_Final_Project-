package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Elements.ElementsTasmia;
import Utilities.Set_Drivers;

public class ActionsTasmia {
	
	ElementsTasmia elementTas = null;
	
	WebDriver driver = null;
	
	public ActionsTasmia(){
		this.elementTas =new ElementsTasmia();
		PageFactory.initElements(driver, elementTas);
	
	}
	public void openMacysSignin() {
		Set_Drivers.setupChromeDriver();
		Set_Drivers.driver.get("https://www.macys.com/account/signin");
		Set_Drivers.driver.manage().window().maximize();
		Set_Drivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("chrome opened");
	}
	
	public void inputEmail(){
		System.out.println("Passing email");
		elementTas.emailId.sendKeys("alex");
	}
	
	public void inputPass(){
		System.out.println("Passing password");
		elementTas.password.sendKeys("hello123");
	}
	public void clickSignin(){
		elementTas.clickSubmit.click();
	}
	}


