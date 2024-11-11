package com.ACME.Pages;

import org.openqa.selenium.By;

import com.ACME.CommonMethods.BassClass;

public class ACME_HomePage extends BassClass {

	public void Click_Home() throws InterruptedException {

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
	}
}
