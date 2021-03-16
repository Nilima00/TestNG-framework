package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Addcatagory;
import util.BrowserFactory;

@Test

public class TC_02 {

	WebDriver driver;
	String input;

	public void LaunchTheBrowser()  {

		driver = BrowserFactory.init();

		Addcatagory add = PageFactory.initElements(driver, Addcatagory.class);

		add.Add_A_Catagory("1213");
		//add.click_Add_button();
		
		//add.Insidebody();
		//add.validatemonths();

	}

}
