package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Phase2LoginStepDef {

	WebDriver driver = Phase2Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys(UserNameVal);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(PassVal);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = driver.findElement(By.name("login-button"));
		loginBtn.click();
		Thread.sleep(2000);
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys(UserNameVal);
	}

	@When("I enter password {string}")
	public void i_enter_password(String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(PassVal);
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActError = error.getText();
		
		Assert.assertEquals(ActError, ExpError);  
	}

}
