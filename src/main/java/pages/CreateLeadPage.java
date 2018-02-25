package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	public WebElement Fname;
	
	public CreateLeadPage enterFirstName(String Firname)
	{
		type(Fname,Firname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	public WebElement Lname;
	
	public CreateLeadPage enterlastName(String lname)
	{
		type(Lname,lname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	public WebElement Cname;
	
	public CreateLeadPage enterCname(String comname)
	{
		type(Cname,comname);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")		
	public WebElement createbutton;
	
	public ViewLeadPage clickCreateButton()
	{
		click(createbutton);
		return new ViewLeadPage();
	}
	
	

}
