package stepdefs;

import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.SignUpPage;
import Pages.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSepDefs extends TestBase{
	
	private static void captureScreenshot(WebDriver driver, String fileName) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(fileName);
		try {
			Files.copy(sourceFile.toPath(), destinationFile.toPath());
			System.out.println("Screenshot captured: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot: " + e.getMessage());
		}
	}
	
	private static final Logger logger = LogManager.getLogger(SignUpSepDefs.class);
	
	SignUpPage sp=new SignUpPage(driver);

	@Given("user navigates to the signup page")
	public void user_navigates_to_the_signup_page() throws InterruptedException {
		logger.info("User navigates to the signuppage");
		
		getBrowser();
		String expectedtitle="Chiltern Oak Furniture | Solid Oak Online Furniture Store";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,expectedtitle);
		System.out.println("User is in home page now");

		sp.clicSignUpLink();
	}

	@When("the user enters their first name as {string}")
	public void the_user_enters_their_first_name_as(String string) throws InterruptedException {
		logger.info("the user enters their first name ");
		sp.enter_fname(string);
		System.out.println("User enters First name");
	}
	
	@When("the user enters their last name as {string}")
	public void the_user_enters_their_last_name_as(String string) throws InterruptedException {
		logger.info("the user enters their last name ");
		sp.enter_lname(string);
		System.out.println("User enters Last name");
	}
	
	@When("the user enters their email as {string}")
	public void the_user_enters_their_email_as(String string) throws InterruptedException {
		logger.info("the user enters their email ");
		sp.enter_email(string);
		System.out.println("User enters email");
	}
	
	@When("the user enters their password as {string}")
	public void the_user_enters_their_password_as(String string) throws InterruptedException {
		logger.info("the user enters their password ");
		sp.enter_password(string);	
		System.out.println("User enters password");
	}
	
	@When("the user click on create botton")
	public void the_user_click_on_create_botton() throws InterruptedException {
		logger.info("the user click on create botton ");
		sp.click_Create();
	}
	
	@Then("the user should see the status as {string}")
	public void the_user_should_see_the_status_as(String string) throws InterruptedException {
		logger.info("the user should be registered successfully ");
		
		String expectedText = string;
		String actualText = sp.validate_confirm();
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
