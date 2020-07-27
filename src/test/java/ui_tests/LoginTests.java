package ui_tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page_objects.DashboardPage;
import page_objects.LoginPage;

public class LoginTests extends BaseTest {

	private LoginPage loginPage;

	public LoginTests() {
		loginPage = new LoginPage();
	}

	@Test
	@Parameters({ "username", "password" })
	private void successfulLoginTest(String username, String password) {
		DashboardPage dashboardPage = loginPage.loginUser(username, password);
		dashboardPage.checkPageIsLoaded();

	}

}
