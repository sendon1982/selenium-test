package org.jmatrix.selenium;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Login {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://yourhotdeal.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testLogin() throws Exception {
		selenium.open("/");
		selenium.click("id=j_idt27");
		selenium.waitForPageToLoad("30000");
		selenium.selectFrame("f3aeb8ef9a51d4c");
		selenium.waitForPopUp("_blank", "30000");
		selenium.selectWindow("name=_e_01f5");
		selenium.type("id=email", "sendon1982@163.com");
		selenium.type("id=pass", "wings1982");
		selenium.click("id=u_0_2");
		selenium.waitForPageToLoad("30000");
		selenium.selectWindow("null");
		selenium.click("id=submit");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.numOfDeals4Today");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=j_idt98");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPopUp("_self", "30000");
		selenium.type("id=threadSubject", "Test");
		selenium.click("id=j_idt130");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
