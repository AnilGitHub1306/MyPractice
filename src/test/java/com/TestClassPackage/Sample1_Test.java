package com.TestClassPackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilityPackage.Listener.class)
public class Sample1_Test {

	@Test
	public void school1() {
		Assert.assertTrue(true);
	}

}
