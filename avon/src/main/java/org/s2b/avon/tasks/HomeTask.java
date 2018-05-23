package org.s2b.avon.tasks;

import org.openqa.selenium.WebDriver;

import org.s2b.avon.appobjects.*;

public class HomeTask {
	
	private HomeAppObject home;
	
	public HomeTask(WebDriver driver){
		this.home = new HomeAppObject(driver);
	}
	
	public void accessRegistrationPage(){
		home.getLoginButton().click();
	}
	
	/*public void logout() {
		home.getLoginButton().click();
		}*/
	}
