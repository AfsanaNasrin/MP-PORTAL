package com.nanosoft.MP_Portal.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.nanosoft.MP_Portal.Utils.DriverManager;
import com.nanosoft.MP_Portal.Utils.URLUtils;
import com.nanosoft.MP_Portal.Utils.XpathUtils;




@Test


public class MP_Portal_Login {
	
	private WebDriver driver =null;
	
	public void Login_Test()
	
	{
		driver =DriverManager.driver;
		
		driver.get(URLUtils.URL.baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(XpathUtils.MP_Login.UserId)).sendKeys("mp1@gmail.com");
		driver.findElement(By.xpath(XpathUtils.MP_Login.Password)).sendKeys("123");
		driver.findElement(By.xpath(XpathUtils.MP_Login.Submit)).click();
		
		
		System.out.println("Logged in Successfully!");
	}
}
