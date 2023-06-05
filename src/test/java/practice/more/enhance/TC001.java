package practice.more.enhance;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
	
	@Test	
	public void test() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);		
		List<WebElement> all=   driver.findElements(By.xpath("//select[@id='day']/option"));		
		System.out.println(all.size());
		
		for(WebElement e: all)
		{
			Thread.sleep(2000);
			e.click();
		}
		
		
		Actions act=new Actions(driver);		
		Action action=act.build();		
		action.perform();
		
	}
	
	
	
	

}
