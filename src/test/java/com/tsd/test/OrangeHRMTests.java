package com.tsd.test;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tsd.annotation.FrameworkAnnotation;
import com.tsd.enums.CategoryType;
import com.tsd.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {

	private OrangeHRMTests() {

	}

	@FrameworkAnnotation(authors={"Thiru","Amuthan"},categories={CategoryType.REGRESSION,CategoryType.SANITY})
	@Test
	public void LoginLogoutTest(Map<String, String> data) {
		String title = new OrangeHRMLoginPage().enterUsername(data.get("username")).enterPassword(data.get("password"))
				.clickLogin().clickDropDownicon().clickLogout().getTitle();

		Assertions.assertThat(title).isEqualTo("OrangeHRM");

	}

	@FrameworkAnnotation(authors={"Thiru","Amuthan"},categories={CategoryType.REGRESSION,CategoryType.SANITY})
	@Test
	public void newTest(Map<String, String> data) {
		String title = new OrangeHRMLoginPage().enterUsername(data.get("username")).enterPassword(data.get("password"))
				.clickLogin().clickDropDownicon().clickLogout().getTitle();

		Assertions.assertThat(title).isEqualTo("OrangeHRM");

	}

//	@DataProvider(parallel = true)
//	public Object[][] getData() {
//		return new Object[][] { { "Admin", "admin123" }, { "Admin", "admin1234" },
//				// {"admin","0"},
//				// {"Admina","admin123"}
//		};
//	}

}
