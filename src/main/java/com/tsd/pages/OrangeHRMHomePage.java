package com.tsd.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tsd.constant.FrameworkConstant;
import com.tsd.driver.DriverManager;
import com.tsd.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage {


	private final By drpDownUserName = By.xpath("//header/div[1]/div[3]/ul/li/span/i");
	private final By linkLogout = By.xpath("//a[text()='Logout' and @role='menuitem']");

	public OrangeHRMHomePage clickDropDownicon() {
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(FrameworkConstant.getExplicitWait()))
		.until(ExpectedConditions.
				elementToBeClickable(drpDownUserName));
		click(drpDownUserName,WaitStrategy.CLICKABLE,"Dropdown Icon");
		return this;
	}

	public OrangeHRMLoginPage clickLogout(){
		click(linkLogout,WaitStrategy.CLICKABLE,"Log Out Button");
		return new OrangeHRMLoginPage();
	}




}
