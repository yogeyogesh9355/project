package com.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.excelutilities.ExcelData;

public class Jpet_Register {
	WebDriver driver;
	WebElement Register;

	public void register() throws IOException 
	{
		ExcelData ed = new ExcelData();	
		for(int i=1;i<=3;i++)
		{System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
		
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");
			Register = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
			Register.click();
			System.out.println("click on register now button");
			
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("repeatedPassword")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("account.firstName")).sendKeys(ed.Firstname(i));
			driver.findElement(By.name("account.lastName")).sendKeys(ed.Lastname(i));
			driver.findElement(By.name("account.email")).sendKeys(ed.Email(i));
			driver.findElement(By.name("account.phone")).sendKeys(ed.Phone(i));
			driver.findElement(By.name("account.address1")).sendKeys(ed.Address1(i));
			driver.findElement(By.name("account.address2")).sendKeys(ed.Address2(i));
			driver.findElement(By.name("account.city")).sendKeys(ed.City(i));
			driver.findElement(By.name("account.state")).sendKeys(ed.State(i));
			driver.findElement(By.name("account.zip")).sendKeys(ed.Zip(i));
			driver.findElement(By.name("account.country")).sendKeys(ed.Country(i));
			driver.findElement(By.name("account.listOption")).click();
			driver.findElement(By.name("account.bannerOption")).click();
			driver.findElement(By.name("newAccount")).click();
			driver.close();
	}
	}
}





//
//public void language(String lang) {
//WebElement language = driver.findElement(By.name("account.languagePreference"));
//Select select=new Select(language);
//select.selectByVisibleText(lang);
//}
//public void favorite_category(String category) {
//WebElement favorite = driver.findElement(By.name("account.languagePreference"));
//Select select=new Select(favorite);
//select.selectByVisibleText(category);
//}