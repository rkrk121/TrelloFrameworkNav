package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloCreateBoardPage 
{
	WebDriver driver;
	public TrelloCreateBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	

	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}

	public WebElement getCreatebutton() {
		return createbutton;
	}
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	private WebElement createbutton;

}
