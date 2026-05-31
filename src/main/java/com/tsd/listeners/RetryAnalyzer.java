package com.tsd.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.tsd.enums.ConfigProperties;
import com.tsd.utils.ConfigUtils;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int count = 0;
	private int retries = 1;

	@Override
	public boolean retry(ITestResult result) {

		boolean value = false;
		try {
			if (ConfigUtils.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
				value = count < retries;
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

}
