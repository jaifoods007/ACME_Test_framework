package com.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ACME.CommonMethods.BassClass;
import com.ACME.Pages.ACME_LoginPage;
import com.ACME.Pages.DashboardPages;
import com.Utilities.Utilities;

public class ACME_DownloadResouceReportTest extends BassClass {

	@BeforeTest
	public void testinputs() {

		testcaseName = "Download the Resource Report";
		testcaseDec = "To Validate whether user is able to Download the Resource Report";
		author = "Automation Tester";
		category = "smoketest";

	}

	@Test(dataProvider = "datafetch")

	public void ACME_LoginTest(String username, String password) throws InterruptedException {

		// User able to login the page

		ACME_LoginPage login = new ACME_LoginPage();
		login.LoginAuth(username, password);
		login.Click();

		DashboardPages dp = new DashboardPages();
		dp.Click_DownloadRR();

//		ACME_DownloadResourceReportPage DRR = new ACME_DownloadResourceReportPage();
//		DRR.DownloadReport();
	}

	@DataProvider(name = "datafetch")
	public Object[][] getdata() throws IOException {
		return Utilities.exceldataread("LoginPage");
	}
}