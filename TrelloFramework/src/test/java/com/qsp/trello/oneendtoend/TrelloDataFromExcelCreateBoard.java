package com.qsp.trello.oneendtoend;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qsp.trello.pomrepo.TrelloBoardPage;
import com.qsp.trello.pomrepo.TrelloCreateBoardPage;
import com.qsp.trello.pomrepo.TrelloDeleteBoard;
import com.qsp.trello.pomrepo.TrelloHomePage;
import com.qsp.trello.pomrepo.TrelloLoginPage;

import screenshot_testing.BaseClass;

public class TrelloDataFromExcelCreateBoard extends BaseClass{



	

	@Test
	public void checkWhetherTheEndUserIsAbleToLogin() throws InterruptedException, IOException
	{
		TrelloHomePage homepage = new TrelloHomePage(driver);
		TrelloLoginPage loginpage = new TrelloLoginPage(driver);
		homepage.getloginLink().click();
		Thread.sleep(2000);
		loginpage.getUsernameTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
		Thread.sleep(2000);
		loginpage.getContinueButton().submit();
		Thread.sleep(2000);
		loginpage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		Thread.sleep(2000);
		loginpage.getLoginButton().submit();
		
		
	}
		
		
		
		
		
		
	}

}