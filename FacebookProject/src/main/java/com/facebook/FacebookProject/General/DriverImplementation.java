package com.facebook.FacebookProject.General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverImplementation {
	
	static WebDriver driver;
	public DriverImplementation() {
		driver = DriverImplementation.getDriver();
	}
	
	public static WebDriver getDriver() {
		
		if (driver==null) {
		WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} 
		return driver;
	}
	
}