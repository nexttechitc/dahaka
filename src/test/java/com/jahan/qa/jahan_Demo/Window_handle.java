package com.jahan.qa.jahan_Demo;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Window_handle {
	
	@Test
	public void windowhandle() throws Exception {
		
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")).click();
		driver.findElement(By.id("findAHome")).click();
		driver.findElement(By.xpath("//a[@class='search-option bofa']")).click();
		
		String parent = driver.getWindowHandle();
		 
		 Set<String> allwindow=  driver.getWindowHandles();
		 int count = allwindow.size();
		 System.out.println(count);
		 for(String child:allwindow ) {
			 if(!parent.equalsIgnoreCase(child)) {
				 driver.switchTo().window(child);
				 Thread.sleep(5000);
				 boolean result = driver.findElement(By.xpath("//h2[text()='Find New Home Communities in these states']")).isDisplayed();
				 Assert.assertTrue(result);
				 Thread.sleep(5000);
				 driver.close();
			 }
			 driver.switchTo().window(parent);
		 }
		 Thread.sleep(5000);
		 driver.quit();
		 
		 // Click- Click()- Java script executor 
		 //type- sendkey
		 // close()
		 //quite()
		 //Actions class
		 //Select class
		 
	}

}
