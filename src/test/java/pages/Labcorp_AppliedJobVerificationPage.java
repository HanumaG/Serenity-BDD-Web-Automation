package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class Labcorp_AppliedJobVerificationPage  extends PageObject {

	
	public String getAppliedJobTitle()
	{
		//driver.findElement(By.id("input-4")).sendKeys("jayakowsalyadevi@gmail.com");
		Set<String> windows = getDriver().getWindowHandles();
		String ParentWindow= 	getDriver().getWindowHandle();
		System.out.println(" window handles is"+ windows +"parent window is"+ ParentWindow);
		for(String w: windows)
		{
			if(!w.equals(ParentWindow))
			{
			getDriver().switchTo().window(w);
		break;
			}
		}
		WebElement jobtitle= $(By.xpath("//*[contains(text(),'Software Engineer in Test (SDET)')]"));
		return waitFor(jobtitle).getText();
	}
	
	public String getSubmittedJobTitle() 
	{
		String title="";
		try {
		WebDriver driver = getDriver();	
		
			Thread.sleep(10);
		
		if (((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete")){
	         System.out.println("Page has loaded");
	      }
		Actions actions = new Actions(driver);
		WebElement activeJob = $(By.xpath("//*[contains(text(),'Active')]"));		
		
		actions.moveToElement(activeJob);
		actions.perform();
		//System.out.println("submiited job title is " + waitFor(jobtitle).getText());
		WebElement jobtitle= $(By.xpath("//*[contains(text(),'My Applications')]//following::table/tbody/tr/th/div/div/a"));
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		withTimeoutOf(Duration.ofSeconds(25)).waitFor(jobtitle).isDisplayed();		
				
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jobtitle);
		System.out.println("submiited job title is " + jobtitle.getText());
	title =  jobtitle.getText();	


	//	return waitFor(jobtitle).getText();
	}
		
catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return title;
			
	}
	public String getAppliedJobMessage()
	{		

		WebElement jobMessage= $(By.xpath("//h2[contains(text(),' already applied for this job')]"));		
		
		return jobMessage.getText();
	}
	
	public void clickOnViewMyApplication()
	{
		$(By.xpath("//span[contains(text(),'View My Applications')]")).click();
	}
	
	public String getAppliedJobId()
	{
		WebElement appliedJobId= $(By.xpath("//*[contains(text(),'My Applications')]//following::table/tbody/tr/td[1]"));		
		
		return waitFor(appliedJobId).getText();
		
	}
	
	public String getDateSubmitted()
	{
		return $(By.xpath("//*[contains(text(),'My Applications')]//following::table/tbody/tr/td[3]")).getText();
	}
}
