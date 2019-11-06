package com.facebook.FacebookProject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginStepDefination {

	@Given("^user is already on Facebook Login page$")
	public void user_is_already_on_Facebook_Login_page() throws InterruptedException  {
		FacebookLoginPage Fblogin = new FacebookLoginPage();
		Fblogin.goToFbPage();
	}

	@When("^user is on Login Page$")
	public void user_is_on_Login_Page()  {
	    
	}

	@Then("^user enter \"(.*?)\" as email and \"(.*?)\" as password$")
	public void user_enter_karmakar_gmail_com_as_email_and_as_password(String email, String password) {
		FacebookLoginPage Fblogin = new FacebookLoginPage();
		Fblogin.loginToFacebook(email,password);
	}

	@Then("^user successfuly logs into Facebook Home Page$")
	public void user_successfuly_logs_into_Facebook_Home_Page() throws InterruptedException  {
	    Thread.sleep(10000);
	    FacebookLoginPage Fblogin = new FacebookLoginPage();
	    Fblogin.quitDriver();
	}

}
