package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15LocateMultipleControls {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		List<WebElement>textBoxes = driver.findElements(By.xpath("html/body/div/div/section/section/div/div/input"));
		textBoxes.get(0).sendKeys("dhanashri");
		textBoxes.get(1).sendKeys("dhanashri123");
	}

}
