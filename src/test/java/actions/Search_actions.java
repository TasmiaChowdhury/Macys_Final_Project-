package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Elements.ElementsTasmia;
import Utilities.Set_Drivers;

public class Search_actions {
	
	ElementsTasmia elementTas;
	
	public Search_actions(){
		elementTas = new ElementsTasmia();
		PageFactory.initElements(Set_Drivers.driver, elementTas);
	}
	
	
	public void getoMacysHomePage(){
		
		Set_Drivers.driver.get("https://www.macys.com/");
		Set_Drivers.driver.manage().window().maximize();
		Set_Drivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("chrome opened for searching item ==>");
	}
	
	public void searchItem(){
		elementTas.searchBox.clear();
		elementTas.searchBox.sendKeys("Men's Shirts");
		
		
	}
	
	public void clickSearch(){
		//elementTas.searchBox.click();      - didnt work 
		Select dropdown=new Select(elementTas.searchBox);
		dropdown.selectByIndex(1);
		
		
		
	}
	
	public void getTitle(){
		
	}

}
