package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

import static org.assertj.core.api.Assertions.*;

public class Labcorp_DashboardPage extends PageObject {

	
	public void verifyTitle()
	{
		//driver.findElement(By.id("input-4")).sendKeys("jayakowsalyadevi@gmail.com");
	System.out.println("Application title is " + getDriver().getTitle());
	assertThat(getDriver().getTitle()).isEqualTo("Workday");			
	
	}
	
	public void verifySignedinUsername()
	{
		//driver.findelement(By.id)
		
	WebElement username= $(By.xpath("//*[@id='accountSettingsButton']/span[2]"));
	username.getText();
	assertThat(username.getText()).isEqualTo("jayakowsalyadevi@gmail.com");
	
	}
	
	public void clickOnCareerHome()
	{		
		
	WebElement careerHome= $(By.xpath("//button[@data-automation-id='navigationItem-Careers Home']"));
	careerHome.click();
	
	}
	
	public void clickOnSearchBox()
	{	
		
		
	WebElement searchBox= $(By.xpath("//*[@id='typehead']"));
	searchBox.sendKeys("Software Engineer in Test (SDET) Bangalore,India");
	/*
	 * WebElement suggestion = $(By.xpath("//*[@id='typehead-result-item-0']"));
	 * 
	 * waitFor(suggestion).click();
	 */
	
	WebElement searchicon = $(By.xpath("//*[@id='ph-search-backdrop']"));
	searchicon.click();
	WebElement Job = $(By.xpath("//div[@class='job-title']/span[contains(text(),'Software Engineer in Test (SDET)')]"));
	waitFor(Job).click();		
			
	}

}
