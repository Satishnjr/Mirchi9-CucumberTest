package com.test.mirchi.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.DataHelper;
import com.test.mirchi.modules.MirchiHomePageAction;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.When;

public class HomePageSteps {
    public WebDriver driver;
    public List<HashMap<String,String>> datamap;
    
    
    public HomePageSteps()
    {
    	driver = Hooks.driver;
     	datamap = DataHelper.data();
    }
    
    @When("^I open mirchi website$")
    public void i_open_mirchi_website() throws Throwable {
    	driver.get("https://www.mirchi9.com/");
    }
    
    @When("^I click on NavBar$")
    public void i_click_on_NavBar() throws Throwable {
    	PageFactory.initElements(driver, MirchiHomePage.class);
    	MirchiHomePageAction.Execute(driver);
    }
    
}


