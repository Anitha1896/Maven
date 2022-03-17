package com.projects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToNewExcelStudentDetails {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\Details.xlsx");
		Workbook b = new XSSFWorkbook();
		Sheet sh = b.createSheet("Student Details");

		Row r0 = sh.createRow(0);
		Row r1 = sh.createRow(1);
		Row r2 = sh.createRow(2);
		Row r3 = sh.createRow(3);
		Row r4 = sh.createRow(4);
		Row r5 = sh.createRow(5);
		Row r6 = sh.createRow(6);
		Row r7 = sh.createRow(7);
		Row r8 = sh.createRow(8);
		Row r9 = sh.createRow(9);
		Row r10 = sh.createRow(10);
		
		Cell c00 = r0.createCell(0);
		Cell c01 = r0.createCell(1);
		Cell c02 = r0.createCell(2);
		
		Cell c10 = r1.createCell(0);
		Cell c11 = r1.createCell(1);
		Cell c12 = r1.createCell(2);
				
		Cell c20 = r2.createCell(0);
		Cell c21 = r2.createCell(1);
		Cell c22 = r2.createCell(2);
		
		Cell c30 = r3.createCell(0);
		Cell c31 = r3.createCell(1);
		Cell c32 = r3.createCell(2);
		
		Cell c40 = r4.createCell(0);
		Cell c41 = r4.createCell(1);
		Cell c42 = r4.createCell(2);
		
		Cell c50 = r5.createCell(0);
		Cell c51 = r5.createCell(1);
		Cell c52 = r5.createCell(2);
		
		Cell c60 = r6.createCell(0);
		Cell c61 = r6.createCell(1);
		Cell c62 = r6.createCell(2);
		
		Cell c70 = r7.createCell(0);
		Cell c71 = r7.createCell(1);
		Cell c72 = r7.createCell(2);
		
		Cell c80 = r8.createCell(0);
		Cell c81 = r8.createCell(1);
		Cell c82 = r8.createCell(2);
		
		Cell c90 = r9.createCell(0);
		Cell c91 = r9.createCell(1);
		Cell c92 = r9.createCell(2);
		
		Cell c100 = r10.createCell(0);
		Cell c101 = r10.createCell(1);
		Cell c102 = r10.createCell(2);
		
				
		c00.setCellValue("S.No");
		c01.setCellValue("Name");
		c02.setCellValue("Course");

		c10.setCellValue("1");
		c11.setCellValue("Maria");
		c12.setCellValue("Selenium-Java");

		c20.setCellValue("2");
		c21.setCellValue("Hari");
		c22.setCellValue("Oracle");
		
		c30.setCellValue("3");
		c31.setCellValue("Anitha");
		c32.setCellValue("Oracle");
		
		c40.setCellValue("4");
		c41.setCellValue("Nirmala");
		c42.setCellValue("Selenium-Java");
		
		c50.setCellValue("5");
		c51.setCellValue("Vineesha");
		c52.setCellValue("Oracle");
		
		c60.setCellValue("6");
		c61.setCellValue("Akila");
		c62.setCellValue("Manual Testing");
		
		c70.setCellValue("7");
		c71.setCellValue("Arun");
		c72.setCellValue("Selenium-Java");
		
		c80.setCellValue("8");
		c81.setCellValue("Vikram");
		c82.setCellValue("Selenium-Java");

		c90.setCellValue("9");
		c91.setCellValue("Durga");
		c92.setCellValue("Manual Testing");
		
		c100.setCellValue("10");
		c101.setCellValue("Malathi");
		c102.setCellValue("Manual Testing");
		
		FileOutputStream fOut = new FileOutputStream(f);
		b.write(fOut);
	}
}
