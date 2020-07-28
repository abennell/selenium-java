package page_objects;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

	By pageTitle = By.cssSelector("h6.MuiTypography-subtitle2");

	public DashboardPage() {

	}

	public String getPageTitle() {
		return getPageTitleText(pageTitle);
	}

}
