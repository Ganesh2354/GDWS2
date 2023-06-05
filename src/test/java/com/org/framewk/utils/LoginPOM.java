package com.org.framewk.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	public static WebDriver localdriver;
	public LoginPOM( String filepath)
	{
//		localdriver=remotedriver;
//		PageFactory.initElements(remotedriver, this);
		new ReadConfigData(filepath);
	}
	
	public void setEmail(WebDriver remotedriver, String keyEmail, String emailValue)
	{
		remotedriver.findElement(By.xpath(ReadConfigData.getLocatorValue(keyEmail))).sendKeys(emailValue);
	}
	
	
	public void setPassword(WebDriver remotedriver, String keyPassword, String passValue)
	{
		remotedriver.findElement(By.xpath(ReadConfigData.getLocatorValue(keyPassword))).sendKeys(passValue);
	}
	
	public void clickOnElement(WebDriver remotedriver, String keyBtn)
	{
		remotedriver.findElement(By.xpath(ReadConfigData.getLocatorValue(keyBtn))).click();
	}
	
	
	
	

}
