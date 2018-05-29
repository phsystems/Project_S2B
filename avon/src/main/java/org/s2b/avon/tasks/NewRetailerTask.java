package org.s2b.avon.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.s2b.avon.appobjects.NewRetailerAppObject;

public class NewRetailerTask {
	private NewRetailerAppObject newRetailer;
	
	public NewRetailerTask(WebDriver driver) {
		this.newRetailer = new NewRetailerAppObject(driver);
	}
	public void newFillForm (String firstName, String lastName, String dateOfBirth, String cpfNumber, String email, String confEmail, String dayPhoneOne, String dayPhoneTwo, String mobPhoneOne, String mobPhoneTwo, String time, String postcode, String addressOne, String addressThree) {
		
		newRetailer.getFirstNameTextField().sendKeys(firstName);
		newRetailer.getlastNameeTextField().sendKeys(lastName);
		newRetailer.getDateOfBirthTextField().sendKeys(dateOfBirth);
		newRetailer.getCpfNumberTextField().sendKeys(cpfNumber);
		newRetailer.getEmailTextField().sendKeys(email);
		newRetailer.getConfEmailTextField().sendKeys(confEmail);
		newRetailer.getDDDHousePhoneOneTextField().sendKeys(dayPhoneOne);
		newRetailer.getHousePhoneOneTextField().sendKeys(dayPhoneTwo);
		newRetailer.getDDDCellPhoneOneTextField().sendKeys(mobPhoneOne);
		newRetailer.getCellPhoneOneTextField().sendKeys(mobPhoneTwo);
		//newRetailer.getChoiceTimeComboBox().sendKeys(Keys.valueOf(enumType, name));
		newRetailer.getCEPTextField().sendKeys(postcode);
		newRetailer.getAddressTextField().sendKeys(addressOne);
		newRetailer.getFullAddressTextField().sendKeys(addressThree);
		newRetailer.getTermAndConditions().click();
			
	}
	public void acessRetailerSearch() {
		newRetailer.getCreateButton().click();
	}
 
		
}
