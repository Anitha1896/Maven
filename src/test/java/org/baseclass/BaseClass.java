package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert alt;
	public static JavascriptExecutor js;
	public static Select s;
	public static FluentWait<WebDriver> f;
	public static WebDriverWait w;
	public static File fi;
	public static Workbook b;
	public static Sheet sh;
	public static Row ro;
	public static Cell c;
	public static Date d;
	
	public static void launchChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchFireFoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void launchIEDriver() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	
	public static void launchEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	public static void launchURL(String url) {
		driver.get(url);

	}

	public static void navigateURL(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refreshPage() {
		driver.navigate().refresh();
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static Date getDateAndTime() {
		d= new Date();
		return d;
	}
	
	public static void closeTab() {
		driver.close();
	}

	public static void sendUserText(WebElement textBox, String userText) {
		textBox.sendKeys(userText);

	}

	public static void clickButton(WebElement button) {
		button.click();
	}

	public static void holdProgram(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static String getTextFromWebPage(WebElement text) {
		String t = text.getText();
		return t;

	}

	public static String getInputText(WebElement inputText) {
		String val = inputText.getAttribute("value");
		return val;
	}

	public static String getAttributeValue(WebElement element, String attributeName) {
		String val = element.getAttribute(attributeName);
		return val;
	}

	public static void mouseHover(WebElement mouseHover) {
		a = new Actions(driver);
		a.moveToElement(mouseHover).perform();

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void doubleClick(WebElement doubleClick) {
		a = new Actions(driver);
		a.doubleClick(doubleClick).perform();
	}

	public static void contextClick(WebElement rightClick) {
		a = new Actions(driver);
		a.contextClick(rightClick).perform();
	}

	public static void sendUserTextAction(WebElement target, String userText) {
		a = new Actions(driver);
		a.sendKeys(target, userText).perform();
	}

	public static void clickButtonAction(WebElement target) {
		a = new Actions(driver);
		a.click(target).perform();
	}

	public static void copyContent() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void pasteContent() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void cutContent() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void tabKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void enterKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void movedownKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void moveupKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void capsLock() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
	}

	public static void capsRelease() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	}

	public static void acceptAlert() {
		alt = driver.switchTo().alert();
		alt.accept();
	}

	public static void dismissAlert() {
		alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public static String getTextFromAlert() {
		alt = driver.switchTo().alert();
		String altText = alt.getText();
		return altText;
	}

	public static void promptAlert(String userText) {
		alt = driver.switchTo().alert();
		alt.sendKeys(userText);
	}

	public static void switchToDefaultPage() {
		driver.switchTo().defaultContent();
	}

	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// ID or NAME attribute value
	public static void switchToFrameByAttribute(String value) {
		driver.switchTo().frame(value);
	}

	public static void switchToFrameByWebElementRef(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToWindow(String WinId) {
		driver.switchTo().window(WinId);
	}

	public static void copyFile(File srcFile, File destFile) throws IOException {
		FileUtils.copyFile(srcFile, destFile);
	}

	public static void takeSingleScreenShot(String snapName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Ani\\Projects\\MavenFrameWork\\Snapshots\\" + snapName + ".png");
		copyFile(src, dest);
	}

	public static void jsScrollDown(WebElement scrollDown) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public static void jsScrollUp(WebElement scrollUp) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public static void jsSendUserText(String text, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);

	}

	public static String jsGetAttributeValue(WebElement element) {
		js = (JavascriptExecutor) driver;
		Object value = js.executeScript("return arguments[0].getAttribute('value')", element);
		String attValue = (String) value;
		return attValue;
	}

	public static void jsClickButton(WebElement button) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", button);
	}

	public static String jsGetTextFromWebPage(WebElement element) {
		js = (JavascriptExecutor) driver;
		Object text = js.executeScript("return arguments[0].innerText", element);
		String plainText = (String) text;
		return plainText;
	}

	public static void selectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static boolean isMultipleOptions(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static void printAllOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		System.out.println("\nAll available options:");
		for (WebElement o : allOptions) {
			System.out.println(o);
		}
	}

	public static List<WebElement> getAllOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		return allOptions;
	}

	public static void printAllSelectedOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("\nAll selected options:");
		for (WebElement op : allSelectedOptions) {
			System.out.println(op);
		}
	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public static void printFirstSelectedOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("\nFirst Selected Option: " + firstSelectedOption);
	}

	public static WebElement getFirstSelectedOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public static void deSelectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	public static void deSelectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deSelectByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deSelectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void waitForVisibilityOfElementWebDriver(int timeout, WebElement element) {
		w = new WebDriverWait(driver, timeout);
		w.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForVisibilityOfElementFluent(int timeout, WebElement element, int interval) {
		f = new FluentWait<WebDriver>(driver);
		f.withTimeout(Duration.ofSeconds(timeout)).pollingEvery(Duration.ofSeconds(interval)).ignoring(Throwable.class);
		f.until(ExpectedConditions.visibilityOf(element));
	}

	public static void printHeadingInTable(WebElement table) {

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("\nHeadings in the WebTable");
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> headings = row.findElements(By.tagName("th"));
			for (int j = 0; j < headings.size(); j++) {
				String heading = headings.get(j).getText();
				System.out.println(heading);

			}
		}

	}

	public static void printDataInTable(WebElement table) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("\nData in the WebTable");
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> datas = row.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				String data = datas.get(j).getText();
				System.out.println(data);
			}
		}

	}

	public static void printEntireWebTable(WebElement table) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("\nContent in the WebTable");
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> headings = row.findElements(By.tagName("th"));
			for (int j = 0; j < headings.size(); j++) {
				String heading = headings.get(j).getText();
				System.out.println("\n" + heading);

			}
			List<WebElement> datas = row.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				String data = datas.get(j).getText();
				System.out.println(data);
			}
		}

	}

	public static String readExcel(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fIn);
		Sheet sh = b.getSheet(sheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);

		int cellType = c.getCellType();
		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/YYYY");
			value = dFormat.format(d);
		} else {
			double n = c.getNumericCellValue();
			long l = (long) n;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void writeToNewFile(String fileName, String sheetName, int rowNo, int cellNo, String data)
			throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		b = new XSSFWorkbook();
		sh = b.createSheet(sheetName);
		ro = sh.createRow(rowNo);
		c = ro.createCell(cellNo);
		c.setCellValue(data);

		FileOutputStream fOut = new FileOutputStream(fi);
		b.write(fOut);
	}

	public static void writeToNewSheet(String fileName, String sheetName, int rowNo, int cellNo, String data)
			throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fInput = new FileInputStream(fi);
		b = new XSSFWorkbook(fInput);
		sh = b.createSheet(sheetName);
		ro = sh.createRow(rowNo);
		c = ro.createCell(cellNo);
		c.setCellValue(data);

		FileOutputStream fOut = new FileOutputStream(fi);
		b.write(fOut);
	}

	public static void writeToNewRow(String fileName, String sheetName, int rowNo, int cellNo, String data)
			throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fInput = new FileInputStream(fi);
		b = new XSSFWorkbook(fInput);
		sh = b.getSheet(sheetName);
		ro = sh.createRow(rowNo);
		c = ro.createCell(cellNo);
		c.setCellValue(data);

		FileOutputStream fOut = new FileOutputStream(fi);
		b.write(fOut);
	}

	public static void writeToExistingRow(String fileName, String sheetName, int rowNo, int cellNo, String data)
			throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fInput = new FileInputStream(fi);
		b = new XSSFWorkbook(fInput);
		sh = b.getSheet(sheetName);
		ro = sh.getRow(rowNo);
		c = ro.createCell(cellNo);
		c.setCellValue(data);

		FileOutputStream fOut = new FileOutputStream(fi);
		b.write(fOut);
	}

	public static void overWriteOnContains(String fileName, String sheetName, int rowNo, int cellNo, String condition,
			String cond1, String cond2) throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fInput = new FileInputStream(fi);
		b = new XSSFWorkbook(fInput);
		sh = b.getSheet(sheetName);
		ro = sh.getRow(rowNo);
		c = ro.getCell(cellNo);
		String value = c.getStringCellValue();

		if (value.contains(condition)) {
			c.setCellValue(cond1);
		} else {
			c.setCellValue(cond2);
		}
		FileOutputStream fOut = new FileOutputStream(fi);
		b.write(fOut);
	}

	public static void overWriteWithoutCondition(String fileName, String sheetName, int rowNo, int cellNo,String replacedData) throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fInput = new FileInputStream(fi);
		b = new XSSFWorkbook(fInput);
		sh = b.getSheet(sheetName);
		ro = sh.getRow(rowNo);
		c = ro.getCell(cellNo);
		c.setCellValue(replacedData);
		FileOutputStream fOut = new FileOutputStream(fi);
		b.write(fOut);
	}

	public static String overWriteForUserDefinedCondition(String fileName, String sheetName, int rowNo, int cellNo)
			throws IOException {
		fi = new File("E:\\Ani\\Projects\\MavenFrameWork\\ExcelWorkBooks\\" + fileName + ".xlsx");
		FileInputStream fInput = new FileInputStream(fi);
		b = new XSSFWorkbook(fInput);
		sh = b.getSheet(sheetName);
		ro = sh.getRow(rowNo);
		c = ro.getCell(cellNo);
		String value = c.getStringCellValue();
		return value;
	}

}
