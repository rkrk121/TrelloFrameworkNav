package com.qsp.trello.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility 
{
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}

}
