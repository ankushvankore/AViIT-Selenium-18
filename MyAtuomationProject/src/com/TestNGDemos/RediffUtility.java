package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
	/*
	 * How I can access driver object from client class
	 * 1. Mark driver object as public static
	 * 2. Make utility class as base class and client class as derived class
	 * 3. Pass the driver object from client class to utility class via Constructor
	 */
	
	/*
	 * Page Factory
	 * - Page factory is sub set of Page Object Model
	 * - It is the collection of WebElements on the page
	 * - It acts like object repository
	 */
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Enter your full name']")WebElement fullName;
	@FindBy(css = "input[placeholder=\"Enter Rediffmail ID\"]")WebElement rediffId;
	
	public RediffUtility(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFullName(String fn) {
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	
	public void enterRediffId(String rid) {
		//driver.findElement(By.cssSelector("input[placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
		rediffId.sendKeys(rid);
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
	
	public String checkAvailablity() throws InterruptedException {
		driver.findElement(By.className("btn_checkavail")).click();
		Thread.sleep(2000);
		String message = driver.findElement(By.id("check_availability")).getText();
		System.out.println("Message: " + message);
		return message;
	}

}
