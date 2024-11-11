package com.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ACME.CommonMethods.BassClass;
import com.ACME.Pages.ACME_BankPage;
import com.ACME.Pages.ACME_HomePage;
import com.ACME.Pages.ACME_LoginPage;
import com.ACME.Pages.DashboardPages;
import com.Utilities.Utilities;

public class ACME_BankTest extends BassClass {

	@BeforeTest
	public void testinputs() {

		testcaseName = "Add Bank Account details";
		testcaseDec = "To Validate whether user is able to add bank account details";
		author = "Automation Tester";
		category = "smoketest";

	}

	@Test (dataProvider ="datafetch")
	public void ACME_LoginTest(String username,String password, String fname,String lname, String city, String state, String zip, String contactnumber,String mail, String currentage, String familymembers) throws InterruptedException {

		// User able to login the page

		ACME_LoginPage login = new ACME_LoginPage();
		login.LoginAuth(username,password);
		login.Click();
		
		 DashboardPages dp = new DashboardPages();
		    dp.ClickBankPage();

		// User able to add Bank Account details

		ACME_BankPage Addaccount = new ACME_BankPage();

		Addaccount.ClickAddAccount();
		Addaccount.firstName(fname);
		Addaccount.lastName(lname);
		Addaccount.City_State_Zip(city,state,zip);
		Addaccount.Phone(contactnumber);
		Addaccount.Email(mail);
		Addaccount.Age(currentage);
		Addaccount.Dependents(familymembers);
		Addaccount.ClickAddAccount();
		Addaccount.alert_handle();

		ACME_HomePage hp=new ACME_HomePage();
	    hp.Click_Home();
	}
	

@DataProvider (name="datafetch")
public Object [][] getdata() throws IOException {
	return Utilities.exceldataread("AddBankDetails");
	
}

}
