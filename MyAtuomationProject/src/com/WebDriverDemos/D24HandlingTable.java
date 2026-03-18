package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D24HandlingTable {

	/*
	 * 1. Display all headers
	 * 2. Display total no of rows
	 * 3. Display any row randomly
	 */
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/web-table-element.php");
     
        //List<WebElement>allHeader = driver.findElements(By.tagName("th"));
        List<WebElement>allHeader = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
        
        System.out.println("----------- All Headers ----------");
        for(WebElement h : allHeader)
        	System.out.println(h.getText());
        
        List<WebElement>allRows = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
        System.out.println("Total No of Rows: " + allRows.size());
        
        Random rnd = new Random();
        int i = rnd.nextInt(allRows.size());
        
        System.out.println(allRows.get(i).getText());
        System.out.println(driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[" + (i+1) + "]")).getText());
        
        List<WebElement>companies = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td/a"));
        for(WebElement c : companies)
        	System.out.println(c.getText());
        
        driver.close();
	}

}
