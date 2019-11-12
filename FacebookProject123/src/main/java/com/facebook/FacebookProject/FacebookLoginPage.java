package com.facebook.FacebookProject;

import org.openqa.selenium.By;

import com.facebook.FacebookProject.General.AbstractPageObject;

public class FacebookLoginPage extends AbstractPageObject {
		
	By LoginPage = By.xpath("//*[contains(@class,'fb_logo ')]");
	By email	= By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='pass']");
	By loginButton = By.xpath("//*[@value='Log In']");
	By settings = By.xpath(".//div[text()='Account Settings']");
	By logOut = By.xpath(".//span[text()='Log Out']");

//	public FacebookLoginPage() {
//		
//	}

	public void loginToFacebook(String emailId, String pwd) {
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
	public void goToFbPage() {
		driver.get("https://www.facebook.com");
	}
	
	public void quitDriver() {
		driver.quit();
	}
	public void logOut() {
		
		driver.findElement(this.settings).click();
		// modified the function
		driver.findElement(this.logOut).click();
	}

}
    
