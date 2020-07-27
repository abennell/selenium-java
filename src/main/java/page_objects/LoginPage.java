package page_objects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	By pageTile = By.id("");
	By usernameField = By.id("");
	By passwordField = By.id("");
	By loginButton = By.id("");

	public LoginPage() {

	}

	public void checkPageIsLoaded() {

	}

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(usernameField).sendKeys(password);
	}

	public DashboardPage clickSignInButton() {
		driver.findElement(loginButton).click();
		return new DashboardPage();
	}

	public DashboardPage loginUser(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickSignInButton();
		return clickSignInButton();
	}
}
