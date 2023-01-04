package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.BaseTests;

public class LoginTest_TestCase2 extends BaseTests {
	//private WebDriver driver;
	@FindBy (xpath="//h3[@data-test='error']")
	WebElement errorMessageLoginAssert;
@Test
  public void testSameDataInput() {
	  loginPage.loginApplication("standard_user", "standard_user");
	  loginPage.DeleteInput();
	  loginPage.loginApplication("locked_out_user", "secret_sauce");
	  loginPage.DeleteInput();
	  loginPage.loginApplication("ImBatman", "RobinHood");
	  
//	  assertEquals("Epic sadface: Username and password do not match any user in this service",errorMessageLoginAssert().getText());	  
 }

}
