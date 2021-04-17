package FeatureTestClasses;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberFeatureStepDefinitions {

    @Given("User wants to select a car type {string} from uber app")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" In function: public void user_wants_to_select_a_car_type_from_uber_app()");
        System.out.println("carType: " + carType);
    }

    @When("user select car {string} and pick up point {string} and drop location {string}")
    public void user_select_car_and_pick_up_point_and_drop_location(String carType, String fromLoc, String toLoc) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" In function: public void user_select_car_and_pick_up_point_and_drop_location()");
        System.out.println("carType: " + carType + " fromLoc: " + fromLoc + " toLoc: " + toLoc);
    }

    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" In function: public void driver_starts_the_journey()");
    }

    @And("Driver ends the journey")
    public void driver_ends_the_journey() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" In function: public void driver_ends_the_journey()");
    }

    @Then("User pays {int} INR")
    public void user_pays_inr(Integer price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" In function: public void user_pays_inr(Integer int1)");
    }
}
