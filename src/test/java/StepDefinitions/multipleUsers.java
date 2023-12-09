package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleUsers {

	WebDriver driver;

@Given("the user is on the Saucedemo login page")
public void the_user_is_on_the_saucedemo_login_page() {
    // Write code here that turns the phrase above into concrete actions
	 driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/");

}

@When("the user enter {string} and {string}")
public void the_user_enter_and(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
    
	WebElement usernameField = driver.findElement(By.id("user-name"));
    WebElement passwordField = driver.findElement(By.id("password"));

    usernameField.sendKeys(username);
    passwordField.sendKeys(password);
}

@When("the click on the login button")
public void click_on_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
	WebElement loginButton = driver.findElement(By.id("login-button"));
    loginButton.click();

}
////h3[data-test="error"]
//@Then("the user should be {string}")
//public void the_user_should_be(String login_status) {
//    if(login_status.equals("successful")) 
//      {
//    WebElement product = driver.findElement(By.cssSelector(".product_label"));
//     assertEquals("Products",product.getText());
//    }
//    else {
//   WebElement errorElement =  driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
//  assertEquals("Epic sadface: Sorry, this user has been locked out." ,errorElement.getText());
//    }
    
@Then("the user should be {string}")
public void the_user_should_be(String loginStatus) {
	 if (loginStatus.equals("successful")) {
            // Assuming successful login redirects to a page with the header "Products"
            WebElement productsHeader = driver.findElement(By.cssSelector(".product_label"));
            assertEquals("Products", productsHeader.getText());
        } else {
            // Assuming unsuccessful login shows an error message
            WebElement errorElement = driver.findElement(By.cssSelector("[data-test='error']"));
            assertEquals("Epic sadface: Username and password do not match any user in this service",
                    errorElement.getText());
        }
 
    
    
    
  driver.quit();
 }
}

