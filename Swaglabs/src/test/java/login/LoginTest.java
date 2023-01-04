package login;

import org.testng.Assert;
import org.testng.annotations.Test;



import base.BaseTests;



@Test
public class LoginTest extends BaseTests {
	
	
  @Test
  
  public void testSuccessfulLogin() throws InterruptedException {
	  loginPage.loginApplication("standard_user", "secret_sauce");
	  Assert.assertTrue(true);

  }

}
