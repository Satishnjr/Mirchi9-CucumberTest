package com.test.mirchi.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.DataHelper;
import com.test.mirchi.modules.HeaderNavActioninNexus;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderNavStepsinNexus {

    public WebDriver driver;
    public List<HashMap<String,String>> datamap;

    public HeaderNavStepsinNexus()
    {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }
    
    @When("^I open mirchi website in Nexus$")
    public void i_open_mirchi_website_in_Nexus() throws Throwable {
    	driver = Hooks.openBrowserNexus();
    	driver.get("https://www.mirchi9.com/");
        
    }

    @When("^I click On NavBar$")		
    public void i_click_On_NavBar() throws Throwable {
    	PageFactory.initElements(driver, MirchiHomePage.class);
    	HeaderNavActioninNexus.Execute(driver);
    }

    @Then("^I select a links and verify if works and lands on Right page$")
    public void i_select_a_links_and_verify_if_works_and_lands_on_Right_page() throws Throwable {
    	PageFactory.initElements(driver,MirchiHomePage.HeaderPage.class);
    	HeaderNavActioninNexus.Execute(driver);
        
    }

}
