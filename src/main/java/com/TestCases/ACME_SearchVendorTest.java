package com.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ACME.CommonMethods.BassClass;
import com.ACME.Pages.ACME_LoginPage;
import com.ACME.Pages.ACME_SearchVendorPage;
import com.ACME.Pages.DashboardPages;
import com.Utilities.Utilities;

public class ACME_SearchVendorTest extends BassClass {

	@BeforeTest
	public void testinputs() {

		testcaseName = "Search Vendor details";
		testcaseDec = "To Validate whether user is able to Search Vendor details";
		author = "Automation Tester";
		category = "smoketest";

	}

	@Test(dataProvider = "datafetch")

	public void ACME_LoginTest(String username, String password, String vNameSearch) throws InterruptedException {

		// User able to login the page

		ACME_LoginPage login = new ACME_LoginPage();
		login.LoginAuth(username, password);
		login.Click();

		DashboardPages dp = new DashboardPages();
		dp.Click_SearchVendor();

		ACME_SearchVendorPage sv = new ACME_SearchVendorPage();
		sv.SearchByVendorName(vNameSearch);
		sv.Click_SearchButton();

	}

	@DataProvider(name = "datafetch")
	public Object[][] getdata() throws IOException {
		return Utilities.exceldataread("VendorSearch");

	}
}