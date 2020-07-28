package page_objects;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

	By pageTitle = By.id("");

	public DashboardPage() {

	}

	public String getPageTitle() {
		return getPageTitleText(pageTitle);
	}

}
