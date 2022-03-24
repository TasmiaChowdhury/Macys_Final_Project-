package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Elements.Reg_Elements_Rubyat;
import Utilities.Set_Drivers;

public class Reg_Action_Rubyat {
	 
	Reg_Elements_Rubyat objElements;
	WebDriver driver=new ChromeDriver();
	
	
	public Reg_Action_Rubyat() {
		objElements= new Reg_Elements_Rubyat();
		PageFactory.initElements(Set_Drivers.driver, objElements);
		
	}
	
	public void getCreatePage() {
		Set_Drivers.driver.get("www.macys.com/account/signin");
		Set_Drivers.driver.manage().window().maximize();
		Set_Drivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		}
	

	public void Click_create_button() {
		System.out.println("Clicking create account button");
		objElements.Registration.click();
	}
	
	public boolean ConfirmCreatePage() {
		boolean bool=false;
		String pagemsg=objElements.ConfirmPge.getText();
		if (pagemsg.contains("Secure create account")) {
			bool=true;
		}
		return bool;
	}
	
	
	public void input_firstname() {
		System.out.println("Entering first name ");
		objElements.First_Name.sendKeys("Guardian");
	}
	
	public void input_lastname() {
		System.out.println("Entering last name");
		objElements.Last_Name.sendKeys("Guardian");
	}
	
	public void input_email() {
		System.out.println("Entering email");
		objElements.Email.sendKeys("Galaxyqa2022@gmail.com");
	}
	
	public void input_password() {
		System.out.println("Creating password");
		objElements.Password.sendKeys("Galaxy2022!");
	}
	
	public void Birthdate() {
		System.out.println("insering birthdate");
		Select drp_Month=new Select(objElements.Month);
		drp_Month.selectByVisibleText("July");
		
		Select drp_Day=new Select(objElements.Day);
		drp_Day.selectByVisibleText("22");
		
	}
	
	public void Checkbox() {
		System.out.println("selecting rewards checkbox");
		objElements.Rewards.click();
	}
	
	public void Account_Create() {
		System.out.println("Clicking the final create account button ");
		objElements.Create_Account.click();
	}
	
	public void Home_page() {
		System.out.println("navigation to the homepage ");
		
	}
	
	

}
