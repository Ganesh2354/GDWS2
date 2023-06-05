package Test_Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Implicit wait

//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 15);

		WebElement a = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println(" 1st : " + a.getText());

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='logi']")));
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(" 2nd : " + log.getText());

	}

}
