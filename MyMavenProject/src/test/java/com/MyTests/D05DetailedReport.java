package com.MyTests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05DetailedReport {
	ExtentSparkReporter htmlReport;
	ExtentReports report;
	ExtentTest test;

	WebDriver driver;

	@Test(priority = 1)
	public void ohrmlLogin1() {
		test = report.createTest("OHRM Login With Valid Data");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test(priority = 2)
	public void ohrmlLogin2() {
		test = report.createTest("OHRM Login With Invalid Data");
		
		driver.findElement(By.name("username")).sendKeys("dhanashri");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	
	@Test(priority = 3)
	public void ohrmlLogin3() {
		test = report.createTest("OHRM Login Skip...");
		throw new SkipException("Skipping the test for reporting purpose");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		//ITestResult is an interface which provides the details about the @Test
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		}
		else if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			test.fail(result.getThrowable());
			//getThrowable() --> Returns the failure log
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@BeforeTest
	public void beforeTest() {
		htmlReport = new ExtentSparkReporter("OHRM_Report.html");
		report = new ExtentReports();
		report.attachReporter(htmlReport);

		// Adding environment details
		report.setSystemInfo("User Name", "Dhanashri");
		report.setSystemInfo("Machine Name", "Dell");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser", "Google Chrome");
		report.setSystemInfo("Processor", "I5");

		// Configuration of look and feel of report
		htmlReport.config().setDocumentTitle("Orange HRM Report");
		htmlReport.config().setReportName("OHRM Tests");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setTimeStampFormat("EEEE MMMM dd yyyy, hh:mm a '('zzz')'");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		report.flush();
		
		driver.close();
	}

}
