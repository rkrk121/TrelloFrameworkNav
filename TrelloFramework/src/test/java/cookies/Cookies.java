package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//Capture all the cookies
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie cookie : allCookies) 
		{
			//Name and Expiry date of cookie
			String cookieName = cookie.getName();
			System.out.println(cookieName);
			System.out.println(cookie.getName());
			System.out.println(cookie.getExpiry());	
		}
		//delete all the cookie
		//delete a specific cookie
		driver.manage().deleteAllCookies();
	//Set<Cookie> allCookiesAfterDelete = driver.manage().getCookies();
		//System.out.println(allCookiesAfterDelete.size());
		driver.manage().deleteCookieNamed("");
		Set<Cookie> allCookiesUponDeletingOneCookie = driver.manage().getCookies();
		System.out.println(allCookiesUponDeletingOneCookie.size());
		for (Cookie cookie : allCookiesUponDeletingOneCookie) 
		{
			System.out.println(cookie.getName());
		}
		
		
	}

}
