package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.DriverConfiguration;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage() {
		driver = DriverConfiguration.getInstance().getDriver();
		wait = DriverConfiguration.getInstance().getWait();
	}

	public String getPageTitleText(By elementLocator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		return driver.findElement(elementLocator).getText().toString();
	}
}
