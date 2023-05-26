package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {
	
	WebDriver driver = Phase2Hooks.driver;
	
	@When("I click on the Product name as {string}")
	public void i_click_on_the_Product_name_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement productName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		productName.click();
		Thread.sleep(2000);
	}

	@When("I click on the Add to cart Button")
	public void i_click_on_the_Add_to_cart_Button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement addtocartButton = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		addtocartButton.click();
		Thread.sleep(2000);
	}

	@When("I click on Shopping cart link")
	public void i_click_on_Shopping_cart_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement shoppingCartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingCartLink.click();
		Thread.sleep(2000);
	}
	
	@Then("I verify the item on cart page as {string}")
	public void i_verify_the_item_on_cart_page_as(String expectedProductName) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement productTitleOnCartPage = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String actualProductName = productTitleOnCartPage.getText();
		Assert.assertEquals(actualProductName, expectedProductName);
		
	}

}
		
	
