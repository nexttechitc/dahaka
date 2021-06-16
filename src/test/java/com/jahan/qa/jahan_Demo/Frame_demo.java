package com.jahan.qa.jahan_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame_demo {
	
	@Test
	public void frame() throws Exception {
		
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		Thread.sleep(5000);
		driver.quit();
	}
		
		

}
