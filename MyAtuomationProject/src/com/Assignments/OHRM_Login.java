package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_Login {
	WebDriver driver;

	@Test
	public void login1() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
	}

	@Test
	public void login2() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
	}

	@Test
	public void login3() {
		driver.findElement(By.name("username")).sendKeys("dhanashri");
		driver.findElement(By.name("password")).sendKeys("dhanashri123");
		driver.findElement(By.className("oxd-button")).click();
	}

	@AfterMethod
	public void logout() {
		if(driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.className("oxd-userdropdown-icon")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Invalid Credtionals!!! Test case fail");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
