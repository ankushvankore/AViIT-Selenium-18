package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A15RedbusAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.redbus.in/");
        
        //From
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.id("srcinput")).sendKeys("Kolh");
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div")).click();
        
        //To
        driver.findElement(By.id("destinput")).sendKeys("Pun");
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div")).click();
        
        //Calender
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[3]/div[1]")).click();
        
        //Date
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div/div/div/ul/div[6]/li[2]/div/div/span")).click();
        
        //Search Buses
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/button")).click();
        
        //Result Bus
        System.out.println(driver.findElement(By.xpath("//*[@id=\"15974011\"]/div[2]/div[3]/div/div[1]/div[1]")).getText());
        
        driver.close();
	}

}
