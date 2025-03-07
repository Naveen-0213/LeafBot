package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {

	
	@Given("Enter the username as {string}")
	public LoginPage enterUserName(String data) {
		//step1: locate the element
		WebElement ele = locateElement("username");
		
		//step2: interact with the webelement
		clearAndType(ele,data);
		
		reportStep("username entered successfully","pass");
		
		return this;
	}

	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		//WebElement ele = locateElement("xpath", "//input[@id='password']");
		clearAndType(locateElement("xpath", "//input[@id='password']"), data);
		return this;	
	
	}

	@When("Click on login button")
	public HomePage clickLogin() {
	//	WebElement ele = locateElement("Login");
		click(locateElement("Login"));
		return new HomePage();
	}

	

}
