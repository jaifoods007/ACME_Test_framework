package com.ACME.Pages;

import org.openqa.selenium.By;

import com.ACME.CommonMethods.BassClass;

public class ACME_SearchVendorPage extends BassClass {

	public void SearchByVendorName(String vNameSearch) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div//following::input[3]")).click();
		driver.findElement(By.xpath("//div//following::input[3]")).sendKeys(vNameSearch);

	}

	public void Click_SearchButton() {
		driver.findElement(By.id("buttonSearch")).click();

	}

}
