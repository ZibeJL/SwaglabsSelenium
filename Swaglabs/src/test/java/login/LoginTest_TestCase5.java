package login;

import org.testng.annotations.Test;

import base.BaseTests;

public class LoginTest_TestCase5 extends BaseTests {
  @Test
  public void EmptyImput () {
	loginPage.loginApplication("", "");
	  
  	}
}
