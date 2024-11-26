package com.TestClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableNotification_For_ChromeDriver_Test 
{
public WebDriver driver;
	
	@Test
	public void disableNotification_For_ChromeDriver() throws Exception
	{
	
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(op);
		System.out.println("Browser initialised");
		
		driver.manage().window().maximize();
		System.out.println("Browser maximised");
		
		driver.manage().deleteAllCookies();
		System.out.println("Delete All Cookies");
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		System.out.println("Page Load Timeout set");
		
		driver.get("https://www.justdial.com/");
		System.out.println("Url is opened");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
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
