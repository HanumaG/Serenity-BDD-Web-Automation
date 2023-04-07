package pages;

import net.thucydides.core.annotations.Step;

public class LoginPage {
	
	Labcorp_loginPage loginpage;
	
	@Step
	public void openApplication()
	{
		loginpage.open();
		
	}
	@Step
	public void enterUsername()
	{
		loginpage.enterUname();
	}
	@Step
	public void enterPassword()
	{
		loginpage.enterPassword();
	}
	@Step
	public void clicOnLoginButton()
	{
		loginpage.clickSignin();
	}

}
