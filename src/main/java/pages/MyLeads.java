package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {
	
	public MyLeads()
	{
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createleadlink;
	
	public CreateLeadPage Clickcreatelead()
	{
		click(createleadlink);
		return new CreateLeadPage();
		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement Findleadslink;
	
	public Findleadspage clickFindlead()
	{
		click(Findleadslink);
		return new Findleadspage();
		
	}
	
	
	
}
