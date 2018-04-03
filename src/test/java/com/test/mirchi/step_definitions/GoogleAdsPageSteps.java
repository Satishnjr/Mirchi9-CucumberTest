package com.test.mirchi.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.Hooks;
import com.test.mirchi.modules.GoogleAdsAction;
import com.test.mirchi.pageobjects.HomePage;

import cucumber.api.java.en.Then;

public class GoogleAdsPageSteps {
	public WebDriver driver;

	public GoogleAdsPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, HomePage.GoogleAdsPage.class);
	}

	@Then("^user check for Ads, GoogleAds Should display$")
	public void user_check_for_Ads_GoogleAds_Should_display() throws Throwable {
		GoogleAdsAction.Execute(driver);
	}


}
