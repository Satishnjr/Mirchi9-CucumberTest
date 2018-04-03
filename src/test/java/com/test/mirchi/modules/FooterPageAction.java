 package com.test.mirchi.modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.test.mirchi.helpers.Log;

public class FooterPageAction {
	public static void footerLinks(WebDriver driver) throws Exception {
		@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		List<WebElement> items = driver.findElements(By
				.cssSelector(".footer-social-wrap a"));

		for (WebElement element : items) {

			String actualvalue = element.getAttribute("href");
			if (actualvalue.contains("twitter")) {
				Assert.assertEquals(actualvalue, "https://twitter.com/Mirchi9");
			} else if (actualvalue.contains("facebook")) {
				Assert.assertEquals(actualvalue,
						"https://www.facebook.com/mirchi9dotcom");

			} else if (actualvalue.contains("Google+")) {
				Assert.assertEquals(actualvalue,
						"https://plus.google.com/+MirchiFans");

			} else if (actualvalue.contains("contact us")) {
				Assert.assertEquals(actualvalue, "/contact-us/");

			}

			Reporter.log("Found Footer links: ", items.size());
			Log.info("Found Footer Links");
			Assert.assertEquals(6, items.size());

		}

	}

}
