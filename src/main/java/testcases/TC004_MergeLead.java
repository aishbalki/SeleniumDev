package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead  extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_MergeLead";
		testDescription="Find two leads and merge ";
		testNodes="Leads";
		category="Sanity";
		authors="Aishwarya";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	//@Test(dataProvider="fetchData")
	@Test
	public void mergingLead ()
	{
		
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickMergeLead()
		.selectFromLead()
		.clickFindLeadPage()
		.selectFirstLead()
		.selectToLead()
		.clickFindLeadPage()
		.selectSecondLead()
		.clickMergeLeadbutton();
		
		
	}

}
