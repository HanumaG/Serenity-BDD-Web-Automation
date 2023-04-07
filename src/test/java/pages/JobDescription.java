package pages;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;



public class JobDescription {
	
Labcorp_JobDescriptionPage jobPage;
	
	@Step
	public void verifyJobDetails(String jobTitle, String jobLocation, String jobID, String line1, String line2, String line3)
	{
		SoftAssertions softAssertion = new SoftAssertions();		
		softAssertion.assertThat(jobPage.getJobTitle()).isEqualTo(jobTitle);
		softAssertion.assertThat(jobPage.getJobLocation().trim()).isEqualTo(jobLocation);
		softAssertion.assertThat(jobPage.getJobId().trim()).isEqualTo(jobID);
		
		softAssertion.assertThat(jobPage.experienceLineOne()).isEqualTo(line1);
		softAssertion.assertThat(jobPage.experienceLineTwo()).isEqualTo(line2);
		softAssertion.assertThat(jobPage.experienceLineThree()).isEqualTo(line3);
		
		softAssertion.assertAll();
	}
	@Step
	public void clickOnApply()
	{
		jobPage.applyNow();
	}

}
