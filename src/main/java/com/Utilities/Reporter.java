package com.Utilities;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Reporter  {
	
			public static ExtentReports extent;
			public static ExtentSparkReporter spark;
			public static ExtentTest test, node;
			
			public String testcaseName, testcaseDec, author, category;
				
			@BeforeSuite
			public void startReport() {
				extent = new ExtentReports();
				spark = new ExtentSparkReporter("./reports/result.html");
				extent.attachReporter(spark);	
			}
			
		    @BeforeClass
			public void report() throws IOException {
		 		test = extent.createTest(testcaseName, testcaseDec);
		 		test.assignAuthor(author);
				test.assignCategory(category); 
				
			}
		    
		    
		    
		    
		    @AfterSuite
		    public void stopReport() {
		    	extent.flush(); // content would be transferred to the report
		    }
		}





