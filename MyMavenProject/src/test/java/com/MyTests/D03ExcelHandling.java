package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class D03ExcelHandling {
	/*
	 * For Excel handling you need to add 2 dependencies
	 * 1. Apache POI
	 * 2. Apache POI OOXML
	 */
	
	String fPath = "D:\\AViIT\\Demos\\Selenium_18\\MyAtuomationProject\\ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void readAllData() {
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < rows; i++) {
			row = sheet.getRow(i);
			for(int j = 0; j < cells; j++) {
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
			System.out.println("-------XXX---------");
		}
		
	}
	
	@Test
	public void trial() {
		Assert.assertTrue(false);
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
