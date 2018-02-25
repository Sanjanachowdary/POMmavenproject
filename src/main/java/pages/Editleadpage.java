package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Editleadpage extends ProjectMethods {
	
	public Editleadpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
      @FindBy(how=How.ID,using="updateLeadForm_companyName")
      public WebElement CNametextbox;      
      public Editleadpage updateCompanyName(String Cname)
      {
    	  type(CNametextbox,Cname);
		return this;    	  
      }
      
      @FindBy(how=How.NAME,using="submitButton")
      public WebElement updatebutton;
      public ViewLeadPage clickUpdate()
      {
    	  click(updatebutton);
		return new ViewLeadPage();    	  
      }
      

}
