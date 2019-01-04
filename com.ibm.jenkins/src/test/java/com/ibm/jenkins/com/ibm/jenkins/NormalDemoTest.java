package com.ibm.jenkins.com.ibm.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NormalDemoTest {
	WebDriver driver;
	
	@Test
	public void demoTest() {
        String baseUrl = "http://realestate.hommelle.com";

        System.out.println("***************This is Chrome testing***************");
		System.out.println("***************This is before Launching Browser***************");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println("***************This is after Launching Browser***************");
		String expectedTitle = "Real Estate";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
