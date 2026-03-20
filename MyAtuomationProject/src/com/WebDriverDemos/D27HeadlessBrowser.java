package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D27HeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/web-table-element.php");
     
        //List<WebElement>allHeader = driver.findElements(By.tagName("th"));
        List<WebElement>allHeader = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
        
        System.out.println("----------- All Headers ----------");
        for(WebElement h : allHeader)
        	System.out.println(h.getText());
        
        driver.close();
	}

}
