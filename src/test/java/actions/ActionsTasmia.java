package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Elements.ElementsTasmia;
import Utilities.Set_Drivers;

public class ActionsTasmia {
	
	ElementsTasmia elementTas = null;
	
	WebDriver driver = null;
	
	public ActionsTasmia(WebDriver driver){
		this.elementTas =new ElementsTasmia();
		PageFactory.initElements(driver, elementTas);
	
	}
	public void openMacysSignin() {
		Set_Drivers.setupChromeDriver();
		Set_Drivers.driver.get("https://www.macys.com/account/signin");
		Set_Drivers.driver.manage().window().maximize();
		Set_Drivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("chrome opened ==>");
	}
	
	public void inputEmail(){
		Set_Drivers.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Galaxyqa2022@gmail.com");
		System.out.println("Passing email ==>");
		//elementTas.emailId.sendKeys("alex");
	}
	
	public void inputPass(){
		Set_Drivers.driver.findElement(By.xpath("//input[@id='pw-input']")).sendKeys("Galaxy2022!");
		System.out.println("Passing password ==>");
		//elementTas.password.sendKeys("hello123");
	}
	public void clickSignin(){
		System.out.println("clicked on sign in button ==>");
		Set_Drivers.driver.findElement(By.xpath("//input[@id='sign-in']")).click();
		//elementTas.clickSubmit.click();
	}
	
	public void errormessage(){
		System.out.println("output signin/error ==>");
		String s = Set_Drivers.driver.findElement(By.xpath("//p[@class='notification-body']")).getText();
		System.out.println("unable to login for system issue: " + s);
	}
	
	}


