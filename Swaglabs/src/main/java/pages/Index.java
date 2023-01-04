package pages;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index {
	WebDriver driver;
	public Index(WebDriver driver) {
		super();
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="add-to-cart-sauce-labs-backpack")
	WebElement addToCard;
	
	@FindBy (css="button.btn.btn_primary.btn_small.btn_inventory")
	WebElement ProductNameAll;
	
	@FindBy (css="div.inventory_item_name")
	WebElement ItemName;
	
	@FindBy (id="shopping_cart_container")
	WebElement shoppingCart;
	
	public void AddElementToShoppingCart () {
		addToCard.click();
		
	}
	
	public void AddAllsElementToShoppingCart () {
		
		String[] items= {"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};

		addItems(driver,items);

		}

		public static  void addItems(WebDriver driver,String[] items)

		{

		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("div.inventory_item_name"));

		for(int i=0;i<products.size();i++)

		{

			String name=products.get(i).getText();

			
		List<String> itemsList = Arrays.asList(items);

		if(itemsList.contains(name))

		{

		j++;

		//click on Add to cart

		driver.findElements(By.cssSelector("button.btn.btn_primary.btn_small.btn_inventory")).get(i).click();

		if(j==6)
			//j==items.length

		{

		break;

			}

				}

					}

		}
}
