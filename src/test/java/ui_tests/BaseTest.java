package ui_tests;

import org.testng.annotations.Test;

import configuration.DriverConfiguration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {

	private static WebDriver driver;

  @BeforeSuite
  @Parameters({"browser"})
  public void beforeSuite(String browser) {
	  DriverConfiguration config = new DriverConfiguration(browser);
	  driver = config.getDriver();
  }

  @AfterSuite
  public void afterSuite() {
  }
  
  @AfterTest
  public void afterTest() {
  }


}
