package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;


public class HomePage extends ProjectSpecificMethods{

	
	@Then("Homepage should be displayed")
	public HomePage verifyHomepage() {
		verifyDisplayed(locateElement("class","slds-icon-waffle"));
		return this;
	}

}










