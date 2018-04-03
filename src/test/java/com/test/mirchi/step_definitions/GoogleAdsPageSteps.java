package com.test.mirchi.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.DataHelper;
import com.test.mirchi.modules.GoogleAdsAction;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleAdsPageSteps {
	 public WebDriver driver;
	    public List<HashMap<String,String>> datamap;
	    
	    
	    public GoogleAdsPageSteps()
	    {
	    	driver = Hooks.driver;
	     	datamap = DataHelper.data();
	    }
	@When("^I check for Ads$")
	public void i_check_for_Ads() throws Throwable {

	}

	@Then("^GoogleAds Should display$")
	public void googleads_Should_display() throws Throwable {
		PageFactory.initElements(driver, MirchiHomePage.GoogleAdsPage.class);
    	GoogleAdsAction.Execute(driver);

	}

}
