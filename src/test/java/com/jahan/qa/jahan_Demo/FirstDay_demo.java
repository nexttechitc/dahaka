package com.jahan.qa.jahan_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstDay_demo {
	
	
	@Test
	public void jahan() throws Exception {
		
		
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='button is-rounded is-secondary']")).click();
		Thread.sleep(5000);
		boolean tryitfreepage = driver.findElement(By.id("tit")).isDisplayed();
		Assert.assertTrue(tryitfreepage);
		driver.quit();
		
		// How to Verify test script
		// Assert Class - TestNG- 
		// How to handle drop down - select
		// how to handle Frame
		// How to handle popup
		//mouse over- actions
		
		
		
		
		
	}

}
