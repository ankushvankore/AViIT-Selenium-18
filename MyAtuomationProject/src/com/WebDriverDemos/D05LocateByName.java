package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		//Please find a control whose name is username, and store this control in object txtUserName
		//This object txtUserName represents the control on the page
		//Operations on this object will be performed on the control
		txtUserName.sendKeys("dhanashri");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("dhanashri123");
		
		
	}

}
