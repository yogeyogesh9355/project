package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class linkedinlogin 
{

WebDriver driver;
	
	By searchtab=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");	

	public void LoginToApp_username(String userid)
	{
		driver.findElement(searchtab).sendKeys(userid);
	}
	public void LoginToApp_password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void ClickToLoginButton()
	{
		driver.findElement(loginbutton).click();
	}
	
}
