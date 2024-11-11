package com.ACME.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ACME.CommonMethods.BassClass;

public class Vendor_Page extends BassClass {

//	public Vendor_Page Click_AddVendor() {
//
//		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[4]")).click();
//		driver.findElement(By.linkText("Add Vendor")).click();
//		return this;
//	}

	public Vendor_Page vendorTaxId(String taxId) {

		driver.findElement(By.id("vendorTaxId")).sendKeys(taxId);
		return this;
	}

	public Vendor_Page Vendorname(String vName) {

		driver.findElement(By.id("name")).sendKeys(vName);
		return this;
	}

	public Vendor_Page Adress(String vAddress) {

		driver.findElement(By.id("address")).sendKeys(vAddress);
		return this;
	}

	public Vendor_Page City(String Vcity) {

		driver.findElement(By.id("city")).sendKeys(Vcity);
		return this;
	}

	public Vendor_Page Country(String Vcountry) {

		driver.findElement(By.id("country")).sendKeys(Vcountry);
		return this;
	}

	public ACME_HomePage Save_Vendor() {

		driver.findElement(By.id("addVendor")).click();
		return new ACME_HomePage();
		
//		if(wait.until(ExpectedConditions.alertIsPresent())==null)
//		    System.out.println("alert was not present");
//		else
//		    System.out.println("alert was present");
//		    Alert alt = driver.switchTo().alert();
//		    alt.accept();
		
	}

	
}