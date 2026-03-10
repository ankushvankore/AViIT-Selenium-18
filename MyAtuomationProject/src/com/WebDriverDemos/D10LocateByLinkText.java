package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-login/");

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("student");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Password123");
		WebElement loginBtn = driver.findElement(By.id("submit"));
		loginBtn.click();

		String url = driver.getCurrentUrl();

		if (url.contains("successfully")) {
			WebElement logoutLink = driver.findElement(By.linkText("Log out"));
			System.out.println(logoutLink.getText());
			System.out.println(logoutLink.getAttribute("href"));
			logoutLink.click();
		} 
		else {
			System.out.println("Invalid creadtional!!!");
		}
	}

}
