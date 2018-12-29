package com.cucumber.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;





public class CucumberScenario1 extends Main{
	
	
	
	
	
	@Given("^All economics data available in Sheet$")
public static void checkBeforeBook() throws Exception {
	
		Main obj=new Main();
		obj.initializeDriver();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
	
	

}
	
	
	@And("^Enviroment is pointing to UAT$")
	public static void checkEnv() throws Exception {
		
			Main obj=new Main();
			obj.initializeDriver();
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www..com/");
		
		

	}
	
	
	@When("^Book Trade$")
	public static void bookTrade() throws Exception {
		
			Main obj=new Main();
			obj.initializeDriver();
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.snapdeal.com/");
		
		

	}
	

}
