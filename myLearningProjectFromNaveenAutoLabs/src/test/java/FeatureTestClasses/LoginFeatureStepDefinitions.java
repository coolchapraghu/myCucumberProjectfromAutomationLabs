package FeatureTestClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureStepDefinitions {

    @Given("User is on Application Landing page")
    public void user_is_on_application_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_is_on_application_landing_page()");
    }

    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: ser_clicks_on_sign_in_button()");
    }
    @Then("user is displayed login screen")
    public void user_is_displayed_login_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_is_displayed_login_screen()");
    }
    @When("user enters {string} in username field")
    public void user_enters_in_username_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_enters_in_username_field(String string)");
    }
    @When("user enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_enters_in_password_field(String string)");
    }
    @When("user clicks Sign in button")
    public void user_clicks_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_clicks_sign_in_button()");
    }
    @Then("user gets login failed error message")
    public void user_gets_login_failed_error_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_gets_login_failed_error_message()");
    }

}
