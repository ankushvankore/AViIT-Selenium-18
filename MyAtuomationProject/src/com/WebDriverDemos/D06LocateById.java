package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("harshada");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("harshada123");
		WebElement loginBtn = driver.findElement(By.id("submit"));
		loginBtn.click();
		
		WebElement errorMessage = driver.findElement(By.id("error"));
		String txt = errorMessage.getText();
		System.out.println("Error Message: " + txt);
		
		driver.close();
	}

}
