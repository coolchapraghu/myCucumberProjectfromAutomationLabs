package FeatureTestClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonOrderPageStepDefinitions {

    @Given("a registered user exists")
    public void a_registered_user_exists() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: a_registered_user_exists()");
    }

    @Given("user is on Amazon login page")
    public void user_is_on_amazon_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_is_on_amazon_login_page()");
    }

    @When("user enters username")
    public void user_enters_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_enters_username()");
    }

    @When("user enters password")
    public void user_enters_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_enters_password()");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_clicks_on_login_button()");
    }

    @Then("user navigates to order page")
    public void user_navigates_to_order_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_navigates_to_order_page()");
    }

    @When("user clicks on Order link")
    public void user_clicks_on_order_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_clicks_on_order_link()");
    }

    @Then("user checks the previous order details")
    public void user_checks_the_previous_order_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_checks_the_previous_order_details()");
    }

    @When("user clicks on Open Orders link")
    public void user_clicks_on_open_orders_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_clicks_on_open_orders_link()");
    }

    @Then("user checks the open order details")
    public void user_checks_the_open_order_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_checks_the_open_order_details()");
    }

    @When("user clicks on Cancelled Orders link")
    public void user_clicks_on_cancelled_orders_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_clicks_on_cancelled_orders_link()");
    }

    @Then("user checks the cancelled order details")
    public void user_checks_the_cancelled_order_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_checks_the_cancelled_order_details()");
    }

}
