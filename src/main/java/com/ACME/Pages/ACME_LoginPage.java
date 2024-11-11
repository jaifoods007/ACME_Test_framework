package com.ACME.Pages;

import org.openqa.selenium.By;

import com.ACME.CommonMethods.BassClass;

public class ACME_LoginPage extends BassClass {

	public ACME_LoginPage LoginAuth(String username, String password) {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

		return this;
	}

	public DashboardPages Click() {
		driver.findElement(By.xpath("//body//button//following::div[5]//button")).click();
        return new DashboardPages();  
	}

}
