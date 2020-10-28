package RodanAndFields;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testAndVerifyHomePage {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.guru99.com/");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
