package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D14DataDrivenFramework {
	/*
	 * 1. Read the data from Excel file
	 * 2. Pass this data to Test case
	 * 3. Update the result and product columns
	 */
	String fPath = "ExcelFiles/LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 1;
	
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void login(String un, String ps) {
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(ps);
		driver.findElement(By.id("login-button")).click();
	}
	
	@AfterMethod
	public void logout() {
		String msg;
		cell = sheet.getRow(index).getCell(2);
		
		if(driver.getCurrentUrl().contains("inventory")) {
			System.out.println("Login pass");
			
			msg = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.linkText("Logout")).click();
			
			cell.setCellValue("Pass");
		}
		else {
			
			msg = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
			
			System.out.println("Login fail");
			
			cell.setCellValue("Fail");
		}
		
		sheet.getRow(index).getCell(3).setCellValue(msg);
		
		driver.navigate().refresh();
		
		index++;
	}

	@DataProvider
	public Object[][] dp() {
		int rows = sheet.getPhysicalNumberOfRows();
		String[][] data = new String[rows - 1][2];
		
		for(int i = 1; i < rows; i++) {
			row = sheet.getRow(i);
			for(int j = 0; j < 2; j++) {
				cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		
		return data;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		fos = new FileOutputStream(file);
		
		Map<String, Object>pref = new HashMap<>();
		pref.put("profile.credentials_enable_serve", false);
		pref.put("profile.password_manager_leak_detection", false);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", pref);
		
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		
		driver.close();
	}

}
