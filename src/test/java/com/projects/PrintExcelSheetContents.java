package com.projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintExcelSheetContents {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\Details.xlsx");

		FileInputStream fInput = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fInput);

		Sheet sheet = w.getSheet("Student Details");

		int rowsCount = sheet.getPhysicalNumberOfRows();

		System.out.println("Total no. of rows:" + rowsCount);

		for (int i = 0; i < rowsCount; i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				
				int cellType = c.getCellType();
				
				if (cellType==1) {
					
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("DD/MM/YYYY");
					String value = dateFormat.format(date);
					System.out.println(value);
				}
				else {
					double numericCellValue = c.getNumericCellValue();
					long numeric=(long)numericCellValue;
					String value = String.valueOf(numeric);
					System.out.println(value);
				}
			}
		}


	}
}
