package pages;

import org.assertj.core.api.SoftAssertions;

import net.thucydides.core.annotations.Step;

public class AppliedjobVerification {

	
	Labcorp_AppliedJobVerificationPage jobverificationpage;
	
	@Step
	public void verifyAppliedJob(String jobTitle, String successMessage, String jobID,String submittedDate)
	{
		SoftAssertions softAssertion = new SoftAssertions();		
		softAssertion.assertThat(jobverificationpage.getAppliedJobTitle()).isEqualTo(jobTitle);
		softAssertion.assertThat(jobverificationpage.getAppliedJobMessage()).isEqualTo(successMessage);
		
		jobverificationpage.clickOnViewMyApplication();
		softAssertion.assertThat(jobverificationpage.getSubmittedJobTitle()).isEqualTo(jobTitle);	
		softAssertion.assertThat(jobverificationpage.getAppliedJobId()).isEqualTo(jobID);			
		softAssertion.assertThat(jobverificationpage.getDateSubmitted()).isEqualTo(submittedDate);
		softAssertion.assertAll();
	}
}
