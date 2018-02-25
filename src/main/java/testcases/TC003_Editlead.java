package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Editlead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		//testDescription="login to LeafTaps And Logout";
		testDescription="login to LeafTaps ,edit the company name of an existing lead and verify the new company name is updated";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void editlead(String uName,String pwd,String Fname,String Title,String Cname) throws InterruptedException {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		//.verifyLoggedName(vName)
		//.clickLogOut();
		.clicklink()
		.Clickleads()
		.clickFindlead()
		.enterfirstName(Fname)
		.clickFindleads()
		.clickFirstleadID()
		//.titleVerify(Title)
		.clickedit()
		.updateCompanyName(Cname)
		.clickUpdate()
		.VerifyCname(Cname);
		//.Clickcreatelead()
		/*.enterCname(CompName)
		.enterFirstName(FirsName)
		.enterlastName(LastName)
		.clickCreateButton()*/
		//.verifyFirstname(Fname);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
