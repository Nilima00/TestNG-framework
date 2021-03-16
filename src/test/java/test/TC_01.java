package test;


import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Addcatagory;
import page.BasePage;
import util.BrowserFactory;

public class TC_01 extends BasePage {
	
	WebDriver driver;
	
	@Test
	public void LaunchTheBrowser() {
		driver = BrowserFactory.init();
		
		Addcatagory add = PageFactory.initElements(driver, Addcatagory.class);
		
		add.Add_A_Catagory("213");
		add.click_Add_button();
		
		
		
		
		//add.validatemonths();
		
		
		
		
}}
