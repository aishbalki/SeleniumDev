package pages;

import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage() 
	{		
		PageFactory.initElements(driver,this);
	}

}
