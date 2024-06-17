package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage 
{
	WebDriver driver;
	public TrelloHomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getloginLink()
	{
		return loginLink;
	}
	@FindBy(xpath = "//div[contains(@class,'Buttonsstyles')]/a[text()='Log in']")
	private WebElement loginLink;

}
