package com.jahan.qa.jahan_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_demo {
	
	
	@Test
	
	public void dropdown() throws Exception {
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement dro = driver.findElement(By.id("gh-cat"));
		//Select class
		
		Select jahan = new Select(dro);
		//sl.selectByVisibleText("Antiques");
		jahan.selectByValue("550");
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
