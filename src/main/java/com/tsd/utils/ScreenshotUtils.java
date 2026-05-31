package com.tsd.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tsd.driver.DriverManager;

public final class ScreenshotUtils {
	
	private ScreenshotUtils() {
		
	}
	
	public static String getBase64Img() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

}
