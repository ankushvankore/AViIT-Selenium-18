package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D20Synchronization_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Login
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();

		// Logout
		if (driver.getCurrentUrl().contains("dashboard")) {
			Thread.sleep(2000);
			driver.findElement(By.className("oxd-userdropdown-icon")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
		}
		
		driver.close();
	}

}
