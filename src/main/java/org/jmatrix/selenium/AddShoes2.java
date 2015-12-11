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

public class AddShoes2 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://yourhotdeal.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testAddShoes2() throws Exception {
		selenium.open("/");
		selenium.click("css=span.numOfDeals4Today");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=j_idt98");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPopUp("_self", "30000");
		selenium.type("id=threadSubject", "Crocs Baya Heathered Fuzz Lined Clog: kids $14, Adults $17");
		selenium.select("name=j_idt117", "label=Apparel, Shoes & Bags");
		selenium.click("id=j_idt130");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
