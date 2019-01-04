package com.ibm.jenkins.com.ibm.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFirefoxTest {
	
	WebDriver driver;
	
	@Test(enabled=false)
	public void demoFirefoxTest() {
		String baseUrl = "http://realestate.hommelle.com";
		
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		cap.setBrowserName("firefox");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		String expectedTitle = "Real Estate";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
