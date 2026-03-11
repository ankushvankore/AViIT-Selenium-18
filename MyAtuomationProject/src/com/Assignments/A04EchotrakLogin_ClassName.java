package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("dhanashri");
		driver.findElement(By.id("txtPassword")).sendKeys("dhanashri123");
		driver.findElement(By.className("btn-block")).click();
	}

}
