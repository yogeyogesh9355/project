package library;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEx {

protected WebDriver driver;
public void launchApplication(String browser, String url) {
	
	try {
		if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BLTuser.BLT1224\\\\Desktop\\\\kar\\\\chromedriver.exe");
			driver=new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	
	} catch (WebDriverException e) {
		System.out.println(" browser could not be launched");
	}

}
public void Screenshot(String path1) throws IOException
{
TakesScreenshot scrShot =((TakesScreenshot)driver);
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(SrcFile, new File(path1));
}

public void quit(){
	
	driver.close();
	
}

	
}
