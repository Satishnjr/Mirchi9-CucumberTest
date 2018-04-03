package com.test.mirchi.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.DataHelper;
import com.test.mirchi.modules.FooterPageAction;
import com.test.mirchi.modules.FooterPageActioninNexus;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FooterPageStepsinNexus {
	
	 public WebDriver driver;
	    public List<HashMap<String,String>> datamap;
	    
	    
	    public FooterPageStepsinNexus()
	    {
	    	driver = Hooks.driver;
	     	datamap = DataHelper.data();
	    }
	    
	    @Then("^I select all links and verify if works and lands on right page in Nexus Mobile$")
	    public void i_select_all_links_and_verify_if_works_and_lands_on_right_page_in_Nexus_Mobile() throws Throwable {
	    	PageFactory.initElements(driver, MirchiHomePage.FooterPage.class);
	    	FooterPageActioninNexus.Execute(driver);

}
}


