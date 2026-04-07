package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class D09KeywordDrivenTesting {
	File file;				//We are handling the file
	FileInputStream fis;	//We are supposed to read the data from file
	Properties prop;		//To store all the properties from .properties file
	
	WebDriver driver;
	
	@Test
	public void automobileTest() {
		driver.findElement(By.linkText(prop.getProperty("autoLinkText"))).click();
		Select makeDD = new Select(driver.findElement(By.name(prop.getProperty("makeName"))));
		makeDD.selectByIndex(3);
		driver.findElement(By.id(prop.getProperty("epId"))).sendKeys("1000");
		driver.findElement(By.cssSelector(prop.getProperty("domCss"))).sendKeys("04/01/2026");
		new Select(driver.findElement(By.xpath(prop.getProperty("seatsXPath")))).selectByIndex(2);
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemos/MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		//Will load all the properties in prop object.
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
