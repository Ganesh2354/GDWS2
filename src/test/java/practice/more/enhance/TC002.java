package practice.more.enhance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002 {
	
	@Test
	
	public void tc001() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_SHIFT); 
		rb.keyPress(KeyEvent.VK_N);
		rb.keyRelease(KeyEvent.VK_CONTROL);rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyRelease(KeyEvent.VK_N);
		Thread.sleep(4000);
		
		String p=driver.getWindowHandle();
		Set<String> c=driver.getWindowHandles();
		Iterator<String> it=c.iterator();
		while(it.hasNext())
		{
			if(!p.equals(c))
			{
				driver.get("https://www.facebook.com/");
			}
		}
		
		
		
		
		
	}
	
	
	
	
	

}
