package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase{
	
	
	@FindBy(xpath = "//a[@class=\"toolbar-account\"]")
	static WebElement SignUp_icon;
	
	@FindBy(linkText = "New customer? Sign up for an account")
	static WebElement SignUp_link;
	
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	static WebElement TxtBox_F_Name;
	
	@FindBy(xpath = "//input[@id=\"last_name\"]")
	static WebElement TxtBox_L_Name;
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	static WebElement TxtBox_Email;
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	static WebElement TxtBox_Password;
	
	@FindBy(xpath = "//input[@value=\"Create\"]")
	static WebElement Btn_Create;
	
	@FindBy(xpath = "//a[@class=\"more-link\"]")
	static WebElement Btn_Logout;
	
	@FindBy(xpath="//p[@class='shopify-challenge__message']")
	static WebElement Btn_Confirm;
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clicSignUpLink() throws InterruptedException
	{
		SignUp_icon.click();
		Thread.sleep(2000);
		SignUp_link.click();
	}
	public void clickLogin()
	{
		SignUp_icon.click();
	}
	
	public void enter_fname(String fname) throws InterruptedException
	{
		Thread.sleep(2000);
		TxtBox_F_Name.sendKeys(fname);
	}
	
	public void enter_lname(String lname) throws InterruptedException
	{
		Thread.sleep(2000);
		TxtBox_L_Name.sendKeys(lname);
	}
	
	public void enter_email(String email) throws InterruptedException
	{
		Thread.sleep(2000);
		TxtBox_Email.sendKeys(email);
	}
	
	public void enter_password(String password) throws InterruptedException
	{
		Thread.sleep(2000);
		TxtBox_Password.sendKeys(password);
	}
	
	public void click_Create() throws InterruptedException
	{
		Thread.sleep(2000);
		Btn_Create.click();
		Thread.sleep(10000);
		//clickLogin();
		//Btn_Logout.click();
	}
	public void clickLogout()
	{
		//h= new HomePage();
		clickLogin();
		Btn_Logout.click();
	}
	
	public String validate_confirm()
	{
		String confirm_text = Btn_Confirm.getText();
		return confirm_text;
	}
}
