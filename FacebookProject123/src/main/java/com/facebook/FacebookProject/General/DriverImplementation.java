package com.facebook.FacebookProject.General;

import java.util.concurrent.TimeUnit;

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
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} 
		return driver;
	}
	
}