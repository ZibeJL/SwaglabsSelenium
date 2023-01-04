package login;

import org.testng.annotations.Test;

import base.BaseTests;

public class LoginTest_TestCase3 extends BaseTests {
  @Test
  public void testBlocked_user() {
	  loginPage.loginApplication("locked_out_user", "secret_sauce");
  }
  
}
