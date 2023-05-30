package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static
	{
		System .setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void login()
	{
		driver.get("https://demo.actitime.com/");
		LoginPage l= new LoginPage(driver);
		l.setLogin("admin", "manager");

	}
	
	@AfterMethod
	public void logout()
	{
	HomePage h= new HomePage(driver);
	h.setLogout();
	}
	

}
