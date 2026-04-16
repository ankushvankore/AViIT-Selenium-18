package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class D02TrialTestNGClass {
	WebDriver driver;

	@Test
	public void dragAndDrop() {
		driver.findElement(By.linkText("Droppable")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/droppable/");
	}

	@AfterTest
	public void afterTest() {
	}

}
