package Test_Int;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12345 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		boolean val=true;
		for(int i=0;val;i++)
		{
		try {
			if(driver.findElement(By.xpath("//taghtml[@test='1']")).isDisplayed())
			{
				System.out.println("in try");
			}
		}catch(Exception e)
		{
			jse.executeScript("window.scrollBy(0, 500)", "");
			System.out.println("scrolled");
		}
		
		if(i==4)
		{
			System.out.println("breaking the loop");
			val=false;
		}
		
		}
		Thread.sleep(5000);
		driver.close();
	}

}
