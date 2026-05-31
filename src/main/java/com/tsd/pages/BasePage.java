package com.tsd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tsd.driver.DriverManager;
import com.tsd.enums.WaitStrategy;
import com.tsd.factory.ExplicitWaitFactory;
import com.tsd.reports.ExtentLogger;

public  class BasePage {

	protected void click(By by, WaitStrategy waitStrategy,String elementName)  {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
		try {
			ExtentLogger.pass(elementName+" is clicked successfully",true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void sendkeys(By by,String value,WaitStrategy waitstrategy,String elementName)  {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
		try {
			ExtentLogger.pass(value+" is entered successfully in "+elementName,true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
}


