package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saucelogin {
	
	private WebDriver driver;

	@Given("I am on the Saucedemo login01 page")
	public void i_am_on_the_saucedemo_login01_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.saucedemo.com/");
		    System.out.println("Step: I am on the Saucedemo login page");
	}

	@When("I enter valid credentials01")
	public void i_enter_valid_credentials01() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement usernameInput = driver.findElement(By.id("user-name"));
	    WebElement passwordInput = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.id("login-button"));

	    usernameInput.sendKeys("standard_user");
	    passwordInput.sendKeys("secret_sauce");
	    loginButton.click();

	    System.out.println("Step: I enter valid credentials");
	}

	@Then("I should be logged01 in successfully")
	public void i_should_be_logged01_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement productsLabel = driver.findElement(By.xpath("//div[@class='product_label']"));
	    Assert.assertTrue(productsLabel.isDisplayed());

	    System.out.println("Step: I should be logged in successfully");
	    driver.quit();
	}

}





