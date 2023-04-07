package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.AppliedjobVerification;
import pages.Dashboard;
import pages.JobDescription;
import pages.LoginPage;

public class lab_corp {
	
	@Steps
	LoginPage login;
	@Steps
	Dashboard dashboard;
	@Steps
	JobDescription jobDescription;	
	@Steps
	AppliedjobVerification appliedjobVerification;
	
	@Given("user logs in to labcorp portal with valid credential")
	public void user_logs_in()
	{
		login.openApplication();
		login.enterUsername();
		login.enterPassword();
		login.clicOnLoginButton();
	}

	
	 @When ("user search and applies for a job")
	 public void user_search_and_applies()
		{
			dashboard.verifySignedIn_username();
			dashboard.clickOnCareersHome();
			dashboard.jobSearchBox();
			
			jobDescription.verifyJobDetails("Software Engineer in Test (SDET)", "Bangalore, India",
					"2254638", "4+ years with web application & cross browser testing is a must",
					"4+ years with test automation framework and automated web testing",
					 "4+ years applied experience with programming and scripting languages such as Java, JavaScript, etc.");
			
			jobDescription.clickOnApply();		 
					
					
			
		}
	 
	 @Then ("user should be able to apply successfully for desired job")
	 public void user_should_be_applied_successfully()
		{
		 appliedjobVerification.verifyAppliedJob("Software Engineer in Test (SDET)", "You've already applied for this job.", "2254638", "April 5, 2023");
		}
}
