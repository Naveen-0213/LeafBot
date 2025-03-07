package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/F01_Login.feature",glue="com.leafBot.pages",monochrome=true)
public class TC003_LoginUsingCucumber extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and verify using cucumber";
		testDescription = "Login testCase using positive data using cucumber";
		nodes = "Login";
		authors = "Hari";
		category = "Smoke";
	
	}

	
}





