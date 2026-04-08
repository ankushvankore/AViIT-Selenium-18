package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
	/*
	 * How I can access driver object from client class
	 * 1. Mark driver object as public static
	 * 2. Make utility class as base class and client class as derived class
	 * 3. Pass the driver object from client class to utility class via Constructor
	 */
	
	WebDriver driver;
	
	public RediffUtility(WebDriver d) {
		this.driver = d;
	}
	
	public void enterFullName(String fn) {
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
	}
	
	public void enterRediffId(String rid) {
		driver.findElement(By.cssSelector("input[placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
	}
	
	public void enterPassword(String ps) {
		driver.findElement(By.id("newpasswd")).sendKeys(ps);
		driver.findElement(By.id("newpasswd1")).sendKeys(ps);
	}
	
	public void setBirthDate(String day, String month, String year) {
		new Select(driver.findElement(By.className("day"))).selectByVisibleText(day);
		new Select(driver.findElement(By.className("middle"))).selectByVisibleText(month);
		new Select(driver.findElement(By.className("year"))).selectByVisibleText(year);
	}
	
	public void selectGender(String gn) {
		if(gn.equals("Male"))
			driver.findElement(By.xpath("//input[@value='m']")).click();
		else
			driver.findElement(By.xpath("//input[@value='f']")).click();
	}

}
