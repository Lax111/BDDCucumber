package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//private WebDriver driver;

	 @FindBy(id = "user-name")
	    private WebElement usernameInput;
	 
	 
	    @FindBy(id = "password")
	    private WebElement passwordInput;

	    @FindBy(id = "login-button")
	    private WebElement loginButton;

	    // Constructor to initialize WebElements using PageFactory
	    public LoginPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    // Methods to interact with the elements
	    public void enterUsername(String username) {
	        usernameInput.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }
}
