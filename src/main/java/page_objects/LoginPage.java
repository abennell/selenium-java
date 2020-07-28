package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

	By pageTitle = By.cssSelector("h1");
	By usernameField = By.id("username");
	By passwordField = By.id("password");
	By loginButton = By.cssSelector("button[data-test='signin-submit']");

	public LoginPage() {
	}

	public String getPageTitle() {
		return getPageTitleText(pageTitle);
	}

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public DashboardPage clickSignInButton() {
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		driver.findElement(loginButton).click();
		return new DashboardPage();
	}

	public DashboardPage loginUser(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		return clickSignInButton();
	}
}
