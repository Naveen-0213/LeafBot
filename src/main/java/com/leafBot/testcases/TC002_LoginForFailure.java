package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_LoginForFailure extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {

		testCaseName = "Login(Negative)";
		testDescription = "Login for Failure(Negative testCase)";
		nodes = "Leads";
		authors = "Naveen";
		category = "Smoke";

		dataSheetName = "TC001a";

	}

	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
	}

}
