package AddShoppingCard;

import org.testng.annotations.Test;

import base.BaseTests;

public class AddProductToShoppingCard extends BaseTests {
  @Test
  public void testSameDataInput() {
	  loginPage.loginApplication("standard_user", "secret_sauce");
	  index.AddElementToShoppingCart();
  
  }
}
