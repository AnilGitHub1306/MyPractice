package com.TestClassPackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utilityPackage.Listener.class)
public class PrintTheHelloKeyword_Test 
{
	@Test (priority=1)
	public void printHelloKeyword()
	{
		System.out.println("Hello");
	}
	
	
	
	
}
