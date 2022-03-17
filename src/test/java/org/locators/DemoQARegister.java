package org.locators;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQARegister extends BaseClass {

	public DemoQARegister() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement> gender;
	
	@FindBy(id="userNumber")
	private WebElement mobileNumber;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dOBField;
	
	@FindBy(xpath="//button[text()='Previous Month']")
	private WebElement previousMonth;
	
	@FindBy(xpath="//button[text()='Next Month']")
	private WebElement nextMonth;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement selectMonth;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement selectYear;
	
	@FindBy(xpath="//div[@role='option']")
	private List<WebElement> selectDate;
	
	@FindAll({
	@FindBy(id="subjectsContainer"),
	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	})
	private WebElement subjects;
	
	@FindBy(xpath="//input[@id='hobbies-checkbox-1']")
	private WebElement hobby1;
	
	@FindBy(xpath="//input[@id='hobbies-checkbox-2']")
	private WebElement hobby2;
	
	@FindBy(xpath="//input[@id='hobbies-checkbox-3']")
	private WebElement hobby3;
	
	@FindAll({
	@FindBy(id="currentAddress"),
	@FindBy(tagName="textarea")
	})
	private WebElement address;
	
	@FindBy(xpath="//div[@class=' css-1hwfws3']")
	private List<WebElement> stateAndCity;
	
	@FindBy(id="submit")
	private WebElement submit;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public List<WebElement> getGender() {
		return gender;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getdOBField() {
		return dOBField;
	}

	public WebElement getPreviousMonth() {
		return previousMonth;
	}

	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public List<WebElement> getSelectDate() {
		return selectDate;
	}

	public WebElement getSubjects() {
		return subjects;
	}

	public WebElement getHobby1() {
		return hobby1;
	}

	public WebElement getHobby2() {
		return hobby2;
	}

	public WebElement getHobby3() {
		return hobby3;
	}

	public WebElement getAddress() {
		return address;
	}

	public List<WebElement> getStateAndCity() {
		return stateAndCity;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
