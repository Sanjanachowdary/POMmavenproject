package pages;

import java.lang.reflect.Array;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	public WebElement firstname;
	public ViewLeadPage verifyFirstname(String Fname)
	{
		getText(firstname);
		verifyExactText(firstname,Fname);
		return this;
		
	}
	
	public ViewLeadPage titleVerify(String Title)
	{
		verifyTitle(Title);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	public WebElement editbutton;
	
	public Editleadpage clickedit()
	{
		click(editbutton);
		return new Editleadpage();
		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	public WebElement updatedcname;
	public ViewLeadPage VerifyCname(String Cname)
	{
		verifyPartialText(updatedcname,Cname);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	public WebElement deletebutton;
	
	public MyLeads clickDelete(){
		{
			click(deletebutton);
			return new MyLeads();
		}
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	public WebElement duplicateleadbutton;
	
	public CreateLeadPage clickDuplicatelead(){
		{
			click(duplicateleadbutton);
			return new CreateLeadPage();
		}
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
    public WebElement Fname;
	//String array[2];
	String firname;
	int count=0;
	public static String[] der=new String[2];
	
	public ViewLeadPage GetFname()
	{
		for(int i=0;i<2;i++) {
		firname=getText(Fname);
		der[i]=firname;
		}
		return this;
	}
	
	
	
}
