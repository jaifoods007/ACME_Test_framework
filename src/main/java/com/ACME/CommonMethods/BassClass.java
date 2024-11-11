package com.ACME.CommonMethods;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.Utilities.Reporter;



public class BassClass extends Reporter {
	
	public static ChromeDriver driver;
	public static String baseURL;
	
@BeforeMethod
public void Browser_Login() {
		
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String baseURL ="https://acme-test.uipath.com/login";
	
	driver.get(baseURL);
	
	//Maximize the window
	
	driver.manage().window().maximize();
	
	
	//Title
	
	String title = driver.getTitle();
	System.out.println("Title of the page is:" +title);
	
	
}



//@AfterMethod
//public void teardown() {
//	driver.close();
//}




}

