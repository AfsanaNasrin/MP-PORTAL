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

public class ProfileNActivities {
	
	private WebDriver driver = null;
	
	public void profileNactivitiesBanglaVersion() throws InterruptedException {
		
		driver = DriverManager.driver;
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.ProfileNactivities.প্রোফাইলএন্ডএক্টিভিটিস)));
		driver.navigate().to(URLUtils.ProfileNActivities.প্রোফাইল);
	/*
		
		//  প্রোফাইল	
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সংসদ_সদস্য_যুক্ত_করুন)).click();
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.ইমেইল)).sendKeys("test@gmail.com");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.পাসওয়ার্ড)).sendKeys("afsanaaa");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.পাসওয়ার্ড_নিশ্চিত_করুন)).sendKeys("afsanaaa");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.নাম_বাংলা)).sendKeys("টেস্টার");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.নাম_ইংরেজি)).sendKeys("Tester");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.বাবার_নাম)).sendKeys("Adil");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.মায়ের_নাম)).sendKeys("Shanu");
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.বৈবাহিক_অবস্থা))).selectByVisibleText("অবিবাহিত");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.স্বামী_স্ত্রীর_নাম_বাংলা)).sendKeys("নাল");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.স্বামী_স্ত্রীর_নাম_ইংরেজি)).sendKeys("Null");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.স্বামী_স্ত্রীর_জন্ম_তারিখ)).sendKeys("2021-04-30");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.এন_আই_ডি)).sendKeys("777");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.স্বামী_স্ত্রীর_এন_আই_ডি_লিখুন)).sendKeys("777");
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.ধর্ম))).selectByVisibleText("ইসলাম");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.পিএবিএক্স_নম্বর)).sendKeys("777");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.অফিসিয়াল_ফোন)).sendKeys("777");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.আবাসিক_ফোন)).sendKeys("777");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.অফিসের_ঠিকানা)).sendKeys("Badda");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.বর্তমান_ঠিকানা)).sendKeys("Badda");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.স্থায়ী_ঠিকানা)).sendKeys("Badda");
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সংসদ_পদবি))).selectByVisibleText("প্রতিমন্ত্রী");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সংসদ))).selectByVisibleText("11th");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.রাজনৈতিক_দল))).selectByVisibleText("বাংলাদেশ আওয়ামী লীগ");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.যে_জেলায়_জন্ম))).selectByVisibleText("কুমিল্লা");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.স্ট্যাটাস))).selectByVisibleText("অনুমোদিত");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.বিভাগ))).selectByVisibleText("চট্টগ্রাম");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.জেলা))).selectByVisibleText("Comilla");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.নির্বাচনী_এলাকা))).selectByVisibleText("comilla-1");
		
	//	driver.findElement(By.xpath(XpathUtils.ProfileNactivities.প্রোফাইল_সংরক্ষণ_করুন)).click();
		System.out.println("Profile Added Successfully!");
		
		
		
	//	এমপি বুক(For the internet connection i did not get result of this 
		
		driver.navigate().to(URLUtils.ProfileNActivities.এমপি_বুক);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সংসদ_পদবি))).selectByVisibleText("প্রতিমন্ত্রী");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.এমপিবুক_বিভাগ))).selectByVisibleText("রংপুর");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.এমপিবুক_জেলা))).selectByVisibleText("Dinajpur");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.নির্বাচনী_এলাকা))).selectByVisibleText("Dinajpur-1");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.এমপিবুক_নাম_দ্বারা_অনুসন্ধান)).sendKeys("yyy");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.এমপিবুক_অনুসন্ধান)).click();
		
		System.out.println("Successfully Searched!");
		
		System.out.println("Its not working successfully!");
		
	    
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URLUtils.ProfileNActivities.সাক্ষাৎ);
		
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_যুক্ত_করুন)).click();
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_তারিখ)).sendKeys("30 April, 2021");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_সময়_হইতে)).sendKeys("04:51 PM");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_সময়_পর্যন্ত)).sendKeys("05:54 PM");
		new Select(driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_নিবেদন))).selectByVisibleText("Abu Hassan Mahmud Ali");
		driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_এর_বিষয়)).sendKeys("Testing Purpose-->For Lock Down!");
		
	//	driver.findElement(By.xpath(XpathUtils.ProfileNactivities.সাক্ষাৎ_সংরক্ষণ)).click();
		
		*/	
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
	}
	
	

}
