package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D31CalenderAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        
        driver.findElement(By.id("datepicker")).click();
        
        String month = "Jan", day = "26";
        
        while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText().contains(month))
        	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
        
        driver.findElement(By.xpath("//a[text()=\""+day+"\"]")).click();
	}

}
