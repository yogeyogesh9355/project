package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkedIn_login {
	WebDriver driver;
	WebElement textbox;

	public void googlepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

	}
	public void LinkedIn_loginuser() throws InterruptedException
	{
		driver.get("https://www.linkedin.com/login");
		textbox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		if (textbox.isEnabled()) {
			textbox.sendKeys("yogesh");
			Thread.sleep(3000);
			}	
	}
	public void LinkedIn_loginpwd() 
		{
			driver.get("ht");
			textbox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			if (textbox.isEnabled()) {
				textbox.sendKeys("dheguvboxnmd");
							}
		}
				
			


	public void signin() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		driver.close();
	}

}