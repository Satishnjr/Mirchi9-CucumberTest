package com.test.mirchi.pageobjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
public class MirchiHomePage extends BaseClass{

	

	public MirchiHomePage(WebDriver driver){
		super(driver);
	}    
	@FindBy(how=How.ID, using="top-mobile-toggle")
	public static WebElement navbar;
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;
	
	@FindBy(how=How.LINK_TEXT, using="Contact us")
	public static WebElement contact_us;
	
	@FindBy(how=How.LINK_TEXT, using="Sign out")
	public static WebElement sign_out;

		
	public static class HeaderPage 
	{
		
		@FindBy(how=How.CLASS_NAME, using="menu-item")
		public static WebElement menu_item;
		
		@FindBy(how=How.XPATH, using="//*a[@title='Dresses']")
		public static WebElement menu_dresses;
		
		@FindBy(how=How.XPATH, using="//*a[@title='T-shirts']")
		public static WebElement menu_tshirts;

		public static class WomenPage
		{
			@FindBy(how=How.LINK_TEXT,using="Dresses")
			public static WebElement dresses;
	
		}
	}
	public static class FooterPage
	{

		@FindBy(how=How.CSS,using=".footer-social-wrap a")
		public static WebElement footer;

	}
	public static class GoogleAdsPage{

		@FindBys( {@FindBy(className = "adsbygoogle")} )
		 public static List<WebElement> ads;
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	