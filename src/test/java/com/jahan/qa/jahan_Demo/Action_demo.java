package com.jahan.qa.jahan_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_demo {
	
	@Test
	public void action() throws Exception {
		
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Financing')]"))).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
