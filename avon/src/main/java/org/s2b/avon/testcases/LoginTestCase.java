package org.s2b.avon.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import org.s2b.avon.framework.*;
import org.s2b.avon.tasks.*;
import org.s2b.avon.verificationpoints.*;

public class LoginTestCase {
	private WebDriver driver;
	private HomeTask homePage;
	private LoginTask logintask;
	private LoginVerificationPoint verificationPoint;
	
	
	@Before
	public void setUp() {
		Report.startTest("Login");
		driver = Drives.getFirefoxDriver();
		//driver.get("http://www.avon.com.br/");
		//driver.manage().window().maximize();		
		homePage = new HomeTask(driver);
		
		logintask = new LoginTask(driver);
		
		verificationPoint = new LoginVerificationPoint(driver);		
		
	}
	@Test
	public void testMain() {
		driver.get("http://www.avon.com.br/");
		driver.manage().window().maximize();
		Report.log(Status.INFO, "The website was loaded.", ScreenShot.capture(driver));
				this.homePage.accessRegistrationPage();
		
		driver.get("https://www.avoncomigo.avon.com.br/widget/avonwg2/#/login");
		driver.manage().window().maximize();
		
				
		//Report.log(Status.INFO, "The website was loaded.", ScreenShot.capture(driver));
		
		logintask.fillForm("65846980", "6965fi");
		
		//Report.log(Status.INFO, "Dados inseridos no formulario.", ScreenShot.capture(driver));

		verificationPoint.checkInvalidLoginMessage();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	

}
