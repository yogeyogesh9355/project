package com.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_CheckForLink {
	WebDriver driver;
	public void LaunchBrowser2() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}
			public void ApplicationHomePage2() {
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			}
			public void checkforlink() {
				List<WebElement> link = driver.findElements(By.xpath("//*[@id=\"PoweredBy\"]/a"));
				int a=link.size();
					System.out.println("Checking link Persent :"+link.size());
					
					boolean c=false;
					if(a>0) {
						c=true;
						System.out.println("The link is present");
						Assert.assertTrue(c);
						
					}
					else {
						System.out.println("The link is not present");
						Assert.assertFalse(c);
					}	
			}
			public Jpet_CheckForLink() {
				this.driver = driver;
			}
}
