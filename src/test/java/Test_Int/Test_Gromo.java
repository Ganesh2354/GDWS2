package Test_Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Gromo {

	public static void main(String[] args) { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.get("https://pos.gromoinsure.in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@max='10']")).sendKeys("1234567891");		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		int[] arr= {1,3,15,17};		
		int max=Integer.MAX_VALUE;
		System.out.println(max);
	}

}
