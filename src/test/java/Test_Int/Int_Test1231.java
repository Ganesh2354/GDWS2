package Test_Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Int_Test1231 {

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.google.com/");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@role='presentation']"));		
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		
		
		
		
		
		
		
	}

}
