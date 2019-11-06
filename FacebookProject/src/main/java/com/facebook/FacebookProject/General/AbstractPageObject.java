package com.facebook.FacebookProject.General;

import org.openqa.selenium.WebDriver;

public class AbstractPageObject {
	
	public static WebDriver driver;
	
	public AbstractPageObject() {
		driver = DriverImplementation.getDriver();	
	}

}
