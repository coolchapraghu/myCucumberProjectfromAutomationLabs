package FeatureDevelopmentClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchFeatureStepDefinitions {

    @Given("I have a search field on the Amazon page")
    public void i_have_a_search_field_on_the_amazon_page() {

        System.out.println("In Given function");

    }

    @When("I search for a product with name {string} and price {int}")
    //public void i_search_for_a_product_with_name_and_price(String string, Integer int1) {
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Add function productName " + productName + " price " + price);
    }

    @Then("Product with name {string} shall be displayed")
    //public void product_with_name_shall_be_displayed(String string) {
    public void product_with_name_shall_be_displayed(String productName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Then function product name " + productName);
    }

}
