package com.projects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToNewExcelTestData {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\TestData.xlsx");
	Workbook b=new XSSFWorkbook();
	Sheet sh = b.createSheet("Facebook Login");
	
	Row r0 = sh.createRow(0);
	Row r1 = sh.createRow(1);
	Row r2 = sh.createRow(2);
	
	Cell c00 = r0.createCell(0);
	Cell c01 = r0.createCell(1);
	Cell c02 = r0.createCell(2);
	
	Cell c10 = r1.createCell(0);
	Cell c11 = r1.createCell(1);
	Cell c12 = r1.createCell(2);
	
	Cell c20 = r2.createCell(0);
	Cell c21 = r2.createCell(1);
	Cell c22 = r2.createCell(2);
	
	c00.setCellValue("S.No");
	c01.setCellValue("Email");
	c02.setCellValue("Password");
	
	c10.setCellValue("1");
	c11.setCellValue("Ani@gmail.com");
	c12.setCellValue("12345@yh");
	
	c20.setCellValue("2");
	c21.setCellValue("Mala@gmail.com");
	c22.setCellValue("0927323@dfh");
	
	FileOutputStream fOut=new FileOutputStream(f);
	b.write(fOut);
}
}
