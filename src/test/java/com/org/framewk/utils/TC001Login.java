package com.org.framewk.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType.ForSeleniumServer;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001Login {
	WebDriver driver;
	LoginPOM pom;
	
	
	String fileLocation="C:\\Users\\Ganesh Dandekar\\Devils\\EclipseNew\\JourneyToUpSkill\\ConfigData\\ConfigProperties";
	@BeforeClass
	
	public void initialSetup()
	{
		pom=new LoginPOM(fileLocation);
		LoginPOM.localdriver=driver;
	}
	
	@Test	
	public void LoginTest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		pom.setEmail(driver,"Email", "abc123@test.com");Thread.sleep(2000);
		pom.setPassword(driver, "Password", "12345678"); Thread.sleep(2000);
String cl=driver.findElement(By.xpath("//button[@name='login']")).getCssValue("color");
		
		System.out.println(cl);
		pom.clickOnElement(driver,"LoginBtn");Thread.sleep(4000);	
		
		SessionId id=((RemoteWebDriver)driver).getSessionId();
		System.out.println(id);
		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		
		
		
		
		
	}
	
	@AfterClass	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	

}
