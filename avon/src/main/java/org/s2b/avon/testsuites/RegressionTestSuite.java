package org.s2b.avon.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.s2b.avon.framework.*;
import org.s2b.avon.testcases.*;
@RunWith(Suite.class)
@SuiteClasses({
	LoginTestCase.class,
	RegistrationWrongPasswordTestCase.class
})

public class RegressionTestSuite {
	@BeforeClass
	public static void initTest() {
		Report.create("Avon", "Suite de Regressao");
	}

	@AfterClass
	public static void endTest() {
		Report.close();
	}

}
