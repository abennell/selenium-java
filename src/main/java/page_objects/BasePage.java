package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configuration.DriverConfiguration;

public class BasePage {

	protected WebDriver driver;

	public BasePage() {
		driver = DriverConfiguration.driver;
	}

	public String getH1PageValue(By elementLocator) {
		return driver.findElement(elementLocator).getText();

	}
}
