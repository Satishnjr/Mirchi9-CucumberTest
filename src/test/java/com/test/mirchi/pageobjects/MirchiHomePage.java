package com.test.mirchi.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class MirchiHomePage extends BaseClass {

	public MirchiHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "top-mobile-toggle")
	public static WebElement navbar;

	public static class HeaderPage {

		@FindBy(how = How.CLASS_NAME, using = "menu-item")
		public static WebElement menu_item;
	}

	public static class FooterPage {

		@FindBy(how = How.CSS, using = ".footer-social-wrap a")
		public static WebElement footer;

	}

	public static class GoogleAdsPage {

		@FindBys({ @FindBy(className = "adsbygoogle") })
		public static List<WebElement> ads;
	}

}
