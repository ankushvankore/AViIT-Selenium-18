package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04NormalExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MySimpleReport.html");
		// This object represents the HTML file inside which you are going to store the
		// report
		ExtentReports report = new ExtentReports();
		// This object represents the report
		ExtentTest test;
		// This object represents the test case

		report.attachReporter(htmlReport);
		// This will store the report in the above HTML file

		WebDriver driver;

		// Adding environment details
		report.setSystemInfo("User Name", "Dhanashri");
		report.setSystemInfo("Machine Name", "Dell");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser", "Google Chrome");
		report.setSystemInfo("Processor", "I5");

		// Configuration of look and feel of report
		htmlReport.config().setDocumentTitle("My First Report");
		htmlReport.config().setReportName("Google Tests");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");

		// Configure the test
		test = report.createTest("Google Title Test");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());

		driver.close();

		test.log(Status.PASS, MarkupHelper.createLabel("Google Title", ExtentColor.GREEN));
		
		//Another test
		test = report.createTest("Google Search Test");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Amruta Rao", Keys.ENTER);

		driver.close();

		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search", ExtentColor.RED));

		report.flush();
		// This will generate the report file
	}

}
