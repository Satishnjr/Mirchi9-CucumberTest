package com.test.mirchi.step_definitions;



import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step_definitions.Hooks;

public class FooterPage {
	
	 public WebDriver driver;
	    public List<HashMap<String,String>> datamap;


	    public FooterPage()
	    {
	        driver = Hooks.driver;
	        
	    }

@When("^I Traverse to Footer$")
public void i_Traverse_to_Footer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I select all links and verify if works and lands on right page$")
public void i_select_all_links_and_verify_if_works_and_lands_on_right_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
