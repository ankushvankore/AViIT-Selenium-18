package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05SeleniumAssignment {
	WebDriver driver;
	@Test (priority = 1)
	public void testDownloads() {
		driver.findElement(By.linkText("Downloads")).click();
	}
	
	@Test (priority = 2)
	public void testDocumentation() {
		driver.findElement(By.linkText("Documentation")).click();
	}
	
	@Test (priority = 3)
	public void testProjects() {
		driver.findElement(By.linkText("Projects")).click();
	}
	
	@Test (priority = 2)
	public void testSupport() {
		driver.findElement(By.linkText("Support")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.selenium.dev/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
	}

}
