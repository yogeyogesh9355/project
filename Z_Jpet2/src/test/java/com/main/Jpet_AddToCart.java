package com.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_AddToCart {
	WebDriver driver;
	public void LaunchBrowser1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		public void ApplicationHomePage1() {
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		}
		public void addtocart1() {
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		}
		public void takescreenshot1(String path) throws IOException {
			TakesScreenshot image=  ((TakesScreenshot)driver);
			File source=image.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(path));
			
		}
}
