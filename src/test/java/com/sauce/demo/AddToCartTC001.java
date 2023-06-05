package com.sauce.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartTC001 {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void testLoginForNegative() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (driver.findElement(By.xpath("//div[@class='bot_column']")).isDisplayed()) {
			System.out.println("bot section is displayed");
		} else {
			Assert.assertFalse(true, "bot section not displayed");
		}
		String expected = "Login";

		if (driver.findElement(By.xpath("//input[@name='login-button']")).isEnabled()) {
			String actual = driver.findElement(By.xpath("//input[@name='login-button']")).getAttribute("value");
			if (expected.equals(actual)) {
				System.out.println("login button text matched.");
			} else {
				Assert.assertFalse(true, "login button text not matched");
			}

		} else {
			Assert.assertFalse(true, "Login button is not enabled");
		}

		if (driver.findElement(By.xpath("//input[@name='login-button']")).isEnabled()) {
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			String errorExpect = "Epic sadface: Username is required";
			if (driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed()) {
				String actualError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
				Assert.assertEquals(actualError, errorExpect);
			} else {
				Assert.assertFalse(true, "error message not displayed");
			}
		}

		// checking login error genration of applicaton when only user name(wrong) is
		// provided
		if (driver.findElement(By.xpath("//input[@id='user-name']")).isDisplayed()
				&& driver.findElement(By.xpath("//input[@id='user-name']")).isEnabled()) {
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard");// standard_user
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(1000);
			String errorExpect = "Epic sadface: Password is required";
			if (driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed()) {
				String errorMsgActual = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
				Assert.assertEquals(errorExpect, errorMsgActual);
			} else {
				Assert.assertFalse(true, "error message not displayed");
			}
		}

		else {
			Assert.assertFalse(true, "user name tab is not enabled and displayed");
		}

		// checking error when only password is provided
		if (driver.findElement(By.id("password")).isEnabled() && driver.findElement(By.id("password")).isDisplayed()) {
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(1000);
			String errorExpected2 = "Epic sadface: Username and password do not match any user in this service";
			if (driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed()) {
				String actualError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
				Assert.assertEquals(actualError, errorExpected2);
			} else {
				Assert.assertFalse(true, "error message not displayed");
			}

		} else {
			Assert.assertFalse(true, "user name tab is not enabled and displayed");
		}

	}

	// adding to kart
	@Test(dependsOnMethods = "testLoginForNegative")
	public void homePageTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (driver.findElement(By.xpath("//input[@name='login-button']")).isEnabled()) {
			driver.findElement(By.xpath("//input[@id='user-name']")).clear();// standard_user
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(1000);
			String expectedTitle = "PRODUCTS";
			if (driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed()) {
				String actualtitle = driver.findElement(By.xpath("//span[text()='Products']")).getText();
				Assert.assertEquals(actualtitle, expectedTitle);
			} else {
				Assert.assertFalse(true, "page title is not displayed");
			}

			if (driver.findElement(By.xpath("//select[@class='product_sort_container']")).isDisplayed()) {
				WebElement dd = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
				String exp = "Name (A to Z)";
				Select sel = new Select(dd);
				String act = sel.getFirstSelectedOption().getText();
				Assert.assertEquals(act, exp);
			} else {
				Assert.assertFalse(true, "filter is not displayed");
			}

			//

			if (driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed()) {
				try {
					if (!driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed()) {
						System.out.println("cart badge not displayed");
					} else {
						Assert.assertFalse(true, "badge is displayed unexpectedly");
					}
				} catch (Exception e) {
					System.out.println(e + " is the exception");
				}
				String inventoryNameBefore = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"))
						.getText();
				String inventoryPriceBefore = driver.findElement(By.xpath("//div[@class='inventory_item_price']"))
						.getText();
				driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
				if (driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed()) {
					driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
					Thread.sleep(1000);
					String inventoryNameAfter = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"))
							.getText();
					Assert.assertEquals(inventoryNameBefore, inventoryNameAfter);
					String inventoryPriceAfter = driver.findElement(By.xpath("//div[@class='inventory_item_price']"))
							.getText();
					Assert.assertEquals(inventoryPriceBefore, inventoryPriceAfter);
				} else {
					Assert.assertFalse(true, "cart badge not displayed");
				}

			} else {
				Assert.assertFalse(true, "kart is not displayed");
			}
		} else {
			Assert.assertFalse(true, "Login button is not enabled");
		}
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
