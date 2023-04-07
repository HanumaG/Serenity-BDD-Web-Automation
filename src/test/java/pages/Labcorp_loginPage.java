package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://labcorp.wd1.myworkdayjobs.com/en-US/External/login")

public class Labcorp_loginPage extends PageObject{

	public void enterUname()
	{
		//driver.findElement(By.id("input-4")).sendKeys("jayakowsalyadevi@gmail.com");
		
	WebElement username= $(By.id("input-4"));
	username.sendKeys("jayakowsalyadevi@gmail.com");
	
	}
	
	public void enterPassword()
	{
		//driver.findelement(By.id)
		System.out.println("Implicit Time defined for the test (in seconds):" + getImplicitWaitTimeout().toSeconds());
		System.out.println("Implicit Time defined for the test (in milliseconds):" + getImplicitWaitTimeout().toMillis());
	WebElement password= $(By.xpath("//*[@data-automation-id='password']"));
	password.sendKeys("Interview@123");
	
	}
	
	public void clickSignin()
	{
		//click on sign in button
		$(By.xpath("//div[@data-automation-id='click_filter']")).click();
	
	}

	
}
