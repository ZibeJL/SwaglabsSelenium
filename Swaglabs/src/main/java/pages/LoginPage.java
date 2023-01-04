package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super();
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="user-name")
	WebElement userName;
	
	@FindBy (id="password")
	WebElement passwordEle;
	
	@FindBy (id="login-button")
	WebElement submit;
	
	
	public void loginApplication(String user,String password ) {
		userName.sendKeys(user);
		passwordEle.sendKeys(password);
		submit.click();
	}
	
	public void DeleteInput() {
		userName.clear();
		passwordEle.clear();
	}
	
}

