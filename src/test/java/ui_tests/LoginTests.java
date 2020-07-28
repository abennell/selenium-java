package ui_tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page_objects.DashboardPage;
import page_objects.LoginPage;

public class LoginTests extends BaseTest {

	private LoginPage loginPage;

	@Test
	@Parameters({ "username", "password" })
	private void successfulLoginTest(String username, String password) {
		loginPage = new LoginPage();
		DashboardPage dashboardPage = loginPage.loginUser(username, password);
		Assert.assertEquals(dashboardPage.getPageTitle(), "@Katharina_Bernier");
	}

}
