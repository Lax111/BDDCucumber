package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags {

	
	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
	    System.out.println(" the user logging successfully");
	}

	@When("the user enters invalid username and password")
	public void the_user_enters_invalid_username_and_password() {
		 System.out.println(" the user should not logging successfully");
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
		 System.out.println(" the error message should be displayed");
	}

}
