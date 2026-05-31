package com.tsd.driver;

import java.util.Objects;

import com.tsd.enums.ConfigProperties;
import com.tsd.factory.DriverFactory;
import com.tsd.utils.ConfigUtils;

public final class Driver {

	private Driver() {

	}

	public static void initDriver(String browser) throws Exception {
		
		if (Objects.isNull(DriverManager.getDriver())) {

			try {
				DriverManager.setDriver(DriverFactory.getDriver(browser));
			} catch (Throwable e) {
				throw new RuntimeException("Browser invocation is failed, please check the driver factory file");
			}
			DriverManager.getDriver().get(ConfigUtils.get(ConfigProperties.URL));
		}

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();
			DriverManager.unload();

		}
	}

}
