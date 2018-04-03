package com.test.mirchi.step_definitions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.helpers.Hooks;
import com.test.mirchi.modules.HomePageAction;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
	public WebDriver driver;

	public HomePageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, MirchiHomePage.class);
	}

	@Given("^user open mirchi website$")
	public void user_open_mirchi_website() throws Throwable {
		driver.get("https://www.mirchi9.com/");
	}
	
	@Given("^user open mirchi website in Nexus$")
	public void user_open_mirchi_website_in_Nexus() throws Throwable {
		driver.get("https://www.mirchi9.com/");
		driver.manage().window().setSize(new Dimension(412, 732));

	}

	@When("^user click on NavBar$")
	public void user_click_on_NavBar() throws Throwable {

		HomePageAction.navBar(driver);
	}
	

	@Then("^user select a links and verify if works and lands on right page$")
	public void user_select_a_links_and_verify_if_works_and_lands_on_right_page() throws Throwable {

		HomePageAction.menuItems(driver);

	}
}
