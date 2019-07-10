package Cucumber.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginWithFactory {
	WebDriver driver;

	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://newtours.demoaut.com/");
	}

	@When("^User enter the valid credentials$")
	public void user_enter_the_valid_credentials() throws Throwable {
		PagesWithFactory login = PageFactory.initElements(driver, PagesWithFactory.class);
		login.login_new("tutorial", "tutorial");
	}

	@Then("^user must in home page and display success message$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
	}

}



