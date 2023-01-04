package login;

import org.testng.annotations.Test;

import base.BaseTests;

public class LoginTest_TestCase4 extends BaseTests {
  @Test
  public void testBlocked_user() {
	  loginPage.loginApplication("ImBatman", "RobinHood");
  }
}
