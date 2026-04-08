package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D10POM_Client {
	WebDriver driver;
	RediffUtility r1;
	
	@Test
	public void registration1() {
		r1.enterFullName("Dhanashri Thorat");
		r1.enterRediffId("dhanashrithorat");
		r1.enterPassword("Dhanashri@123");
		r1.setBirthDate("30", "MAR", "2000");
		r1.selectGender("Female");		
	}
	
	@Test
	public void registration2() {
		r1.enterFullName("Ravi Shinde");
		r1.enterRediffId("ravishinde");
		r1.enterPassword("Ravi@123");
		r1.setBirthDate("01", "JUN", "1979");
		r1.selectGender("Male");		
	}
	
	@AfterMethod
	public void refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
