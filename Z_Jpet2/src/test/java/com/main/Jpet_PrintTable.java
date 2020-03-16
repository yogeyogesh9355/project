package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_PrintTable {
WebDriver driver;
	
	public void LaunchBrowser4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		public void ApplicationHomePage4() {
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		}
		public void print_table() {
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			int r,c;
			
			for(r=0;r<=5;r++)
			{
				for (c=0;c<=2;c++)
				{
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+r+"]/th["+c+"]")).getText();
					System.out.println(s+" ");
				}
				System.out.println();
			}
		}
}
