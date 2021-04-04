package com.nanosoft.MP_Portal.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


@Test

public class DriverManager {

static {
		
    // System.setProperty("webdriver.ie.driver", "F:\\Afsan\\AfsanaBITM+LEADS EX\\Selenium Files\\IEDriverServer.exe");		
	//	System.setProperty("webdriver.gecko.driver", "F:\\Afsan\\AfsanaBITM+LEADS EX\\Selenium Files\\geckodriver.exe");

	 System.setProperty("webdriver.chrome.driver", "F:\\Afsan\\AfsanaBITM+LEADS EX\\Selenium Files\\chromedriver.exe");
	}
	
     //  public static WebDriver driver = new InternetExplorerDriver();          
	 //   public static WebDriver driver=new FirefoxDriver();
	
	  public static WebDriver driver=new ChromeDriver();
	
	  DriverManager(){
		
	}
}
