package AddShoppingCard;

import org.testng.annotations.Test;

import base.BaseTests;

public class AddDiferentProducToShppingCard extends BaseTests {
  @Test
  public void AddDiferentItems() {
	  loginPage.loginApplication("standard_user", "secret_sauce");
	  index.AddAllsElementToShoppingCart();
  }
}
