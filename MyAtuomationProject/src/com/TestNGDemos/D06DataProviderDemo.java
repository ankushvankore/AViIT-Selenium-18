package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataProviderDemo {
	WebDriver driver;
	
	@Test(dataProvider = "getLogiData")
	public void login(String un, String ps) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.className("oxd-button")).click();
	}
	//the method login is going to fetch the data from method getLoginData / method getLoginData is going to send the data to method login
	@DataProvider
	public Object[][] getLogiData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "dhanashri", "dhanashri123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "sharyu", "sharyu123" },
			new Object[] { "admin", "admin123" },
		};
		
		//Object[][]data = {{1, "a"}, {2, "b"}, {3, "c"}};
		//return data;
	}
	
	@AfterMethod
	public void afterMethod() {
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
