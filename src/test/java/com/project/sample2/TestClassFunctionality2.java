package com.project.sample2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassFunctionality2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		Actions act=new Actions(driver);
		
		driver.get("https://www.facebook.com/");
		String val=Keys.chord(Keys.CONTROL, Keys.SHIFT,Keys.chord("n"));
		
	}

}
