package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	public MergeLeadsPage() 
	{		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy( how =How.XPATH, using ="//img[@alt='Lookup']")
	private WebElement FromLead;
	public FindLeadsPage selectFromLead()
	{
		clickWithNoSnap(FromLead);
		switchToWindow(1);
		return new FindLeadsPage();
		
	}
	
	@FindBy( how =How.XPATH, using ="(//img[@alt='Lookup'])[2]")
	private WebElement ToLead;
	public FindLeadsPage selectToLead()
	{
		clickWithNoSnap(ToLead);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	@FindBy( how =How.XPATH, using ="//a[@class ='buttonDangerous']")
	private WebElement mergeLead;
	public ViewLeadPage clickMergeLeadbutton()
	{
		click(mergeLead);
		acceptAlert();
		return new ViewLeadPage();
	}
	


}
