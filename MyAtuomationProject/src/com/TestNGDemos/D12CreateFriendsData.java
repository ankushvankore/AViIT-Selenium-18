package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12CreateFriendsData {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Dhanashri");
		
		//row = sheet.createRow(0);
		cell = row.createCell(1);
		cell.setCellValue("Thorat");
		
		sheet.createRow(1).createCell(0).setCellValue("Sagar");
		sheet.getRow(1).createCell(1).setCellValue("Raut");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles\\MyFriends.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet();
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		
		System.out.println("Data added successfuly!!!");
	}

}
