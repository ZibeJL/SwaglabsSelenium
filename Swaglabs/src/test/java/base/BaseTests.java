package base;

import pages.Index;
import pages.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected Index index;
	public static FileInputStream fis;
	public static Properties config = new Properties();
	public static String browser;
	

	@BeforeTest
  public void setUp(){
				
		
      driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      loginPage = new LoginPage(driver);
      index = new Index(driver);
	}

  
//@AfterTest
//  (alwaysRun=true)
	
//public void tearDown(){
//		driver.close();
//  }

}
