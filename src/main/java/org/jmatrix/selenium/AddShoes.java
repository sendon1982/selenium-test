package org.jmatrix.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddShoes {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://yourhotdeal.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAddShoes() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("span.numOfDeals4Today")).click();
    driver.findElement(By.id("j_idt98")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _self | 30000]]
    driver.findElement(By.id("threadSubject")).clear();
    driver.findElement(By.id("threadSubject")).sendKeys("Crocs Baya Heathered Fuzz Lined Clog: kids $14, Adults $17");
    new Select(driver.findElement(By.name("j_idt117"))).selectByVisibleText("Apparel, Shoes & Bags");
    driver.findElement(By.id("j_idt130")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
