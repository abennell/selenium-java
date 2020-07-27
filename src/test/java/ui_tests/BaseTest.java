package ui_tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import configuration.DriverConfiguration;

public class BaseTest {

	@BeforeSuite
	@Parameters({ "browser" })
	public void beforeSuite(String browser) {
		new DriverConfiguration(browser);
	}

	@AfterSuite
	public void afterSuite() {
		DriverConfiguration.driver.quit();
	}

	@AfterTest
	public void afterTest() {
	}

}
