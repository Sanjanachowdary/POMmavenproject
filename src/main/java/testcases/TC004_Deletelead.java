package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Findleadspage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_Deletelead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeletedLead";
		//testDescription="login to LeafTaps And Logout";
		testDescription="login to LeafTaps ,delete a lead by searching with phone number and validate whether lead got deleted fom he database";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void editlead(String uName,String pwd,String phonenum) throws InterruptedException {
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
		//.enterfirstName(Fname)
		.clickPhonetab()
		.enterPhonemuber(phonenum)
		.clickFindleads()
		.getLeadID()
		.clickFirstleadID()
		.clickDelete()
		.clickFindlead()
		.enterLeadID(Findleadspage.leadid)
		.clickFindleads()
		.verifyError();
		//.titleVerify(Title)
		//.clickedit()
		//.updateCompanyName(Cname)
		//.clickUpdate()
		//.VerifyCname(Cname);
		//.Clickcreatelead()
		/*.enterCname(CompName)
		.enterFirstName(FirsName)
		.enterlastName(LastName)
		.clickCreateButton()*/
		//.verifyFirstname(Fname);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
