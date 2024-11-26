package com.TestClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableNotification_For_SafariDriver_Test 
{

	//	@Test
	public void disableNotification_For_ChromeDriver() throws Exception
	{
		// It is not supporte by windows 5.1.3 safari version onword
		WebDriverManager.safaridriver().setup();
		SafariOptions op = new SafariOptions();
		op.setCapability("--disable-notifications", true);
		
		WebDriver driver = new SafariDriver(op);
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
		
		   try {
               Alert alert = driver.switchTo().alert();
               alert.dismiss(); // or alert.accept(); depending on your needs
           } catch (NoAlertPresentException e) {
               // No alert to handle
           }
	
		driver.quit();
		System.out.println("browser closed");
	}
}
