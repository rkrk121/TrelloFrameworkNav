package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloDeleteBoard 
{
	WebDriver driver;
	public TrelloDeleteBoard (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Show menu']/..//span[@data-testid='OverflowMenuHorizontalIcon']")
	private WebElement menuOption;
	

	public WebElement getMenuOption() {
		return menuOption;
	}

	public WebElement getCloseBoard() {
		return closeBoard;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getPermanentlyDeleteBoardOption() {
		return permanentlyDeleteBoardOption;
	}

	@FindBy(xpath = "//a[@class='board-menu-navigation-item-link board-menu-navigation-item-link-v2 js-close-board']")
	private WebElement closeBoard;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//button[text()='Permanently delete board']")
	private WebElement permanentlyDeleteBoardOption;
	
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deleteElement;
	
	public WebElement getDeleteElement() {
		return deleteElement;
	}

}
