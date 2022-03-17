package com.projects;

import java.io.IOException;


import org.baseclass.BaseClass;

public class UpdateExcelFile extends BaseClass {
	public static void main(String[] args) throws IOException {
//		writeToNewSheet("TestData", "DemoQA", 0, 0, "S.No");
//		writeToExistingRow("TestData", "DemoQA", 0, 1, "First Name");
//		writeToExistingRow("TestData", "DemoQA", 0, 2, "Last Name");
//		writeToExistingRow("TestData", "DemoQA", 0, 3, "Email");
//		writeToExistingRow("TestData", "DemoQA", 0, 4, "Mobile Number");
//		writeToExistingRow("TestData", "DemoQA", 0, 6, "Subjects");
//		writeToExistingRow("TestData", "DemoQA", 0, 5, "Address");
		writeToNewRow("TestData", "DemoQA", 2, 6, "M");
		writeToNewRow("TestData", "DemoQA", 3, 6, "E");
		writeToNewRow("TestData", "DemoQA", 4, 6, "S");
		writeToNewRow("TestData", "DemoQA", 5, 6, "Social Science");
		
		writeToNewRow("TestData", "DemoQA", 1, 0, "1");
		writeToExistingRow("TestData", "DemoQA", 1, 1, "Viji");
		writeToExistingRow("TestData", "DemoQA", 1, 2, "M");
		writeToExistingRow("TestData", "DemoQA", 1, 3, "viji@gmail.com");
		writeToExistingRow("TestData", "DemoQA", 1, 4, "9086753421");
		writeToExistingRow("TestData", "DemoQA", 1, 6, "H");
		writeToExistingRow("TestData", "DemoQA", 1, 5, "Uttar Pradesh");

	}
}
