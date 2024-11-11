package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ACME.CommonMethods.BassClass;
import com.ACME.Pages.ACME_LoginPage;
import com.ACME.Pages.DashboardPages;
import com.ACME.Pages.Vendor_Page;
import com.Utilities.Utilities;

public class ACME_VendorTest extends BassClass {

	@BeforeTest
	public void testinputs() {

		testcaseName = "Add Vendor details";
		testcaseDec = "To Validate whether user is able to add Vendor details";
		author = "Automation Tester";
		category = "smoketest";

	}

	@Test(dataProvider = "datafetch")
	public void ACME_LoginTest(String username, String password, String taxId, String vName, String vAddress,
			String Vcity, String Vcountry) throws InterruptedException {

		// User able to login the page

		ACME_LoginPage login = new ACME_LoginPage();
		login.LoginAuth(username, password);
		login.Click();

		DashboardPages dp = new DashboardPages();
		dp.Click_AddVendor();

		Vendor_Page vp = new Vendor_Page();
		vp.vendorTaxId(taxId);
		vp.Vendorname(vName);
		vp.Adress(vAddress);
		vp.City(Vcity);
		vp.Country(Vcountry);
		vp.Save_Vendor();

		if (wait.until(ExpectedConditions.alertIsPresent()) == null)
			System.out.println("alert was not present");
		else
			System.out.println("alert was present");
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

	@DataProvider(name = "datafetch")
	public Object[][] getdata() throws IOException {
		return Utilities.exceldataread("VendorAdd");

	}

}
