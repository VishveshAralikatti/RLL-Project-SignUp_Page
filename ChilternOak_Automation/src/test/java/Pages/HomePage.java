package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends TestBase{
	
	@FindBy(xpath = "//a[@class=\"toolbar-account\"]")
	static WebElement SignUp_icon;
	
	@FindBy(linkText = "New customer? Sign up for an account")
	static WebElement SignUp_link;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicSignUpLink()
	{
		SignUp_icon.click();
		SignUp_link.click();
	}
	public void clickLogin()
	{
		SignUp_icon.click();
	}
	
	

}
