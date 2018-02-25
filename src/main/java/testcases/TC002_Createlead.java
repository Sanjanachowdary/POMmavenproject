package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_Createlead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		//testDescription="login to LeafTaps And Logout";
		testDescription="login to LeafTaps ,create a lead and verify the lead is created with appopriate details";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC002";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String vName,String CompName,String FirsName,String LastName) {
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
		.Clickcreatelead()
		.enterCname(CompName)
		.enterFirstName(FirsName)
		.enterlastName(LastName)
		.clickCreateButton()
		.verifyFirstname(FirsName);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		