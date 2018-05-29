package org.s2b.avon.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewRetailerAppObject {
	private WebDriver driver;
		
		public NewRetailerAppObject(WebDriver driver) {
			this.driver = driver;
		}
		public WebElement getFirstNameTextField() {
			return driver.findElement(By.name("firstName"));
		}
		public WebElement getlastNameeTextField() {
			return driver.findElement(By.name("lastName"));
		}
		public WebElement getDateOfBirthTextField() {
			return driver.findElement(By.name("dateOfBirth"));
		}
		public WebElement getCpfNumberTextField() {
			return driver.findElement(By.name("cpfNumber"));
		}
		public WebElement getEmailTextField() {
			return driver.findElement(By.name("email"));
		}
		public WebElement getConfEmailTextField() {
			return driver.findElement(By.name("confEmail"));
		}
		public WebElement getDDDHousePhoneOneTextField() {
			return driver.findElement(By.name("dayPhoneOne"));
		}
		public WebElement getHousePhoneOneTextField() {
			return driver.findElement(By.name("dayPhoneTwo"));
		}
		public WebElement getDDDCellPhoneOneTextField() {
			return driver.findElement(By.name("mobPhoneOne"));
		}
		public WebElement getCellPhoneOneTextField() {
			return driver.findElement(By.name("mobPhoneTwo"));
		}
		/*public WebElement getChoiceTime(WebElement value) {
		WebElement element = this.driver.findElement(By.name("prefTime"));
		Select combo = new Select(element);
		combo.selectByValue("value");
		return value;
		}*/
		public WebElement getChoiceTimeComboBox() {
			return driver.findElement(By.name("prefTime"));
		}
		public WebElement getCEPTextField() {
			return driver.findElement(By.name("postcode"));
		}
		public WebElement getAddressTextField() {
			return driver.findElement(By.name("addressOne"));
		}
		public WebElement getFullAddressTextField() {
			return driver.findElement(By.name("addressThree"));
		}
		public WebElement getTermAndConditions() {
			return driver.findElement(By.name("terms"));
		}	
		public WebElement getCreateButton() {
			return driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td > div > form > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td > table > tbody > tr > td:nth-child(3) > a > button"))
		}
		
}
