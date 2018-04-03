package com.test.mirchi.step_definitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.Hooks;
import com.test.mirchi.modules.FooterPageAction;
import com.test.mirchi.pageobjects.HomePage;

import cucumber.api.java.en.Then;

public class FooterPageSteps {
	
	 public WebDriver driver;


	    public FooterPageSteps()
	    {
	        driver = Hooks.driver;
	        PageFactory.initElements(driver, HomePage.FooterPage.class);
	        
	    }

	    @Then("^user Traverse to Footer, the select all links and verify if works and lands on right page$")
		public void user_Traverse_to_Footer_the_select_all_links_and_verify_if_works_and_lands_on_right_page()
				throws Throwable {
			FooterPageAction.footerLinks(driver);
		}


}
