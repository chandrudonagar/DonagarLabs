package com.cucumber.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
	
	public static final String exePath = "E:\\DocumentsPersonal\\Automation\\chromedriver.exe";
	
	public void initializeDriver(){
		System.setProperty("webdriver.chrome.driver", exePath);
		
	}
	

	


}
