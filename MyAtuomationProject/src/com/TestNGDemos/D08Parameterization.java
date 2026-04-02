package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D08Parameterization {
	WebDriver driver;

	@Parameters({ "firstName", "lastName", "gender" })
	@Test
	public void testPracticeAutomation(String fn, String ln, String gn) {
		driver.findElement(By.id("fname")).sendKeys(fn);
		driver.findElement(By.id("lname")).sendKeys(ln);

		if (gn.equals("Male"))
			driver.findElement(By.id("male")).click();
		else
			driver.findElement(By.id("female")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://trytestingthis.netlify.app/");
	}

	@AfterTest
	public void afterTest() {
		// driver.close();
	}

}
