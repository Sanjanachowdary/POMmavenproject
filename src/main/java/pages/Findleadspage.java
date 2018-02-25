package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Findleadspage extends ProjectMethods {
	
	public Findleadspage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	public WebElement Fnametextbox;
	
	public Findleadspage enterfirstName(String Fname)
	{
		type(Fnametextbox,Fname);
		return this;		
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	public WebElement Findleadsbutton;
	
	
	public Findleadspage clickFindleads() throws InterruptedException
	{
		click(Findleadsbutton);
		Thread.sleep(3000);
		return this;
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	public WebElement Firstlink;
	public static String leadid;
	public Findleadspage getLeadID()
	{
		leadid=getText(Firstlink);
		return this;
	}
	
	public ViewLeadPage clickFirstleadID()
	{
		click(Firstlink);
		return new ViewLeadPage();
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//span[@class='x-tab-strip-text '])[2]")
	public WebElement phonetab;
	
	public Findleadspage clickPhonetab()
	{
		click(phonetab);
		return this;
	}

	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	public WebElement Emailtab;
	
	public Findleadspage clickEmailtab()
	{
		click(Emailtab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	public WebElement emailtextbox;
	
	public Findleadspage entermailId(String MailD)
	{
		type(emailtextbox,MailD);
		return this;
	}
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	public WebElement phonenumber;
	
	public Findleadspage enterPhonemuber(String phonenum)
	{
		type(phonenumber,phonenum);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	public WebElement LeadIDtextbox;
	
	public Findleadspage enterLeadID(String LeadId)
	{
		type(LeadIDtextbox,LeadId);
		return this;
	}
	
	

	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	public WebElement Errormessage;
	
	public Findleadspage verifyError()
	{
		verifyPartialText(Errormessage, "No records to display");
		return this;
	}
	
}
