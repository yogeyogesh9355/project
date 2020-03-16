package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.WrapperEx;
import pages.linkedinlogin;

public class LoginPageTestCase extends WrapperEx
{
@BeforeClass
public void startup() {
	launchApplication("chrome","https://www.linkedin.com/login");
}
	@Test
	public void login()
	{
		linkedinlogin lpage=new linkedinlogin(driver);
		lpage.LoginToApp_username("yogeyogesh9355@gmail.com");
		lpage.LoginToApp_password("8667666155");
		lpage.ClickToLoginButton();
	}
@AfterClass
public void endUp()
{
	
	quit();	

}
}