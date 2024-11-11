package com.ACME.Pages;

import org.openqa.selenium.By;
import com.ACME.CommonMethods.BassClass;

public class DashboardPages extends BassClass {

	public void ClickBankPage() {

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[10]")).click();
		driver.findElement(By.xpath("//body//button//following::div[18]//a")).click();

	}

	public void Click_AddVendor() {

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[4]")).click();
		driver.findElement(By.linkText("Add Vendor")).click();
	}

	public void Click_SearchVendor() {

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[4]")).click();
		driver.findElement(By.linkText("Search for Vendor")).click();
	}

	public void Click_DownloadRR() {

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[4]")).click();
	driver.findElement(By.linkText("Download Resource Report")).click();

	}
}
