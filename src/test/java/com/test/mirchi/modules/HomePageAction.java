package com.test.mirchi.modules;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.test.mirchi.helpers.Log;
import com.test.mirchi.pageobjects.HomePage;
public class HomePageAction {
	
	
	public static void navBar(WebDriver driver) throws Exception{
		HomePage.navbar.click();
		Log.info("Click action is perfromed on NavBar link" );
		
		Reporter.log("Click action is perfromed on NavBar link");
	}
	
	public static void menuItems(WebDriver driver) throws Exception {
		@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		List<WebElement> items = driver.findElements(By.className("menu-item"));
		Reporter.log("Found Menu links: ", items.size());
		Assert.assertEquals(5,items.size());
		//MirchiHomePage.HeaderPage.menu_item.click();

		Reporter.log("Clicked on Menu");
	}
}
