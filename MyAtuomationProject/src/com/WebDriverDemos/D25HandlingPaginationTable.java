package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingPaginationTable {

	/*
	 * 1. Display total no of pages
	 * 2. Click on Every page
	 * 3. Display no of rows on every page
	 * 4. Select the checkbox from every row on every page
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/?m=1");
        
        List<WebElement>pages = driver.findElements(By.xpath("//ul[@id=\"pagination\"]/li/a"));
        System.out.println("Total no of Pages: " + pages.size());
        
        for(WebElement p : pages) {
        	p.click();
        	Thread.sleep(1000);
        	
        	//Read rows from each page
        	List<WebElement>rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]/tbody/tr"));
        	System.out.println("Rows on this page: " + rows.size());
        	
        	//Clicking on every checkbox 
        	List<WebElement>checkBoxes = driver.findElements(By.xpath("//table[@id=\"productTable\"]/tbody/tr/td[4]/input"));
        	for(WebElement c : checkBoxes)
        		c.click();
        }
	}

}
