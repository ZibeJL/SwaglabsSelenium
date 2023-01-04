package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class ProductCatalogue {
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		//initialization
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="button.btn.btn_primary.btn_small.btn_inventory")
	List<WebElement> products;
	By productsBy = By.cssSelector("button.btn.btn_primary.btn_small.btn_inventory");
	
	public List<WebElement> getProductList() 
	{
		waitForElementToAppear(productsBy);
		return products;
	}

	private void waitForElementToAppear(By productsBy2) {
		// TODO Auto-generated method stub
		
	}
	
	
}

