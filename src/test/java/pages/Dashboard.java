package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
Labcorp_DashboardPage dashboardpage;
	
	@Step
	public void verifySignedIn_username()
	{
		dashboardpage.verifyTitle();
		dashboardpage.verifySignedinUsername();
	}
	@Step
	public void clickOnCareersHome()
	{
		dashboardpage.clickOnCareerHome();
	}
	
	@Step
	public void jobSearchBox()
	{
		dashboardpage.clickOnSearchBox();
	}


}
