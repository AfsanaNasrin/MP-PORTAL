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

public class MasterSetup {

	private WebDriver driver = null;
	
	public void MasterSetupBanglaVersion() throws InterruptedException {
		
		driver = DriverManager.driver;
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.Master_Setup.মাস্টার_সেটআপ)));
		driver.navigate().to(URLUtils.MasterSetup.MinistryURL);
		
		driver.findElement(By.xpath(XpathUtils.Master_Setup.মন্ত্রণালয়_যুক্ত)).click();
		driver.findElement(By.xpath(XpathUtils.Master_Setup.মন্ত্রণালয়ের_নাম_ইংলিশ)).sendKeys("Automation Ministry Name (EN)");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.মন্ত্রণালয়ের_নাম_বাংলা)).sendKeys("Automation Ministry Name (BN)");
		//driver.findElement(By.xpath(XpathUtils.Master_Setup.মন্ত্রণালয়_সংরক্ষণ)).click();
		
		System.out.println("Addition of Ministry is Done !!");
		
		Thread.sleep(2000);
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URLUtils.MasterSetup.নির্বাচনী_এলাকা);
		
		driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকা_যুক্ত)).click();
		driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_নাম্বার)).sendKeys("28");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_নাম)).sendKeys("কুমিল্লা-১");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_নাম_ইংরেজি)).sendKeys("comilla-1");
		
		new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_বিভাগ))).selectByVisibleText("চট্টগ্রাম");
		Thread.sleep(6000);
		new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_জেলা))).selectByVisibleText("কুমিল্লা");
		Thread.sleep(6000);
		new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_উপজেলা))).selectByVisibleText("মেঘনা");
//		driver.findElement(By.xpath(XpathUtils.Master_Setup.নির্বাচনী_এলাকার_সাবমিট)).click();
		Thread.sleep(5000);
		
	    System.out.println("Nirbacony elaka successfully submitted!!");
	    
	    Thread.sleep(2000);
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.navigate().to(URLUtils.MasterSetup.ডিপার্টমেন্ট);
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ডিপার্টমেন্ট_যুক্ত)).click();
	    
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ডিপার্টমেন্ট_নাম_ইংরেজি)).sendKeys("Test Department");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ডিপার্টমেন্ট_নাম_বাংলা)).sendKeys("Test Department Bangla");
//	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ডিপার্টমেন্ট_সাবমিট)).click();
	    
	    System.out.println("Department Submission Successfully Done!!");
	    
	    Thread.sleep(2000);
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.navigate().to(URLUtils.MasterSetup.সংসদ_পদবি);
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.পদবি_যুক্ত_করুন)).click();
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.পদবি_নাম_ইংরেজি)).sendKeys("Test designation English");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.পদবি_নাম_বাংলা)).sendKeys("Designation Name Bangla");
//	    driver.findElement(By.xpath(XpathUtils.Master_Setup.পদবি_সাবমিট)).click();
	    
	    System.out.println("Songsod Podobi Successfully Submitted!");
	    
	    Thread.sleep(2000);
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.navigate().to(URLUtils.MasterSetup.সংসদ);
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদ_যুক্ত_করুন)).click();
	    
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদ_নং)).sendKeys("সপ্তম");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদের_তারিখ_হইতে)).sendKeys("2021-04-14");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদের_তারিখ_পর্যন্ত)).sendKeys("2021-05-10");
   //   driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদ_সংরক্ষণ)).click();
	    
	    System.out.println("Songsod Successfully Submitted!");
	    
	    Thread.sleep(2000);
		
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.navigate().to(URLUtils.MasterSetup.সংসদ_অধিবেশন);
	    
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদ_অধিবেশন_যুক্ত)).click();
	    new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদ_অধিবেশন_নং))).selectByVisibleText("একাদশ");
	    Thread.sleep(4000);
	    new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.অধিবেশন_নং))).selectByVisibleText("বিংশ");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ঘোষণার_তারিখ)).sendKeys("2021-04-05");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ঘোষণার_তারিখ_হইতে)).sendKeys("2021-05-15");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.ঘোষণার_তারিখ_পর্যন্ত)).sendKeys("2021-05-15");
	    driver.findElement(By.id(XpathUtils.Master_Setup.সংযুক্তি)).sendKeys("C:/Users/User/Downloads/sosviewupaz.pdf");
	//    driver.findElement(By.xpath(XpathUtils.Master_Setup.সংসদ_অধিবেশন_সংরক্ষণ)).click();
	    System.out.println("Songsod Odhibeson Submitted Successfully!");
	    
	    Thread.sleep(2000);
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(URLUtils.MasterSetup.রাজনৈতিক_দল);
        
        driver.findElement(By.xpath(XpathUtils.Master_Setup.রাজনৈতিক_দল_যুক্ত_করুন)).click();
        driver.findElement(By.xpath(XpathUtils.Master_Setup.রাজনৈতিক_দল_নাম_ইংরেজি)).sendKeys("Test_Dol");
        driver.findElement(By.xpath(XpathUtils.Master_Setup.রাজনৈতিক_দল_নাম_বাংলা)).sendKeys("টেস্ট দল");
    //  driver.findElement(By.xpath(XpathUtils.Master_Setup.রাজনৈতিক_দল_সংরক্ষণ)).click();
        
        System.out.println("Rajnoitik dol added successfully!");
        
        
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URLUtils.MasterSetup.বিভাগ);
		
		driver.findElement(By.xpath(XpathUtils.Master_Setup.বিভাগ_যুক্ত_করুন)).click();
		driver.findElement(By.xpath(XpathUtils.Master_Setup.বিভাগ_নাম_বাংলা)).sendKeys("বিভাগ টেস্ট");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.বিভাগ_নাম_ইংরেজি)).sendKeys("Division Test");
	    driver.findElement(By.xpath(XpathUtils.Master_Setup.বিভাগ_ওয়েবসাইট_লিংক)).sendKeys("http://mpportal.nanoit.biz/");
	//  driver.findElement(By.xpath(XpathUtils.Master_Setup.বিভাগ_সংরক্ষণ)).click();
		System.out.println("Division Successfully Added!");
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URLUtils.MasterSetup.জেলা);
		driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_যুক্ত_করুন)).click();
		driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_নাম_বাংলা)).sendKeys("জেলা টেস্ট");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_নাম_ইংরেজি)).sendKeys("District Test");
		new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_বিভাগ))).selectByVisibleText("রংপুর");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_অক্ষাংশ)).sendKeys("7777");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_দ্রাঘিমাংশ)).sendKeys("7777");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_ওয়েবসাইট_লিংক)).sendKeys("http://mpportal.nanoit.biz/");
    //  driver.findElement(By.xpath(XpathUtils.Master_Setup.জেলা_সংরক্ষণ)).click();
		System.out.println("District Successfully Added!");
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URLUtils.MasterSetup.উপজেলা);
		driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_যুক্ত_করুন)).click();
		driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_নাম_বাংলা)).sendKeys("উপজেলা টেস্ট");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_নাম_ইংরেজি)).sendKeys("Upazila Test");
		new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_বিভাগ))).selectByVisibleText("রংপুর");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_জেলা))).selectByVisibleText("দিনাজপুর");
		driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_ওয়েবসাইট_লিংক)).sendKeys("http://www.nanosoftbd.com/");
	//	driver.findElement(By.xpath(XpathUtils.Master_Setup.উপজেলা_সংরক্ষণ)).click();
		
		System.out.println("Upazilla Successfully Added!");
		
		
		
	}
	
	
}
