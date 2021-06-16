package com.jahan.qa.jahan_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class popup_demo {
	
	@Test
	public void popup() throws Exception {
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		
		
		String expectedTitle= "java";
		
		String ActualTitle= "Selenium";
		
		System.out.println("Title is " + ActualTitle);
		
		Assert.assertEquals(ActualTitle, expectedTitle);
		
		driver.quit();
	}

}
