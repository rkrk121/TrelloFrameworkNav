package com.qsp.trello.oneendtoend;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qsp.trello.genericutility.BaseClass;
import com.qsp.trello.pomrepo.TrelloBoardPage;
import com.qsp.trello.pomrepo.TrelloCreateBoardPage;
import com.qsp.trello.pomrepo.TrelloDeleteBoard;
import com.qsp.trello.pomrepo.TrelloHomePage;
import com.qsp.trello.pomrepo.TrelloLoginPage;

public class TrelloCreateAndDeleteBoard extends BaseClass
{
	@Test
	public void checkWhetherTheEndUserIsAbleToCreateBoard() throws IOException, InterruptedException
	{
		
		TrelloHomePage homepage=new TrelloHomePage(driver);
		TrelloLoginPage loginPage=new TrelloLoginPage(driver);
		TrelloBoardPage boardpage=new TrelloBoardPage(driver);
		TrelloCreateBoardPage createBoardpage=new TrelloCreateBoardPage(driver);
		TrelloDeleteBoard deleteBoard=new TrelloDeleteBoard(driver);
		
		homepage.getloginLink().click();
		loginPage.getUsernameTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
		loginPage.getContinueButton().submit();
		loginPage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		loginPage.getLoginButton().submit();
		boardpage.getCreateOption().click();
		boardpage.getCreateBoardOption().click();
		Thread.sleep(3000);
		createBoardpage.getBoardTitleTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("boardtitle"));
		Thread.sleep(3000);
		createBoardpage.getCreatebutton().click();
		deleteBoard.getMenuOption().click();
		deleteBoard.getCloseBoard().click();
		deleteBoard.getCloseButton().click();
		deleteBoard.getPermanentlyDeleteBoardOption().click();
		deleteBoard.getDeleteElement().click();
		
		
		
		
		
		
	}
	

}
