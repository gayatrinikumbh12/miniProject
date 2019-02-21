package com.cg.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cg.pages.MagnetoMobile;

@Test
public class VerifymagnetoMobile 
{
  WebDriver driver;
  MagnetoMobile mobile;

	static String driverPath = "C:\\Users\\kkhewalk\\Desktop\\Module-04\\chromedriver_win32\\";
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.magentomobileshop.com/");
		driver.manage().window().maximize();
	}
	
	public void VerifyEmailRegistration() throws InterruptedException
	{
		mobile = new MagnetoMobile(driver);
		PageFactory.initElements(driver, mobile);
		
		//String pageTitle =  mobile.getEmailRegisterPageTitle();
		//Assert.assertEquals(pageTitle, "Email Registration Form");
		
		 mobile.LogWebsite("Mageneto","meganeto@gmail.com","magento@321","Mageneto","magento@321");
		
		 Thread.sleep(10000);
	}

	@AfterTest
	public void CloseBrowser()
	{
		driver.quit();
	
	}
  
  
  
}
