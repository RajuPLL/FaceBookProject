package com.facebook.FacebookProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	static WebDriver driver;
	By FbLogo 	= By.xpath("//*[contains(@class,'fb_logo')]");	// for Login Page Verification
	By email  	= By.xpath("//*[@id='email']");
	By password	= By.xpath("//*[@id='pass']");
	By LoginButton	= By.xpath("//*[@value='Log In']");
	
	public FacebookLoginPage() {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.facebook.com");
	}
	
	public void set_email(String email) {
		
	}
}
