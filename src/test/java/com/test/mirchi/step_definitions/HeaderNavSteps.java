package com.test.mirchi.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.DataHelper;
import com.test.mirchi.modules.HeaderNavAction;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Then;

public class HeaderNavSteps {

    public WebDriver driver;
    public List<HashMap<String,String>> datamap;

    public HeaderNavSteps()
    {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }
    
    @Then("^I select a links and verify if works and lands on right page$")
    public void i_select_a_links_and_verify_if_works_and_lands_on_right_page() throws Throwable {
    	PageFactory.initElements(driver,MirchiHomePage.HeaderPage.class);
    	HeaderNavAction.Execute(driver);
    }

}
