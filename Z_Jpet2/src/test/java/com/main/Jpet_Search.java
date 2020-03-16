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

public class Jpet_Search {
	WebDriver driver;
	public void LaunchBrowser6() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}
			public void ApplicationHomePage6() {
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			}
			public void search() {
				driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Angelfish");;
				driver.findElement(By.name("searchProducts")).click();
			}
			public void takescreenshot6(String path) throws IOException {
				TakesScreenshot image=  ((TakesScreenshot)driver);
				File source=image.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File(path));
			}
}
