package com.jahan.qa.jahan_Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calander_demo {
	
	@Test
	public void calander() throws Exception {
		
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor date = (JavascriptExecutor) driver;

		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='06/10/2021'");
		Thread.sleep(5000);
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='06/15/2021'");
		Thread.sleep(5000);
		// scroll down, click, clalander handle,
	}

}
