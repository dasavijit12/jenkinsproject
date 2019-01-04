package com.ibm.jenkins.com.ibm.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NormalDemoTest {
	WebDriver driver;
	
	@Test(enabled=false)
	public void demoTest() {
        String baseUrl = "http://realestate.hommelle.com";
		System.out.println("Hello...");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		String expectedTitle = "Real Estate";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
