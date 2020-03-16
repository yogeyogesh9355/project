package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_PrintBill {
	WebDriver driver;
	public void LaunchBrowser3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		public void ApplicationHomePage3() {
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		}
		public void ProceedToCheckout() {
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		}
		public void PrintBill() {
			driver.findElement(By.xpath("")).click();
			int r;
			
			for(r=0;r<=27;r++)
			{
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+r+"]/th")).getText();
					System.out.println(s+" ");
				}
				System.out.println();
			}
		
}
