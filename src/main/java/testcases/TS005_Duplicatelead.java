package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Findleadspage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TS005_Duplicatelead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TS005_Duplicatelead";
		//testDescription="login to LeafTaps And Logout";
		testDescription="login to LeafTaps ,duplicate a lead by searching with email ID and validate that the first nme o original lead and duplicate lead are same";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void editlead(String uName,String pwd,String MailID) throws InterruptedException {
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
		//.clickPhonetab()
		.clickEmailtab()
		.entermailId(MailID)
		//.enterPhonemuber(phonenum)
		.clickFindleads()
		//.getLeadID()
		
		.clickFirstleadID()
		//.clickDelete()
		.GetFname()
		.clickDuplicatelead()
		.clickCreateButton()
		.GetFname();
		if(ViewLeadPage.der[0].equalsIgnoreCase(ViewLeadPage.der[0])) {
			System.out.println(ViewLeadPage.der[0] +"the firstnames are  matching" +ViewLeadPage.der[1]);
		}
		//.clickFindlead()
		//.enterLeadID(Findleadspage.leadid)
		//.clickFindleads()
		//.verifyError();
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
