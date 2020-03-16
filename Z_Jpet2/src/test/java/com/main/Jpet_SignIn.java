package com.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutilities.ExcelData;

public class Jpet_SignIn {
	WebDriver driver;
	WebElement Register;

		public void LaunchBrowser7() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		public void ApplicationHomePage7() {
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		}
		
		public void EnterSignInDetails() throws IOException, InterruptedException {
		
			ExcelData ed = new ExcelData();	
		
			for(int i=1;i<=3;i++)
		{
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");

			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			
			Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
			Register.click();
			Thread.sleep(5000);
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
		}
	}
}
