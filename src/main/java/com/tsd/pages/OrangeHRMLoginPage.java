package com.tsd.pages;

import org.openqa.selenium.By;

import com.tsd.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {
	
	
	private final By txtboxUsername = By.xpath("//input[@name='username']");
	private final By txtboxPassword = By.xpath("//input[@name='password' and @type='password']");
	private final By btnclickLogin = By.xpath("//button[@type='submit']");
	
	public OrangeHRMLoginPage enterUsername(String username)  {
		
	    sendkeys(txtboxUsername,username,WaitStrategy.VISIBLE,"Username");	    
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password){
		sendkeys(txtboxPassword,password,WaitStrategy.VISIBLE,"Password");
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		click(btnclickLogin,WaitStrategy.CLICKABLE,"Login Button");
		return new OrangeHRMHomePage();
	}
    
	public String getTitle() {
		return getPageTitle();
	}

}
