package page_objects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	By pageTitle = By.cssSelector("h1");
	By usernameField = By.id("username");
	By passwordField = By.id("password");
	By loginButton = By.cssSelector("MuiButtonBase-root");

	public LoginPage() {

	}

	public String getPageTitle() {
		return getPageTitleText(pageTitle);
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
