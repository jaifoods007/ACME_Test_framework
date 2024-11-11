package com.ACME.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.ACME.CommonMethods.BassClass;


public class ACME_BankPage extends BassClass {

	
	// User to add Account details
	
	public ACME_BankPage AddAccount() {

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg dropdown-toggle'])[10]")).click();
		driver.findElement(By.xpath("//body//button//following::div[18]//a")).click();
		return this;
	}
	
	public ACME_BankPage firstName(String fname) {
		driver.findElement(By.xpath("//body//button//following::input[3]")).sendKeys(fname);
		return this;
	}

	public ACME_BankPage lastName(String lname) {
		driver.findElement(By.xpath("//body//button//following::input[4]")).sendKeys(lname);
		return this;

	}

	public ACME_BankPage City_State_Zip(String city, String state, String zip) {
		driver.findElement(By.xpath("//body//button//following::input[5]")).sendKeys(city,state,zip);
		return this;

	}

	public ACME_BankPage Phone(String contactnumber) {
		driver.findElement(By.xpath("//body//button//following::input[6]")).sendKeys(contactnumber);
		return this;
	}

	public ACME_BankPage Email(String mail) {
		driver.findElement(By.xpath("//body//button//following::input[7]")).sendKeys(mail);
		return this;
	}

	public ACME_BankPage Age(String currentage) {
		driver.findElement(By.xpath("//body//button//following::input[8]")).sendKeys(currentage);
		return this;
	}

	public ACME_BankPage Dependents(String familymembers) {
		driver.findElement(By.xpath("//body//button//following::input[9]")).sendKeys(familymembers);
		return this;
	}

	public ACME_HomePage ClickAddAccount() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new ACME_HomePage();
	
	}

	public void alert_handle() throws InterruptedException {
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
	}



}
