package com.TestClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableNotification_For_EdgeDriver_Test 
{
public WebDriver driver;
	
//	@Test
	public void disableNotification_For_ChromeDriver() throws Exception
	{
	
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--disable-notifications");
		
		driver = new EdgeDriver(op);
		System.out.println("Browser initialised");
		
		driver.manage().window().maximize();
		System.out.println("Browser maximised");
		
		driver.manage().deleteAllCookies();
		System.out.println("Delete All Cookies");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Page Load Timeout set");
		
		driver.get("https://www.justdial.com/");
		System.out.println("Url is opened");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("wait is applied");
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser closed");
	}
}
