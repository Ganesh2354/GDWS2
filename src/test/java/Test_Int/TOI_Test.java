package Test_Int;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TOI_Test {
	
	
	
	@Test
	
	public void testTOI()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/india");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> allNews=driver.findElements(By.xpath("//li//span//a[contains(@pg, 'indianews#top-india#Story')]"));
		
		Iterator<WebElement> it=allNews.iterator();
		
		while(it.hasNext())
		{
			WebElement news=it.next();
			
			String titleOfNews=news.getAttribute("title");
			
			System.out.println(titleOfNews);
		}
		
		
	}
	
	
	

}
