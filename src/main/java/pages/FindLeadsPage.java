package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

		public FindLeadsPage() 
		{		
			PageFactory.initElements(driver,this);
		}	
		
		
		@FindBy( how =How.XPATH, using ="//button[text() = 'Find Leads']")
		private WebElement findLead;
		public FindLeadsPage clickFindLeadPage()
		{
			click(findLead);
			return this;
		}

		@FindBy( how =How.XPATH, using ="//a [@class ='linktext']")
		private WebElement FirstLead;
		public MergeLeadsPage selectFirstLead()
		{
			click(FirstLead);
			switchToWindow(0);
			return new MergeLeadsPage();
		}



		@FindBy( how =How.XPATH, using ="(//a [@class ='linktext'])[6]")
		private WebElement SecondtLead;
		public MergeLeadsPage selectSecondLead()
		{
			click(SecondtLead);
			switchToWindow(0);
			return new MergeLeadsPage();
		}
		
		
}