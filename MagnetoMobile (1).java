package com.cg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MagnetoMobile {

	WebDriver driver;
	
	public  MagnetoMobile(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//This page class will find web element of that page
	
	@FindBy(xpath = ".//*[@id='menu-item-398']/a")
	WebElement Pricing;
	
	@FindBy(xpath =".//*[@id='magento-tap2']/div/div/nav/div/div[1]/a/span/img[2]")
	WebElement Logo;
	
	
	
	@FindBy( className="opn_pop")
	WebElement LetsStarted;

	@FindBy(name = "first_name")
	WebElement UserName;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="get_started")
	WebElement GetStarted;
	
	@FindBy(xpath=".//*[@id='navbar']/ul[2]/li[1]/a")
	WebElement Login;
	@FindBy(name="username")
	WebElement UName;
	@FindBy(name="password")
	WebElement Pwd;
	@FindBy(name="login")
	WebElement Login1;
	@FindBy(xpath=".//*[@id='menu-item-601']/a")
	WebElement Demo;
	
	
	@FindBy(xpath=".//*[@id='magento-tap2']/section[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/p/a[1]")
	WebElement link;
	@FindBy(xpath=".//*[@id='nav']/ol/li[1]/ul/li[2]/a")
	WebElement NewArrivals;
	
	public void Pricing()
	{
		Pricing.click();
	}
	
	public void Logo()
	{
		Logo.click();
		
	}
	
	
	public void LetsStarted ()
	{
		LetsStarted.click();
	}
	
	public void TypeUserName(String strUName)
	{
		UserName.sendKeys(strUName);
	}

	public void TypeEmail(String strEmail)
	{
		Email.sendKeys(strEmail);
	}
	
	public void TypePassword(String strPwd)
	{
		Password.sendKeys(strPwd);
	}
	public void GetStarted()
	{
		GetStarted.click();
	}
	public void Login()
	{
		Login.click();
	}
	public void UName(String strName)
	{
		UName.sendKeys(strName);
	}
	public void Pwd(String strPw)
	{
		Pwd.sendKeys(strPw);
	}
	public void Login1()
	{
		Login1.click();
	}
	
	public void Demo()
	{
		Demo.click();
	}
	
	public void ClickLink()
	{
		link.click();
	}
	public void TypeArrivals()
	{
		NewArrivals.click();
		
	}
	

	public void LogWebsite(String strUName,String strEmail,String strPwd,String strName,String strPw)throws InterruptedException {
		// TODO Auto-generated method stub
		Pricing.click();
		Thread.sleep(2000);
		Logo.click();
		Thread.sleep(2000);
		LetsStarted.click();
		Thread.sleep(2000);
		TypeUserName(strUName);
		Thread.sleep(2000);
		TypeEmail(strEmail);
		Thread.sleep(2000);
		TypePassword(strPwd);
		Thread.sleep(2000);
		GetStarted.click();
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(2000);
		UName(strName);
		Thread.sleep(2000);
		Pwd(strPw);
		Thread.sleep(2000);
		Login1.click();
		Thread.sleep(2000);
		Demo.click();
		Thread.sleep(2000);
		link.click();
		Thread.sleep(2000);
		NewArrivals.click();
		Thread.sleep(1000);
		}
	
}
