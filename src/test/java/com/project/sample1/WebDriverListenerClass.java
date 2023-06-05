package com.project.sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebDriverListenerClass extends AbstractWebDriverEventListener{
	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("clicking on : "+element);
//		super.beforeClickOn(element, driver);
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("clicked on : "+element);
		super.afterClickOn(element, driver);
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("finding element "+by);
//		super.beforeFindBy(by, element, driver);
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("found element "+by);
//		super.afterFindBy(by, element, driver);
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Launching the browser...");
//		super.beforeScript(script, driver);
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to : "+url);
	}

		
}
