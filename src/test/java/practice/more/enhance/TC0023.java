package practice.more.enhance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

import com.org.framewk.utils.NewConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0023 {
	WebDriver driver;
	
	NewConfig con;
	
	@Test	
	public void LoginTest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);		
//		driver.get(driver.getCurrentUrl());
//		driver.navigate().to(driver.getCurrentUrl());
        Actions act=new Actions(driver);
        act.keyDown(Keys.F5).build().perform(); act.keyUp(Keys.F5).build().perform();
        
        
//		String p=driver.getWindowHandle();		
//		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();			
//		Set<String> a=driver.getWindowHandles();
//		Iterator<String> it=a.iterator();
//		System.out.println(p);
//		System.out.println();
//		while(it.hasNext())
//		{
//			String c=it.next();			
//			if(!p.equals(c))
//			{
//				driver.switchTo().window(c);
//				System.out.println(driver.getTitle());
//			}		
//		}		
//		con=new NewConfig();		
//		JavascriptExecutor jse=driver1;		
////		jse.executeScript("document.getElementById('email').value='1234'");		
//		driver1.findElement(By.xpath(NewConfig.getpathValue("Login_Page", "Email"))).sendKeys("qa@test.com");
			
	}
	
	
	

}
