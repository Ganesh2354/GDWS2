package com.project.sample2;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.project.sample1.WebDriverListenerClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassFunctionality1 {
	
	WebDriver driver;
	
	
	@Test()
	
	public void testcase1() throws Exception
	{

		
//		
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--incognito");
//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setCapability(ChromeOptions.CAPABILITY, opt);
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
//		EventFiringWebDriver ed=new EventFiringWebDriver(driver);
//		WebDriverListenerClass el=new WebDriverListenerClass();
//		ed.register(el);
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);	
		
		WebElement email=driver.findElement(By.xpath("//button[@name='email']"));
		email.sendKeys("1234");
		Actions act=new Actions(driver);
		String cop=Keys.chord(Keys.CONTROL, Keys.chord("a"));
		System.out.println(cop);
		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
//		Assert.assertEquals("", "");		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions)		
		
//		Thread.sleep(2000);		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);		
//		WebElement email=ed.findElement(By.xpath("//button[@name='login']"));
//		email.click();
		
	}
	
	
	
	
	

}
