package com.nanosoft.MP_Portal.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nanosoft.MP_Portal.Utils.DriverManager;
import com.nanosoft.MP_Portal.Utils.URLUtils;
import com.nanosoft.MP_Portal.Utils.XpathUtils;

@Test

public class MP_Portal_Notice {
	
	private WebDriver driver = null;
	
	public void SetupBidhi() throws InterruptedException {
		
		driver = DriverManager.driver;
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.Notice.FindNotice)));
		driver.findElement(By.xpath(XpathUtils.Notice.FindNotice)).click();
		
       driver.navigate().to(URLUtils.Notice.bidhiURL);
       
       driver.findElement(By.xpath(XpathUtils.Notice.ClickOnBidhi)).click();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.findElement(By.xpath(XpathUtils.Notice.BidhiNng)).sendKeys("7");
       driver.findElement(By.xpath(XpathUtils.Notice.BidhiNam)).sendKeys("777");
       driver.findElement(By.xpath(XpathUtils.Notice.Department)).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath(XpathUtils.Notice.DepartmentSelection)).click();
       driver.findElement(By.xpath(XpathUtils.Notice.Biboron)).sendKeys("Dhara ng:77, Ei bidhi mante public baddho thakben!");
       
       //driver.findElement(By.xpath(XpathUtils.Notice.Clear)).click();
       Thread.sleep(3000);
			
	}
	
	public void SetupSthayeCommittee() throws InterruptedException {
		
		
		driver.navigate().to(URLUtils.Notice.SthayiCommittee);
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.Notice.SodosserNam))).selectByVisibleText("রমেশ চন্দ্র সেন");
		driver.findElement(By.xpath(XpathUtils.Notice.TarikhHoiteClick)).sendKeys("2021-01-25");
		driver.findElement(By.xpath(XpathUtils.Notice.TarikhPorjontwSelect)).sendKeys("2021-01-30");
		
		
	}

}
