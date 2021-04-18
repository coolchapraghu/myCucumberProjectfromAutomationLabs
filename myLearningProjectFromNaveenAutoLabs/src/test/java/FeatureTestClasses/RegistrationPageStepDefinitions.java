package FeatureTestClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class RegistrationPageStepDefinitions {

    @Given("User is on registration page")
    public void user_is_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_is_on_registration_page()");
    }

    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("In Function: user_enters_following_user_details()");
        List<List<String>> userList =  dataTable.asLists();

        for(List<String> e: userList){
            e.forEach(System.out::println);
        }
    }

    @Then("User registration shall be successful")
    public void user_registration_shall_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Function: user_registration_shall_be_successful()");
    }
}
