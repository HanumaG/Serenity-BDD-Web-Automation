package pages;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;

public class Labcorp_JobDescriptionPage extends PageObject{
	
	public String getJobTitle()
	{
		//driver.findElement(By.id("input-4")).sendKeys("jayakowsalyadevi@gmail.com");

		WebElement jobtitle= $(By.xpath("//h1[@class='job-title']"));		
		
		return waitFor(jobtitle).getText();
	}


	public String getJobLocation()
	{

		//WebElement jobLocation= $(By.xpath("(//h1[@class='job-title']//following::span[contains(text(),'Location')])//following::i[1]"));

		WebElement jobLocation = $(By.xpath("(//h1[@class='job-title']//following::span[@class='au-target job-location'])"));
		return jobLocation.getText().replace("Location", "").trim();
	}
	
	public String getJobId()
	{

		WebElement jobId= $(By.xpath("(//span[@class='au-target jobId'])"));

		return jobId.getText().split(":")[1].trim();	}
	
	public String experienceLineOne()
	{
		WebElement expLineOne= $(By.xpath("//*[text()='Experience:']//following::li[1]"));

		return expLineOne.getText();
	}
	public String experienceLineTwo()
	{
		WebElement expLineTwo= $(By.xpath("//*[text()='Experience:']//following::li[2]"));

		return expLineTwo.getText();
	}
	public String experienceLineThree()
	{
		WebElement expLineThree= $(By.xpath("//*[text()='Experience:']//following::li[3]"));

		return expLineThree.getText();
	}
	
	public void applyNow()
	{
		WebElement applyButton= $(By.xpath("//*[text()='Apply Now']"));

		applyButton.click();
	}
}
