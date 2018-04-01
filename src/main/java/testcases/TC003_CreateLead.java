package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create Lead using Excel";
		testNodes="Leads";
		category="Sanity";
		authors="AishHema";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void creatingLead (String companyName,String firstName,String lastName) {
		
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(companyName)
		.typefirstName(firstName)
		.typelastName(lastName)
		.clickCreateleadsubmit()
		.verifyFirstName(firstName);
		
	}

}
