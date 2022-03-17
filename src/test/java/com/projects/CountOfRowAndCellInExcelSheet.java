package com.projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountOfRowAndCellInExcelSheet {
public static void main(String[] args) throws IOException {
	File f = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\Details.xlsx");

	FileInputStream fInput = new FileInputStream(f);

	Workbook w = new XSSFWorkbook(fInput);

	Sheet sheet = w.getSheet("Student Details");

	int rowsCount = sheet.getPhysicalNumberOfRows();

	System.out.println("Total no. of rows:" + rowsCount);
	int totalCellCount=0;
	
	for (int i = 0; i < rowsCount; i++) {
		Row row = sheet.getRow(i);
		int cells = row.getPhysicalNumberOfCells();
		totalCellCount=cells+totalCellCount;
	}
	System.out.println("Total no.of cells: "+totalCellCount);
}
}
