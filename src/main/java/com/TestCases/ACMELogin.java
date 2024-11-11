package com.TestCases;


import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import com.ACME.CommonMethods.BassClass;
import com.ACME.Pages.ACME_LoginPage;
import com.Utilities.Utilities;

public class ACMELogin extends BassClass {


@Test
@BeforeTest
	public void testinputs() {
	
	testcaseName ="Login functionality";
	testcaseDec ="To Validate whether user is able to login";
    author ="Automation Tester";
	category="smoketest";
		
	}
@Test (dataProvider ="datafetch")
public void ACME_LoginTest(String username, String password) throws InterruptedException {
	
	ACME_LoginPage login=new ACME_LoginPage();
	login.LoginAuth(username,password);
    login.Click(); 
   

}
@DataProvider (name="datafetch")
public Object [][] getdata() throws IOException {
	return Utilities.exceldataread("LoginPage");
	
}

}
