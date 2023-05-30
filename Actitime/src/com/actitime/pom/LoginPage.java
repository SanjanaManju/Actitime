package com.actitime.pom;

import java.lang.reflect.Method;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "(//div[text()='Login ']")
    private WebElement lgBtn;
	
	
	public LoginPage (WebDriver driver)
	{
	PageFactory.initElements (driver, this);
}


public void setLogin(String un, String pw)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgBtn.click();
}
}

