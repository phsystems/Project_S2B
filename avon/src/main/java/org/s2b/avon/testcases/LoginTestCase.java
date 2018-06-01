package org.s2b.avon.testcases;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.s2b.avon.framework.Drives;
import org.s2b.avon.framework.Reports;
import org.s2b.avon.framework.ScreenShot;
import org.s2b.avon.tasks.HomeTask;
import org.s2b.avon.tasks.LoginTask;
import org.s2b.avon.verificationpoints.LoginVerificationPoint;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestCase {
	private WebDriver driver;
	private HomeTask homePage;
	private LoginTask logintask;
	private LoginVerificationPoint verificationPoint;
	ExtentReports extent;
	ExtentTest logger;

	@Before
	public void setUp() {
		// Reports.startTest("Login");

		this.driver = Drives.getFirefoxDriver();
		// driver.get("http://www.avon.com.br/");
		// driver.manage().window().maximize();
		homePage = new HomeTask(driver);

		logintask = new LoginTask(driver);

		verificationPoint = new LoginVerificationPoint(driver);

	}

	@Test
	public void passTest() throws IOException {
		logger = extent.startTest("passTest");
		driver.get("http://www.avon.com.br/");
		driver.manage().window().maximize();
		Reports.log(LogStatus.INFO, "The website has started.", ScreenShot.capture(driver));
		// this.homePage.accessRegistrationPage();

		driver.get("https://www.avoncomigo.avon.com.br/widget/avonwg2/#/login");
		driver.manage().window().maximize();

		Reports.log(LogStatus.INFO, "The website has started.", ScreenShot.capture(driver));

		logintask.fillForm("65846980", "6965fi");

		Reports.log(LogStatus.INFO, "Dados inseridos no formulario.", ScreenShot.capture(driver));

		verificationPoint.checkInvalidLoginMessage();
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
