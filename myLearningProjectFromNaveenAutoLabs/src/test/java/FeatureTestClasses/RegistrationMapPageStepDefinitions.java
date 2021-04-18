package FeatureTestClasses;

import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class RegistrationMapPageStepDefinitions {

    @When("User enters following user details with columns")
    public void user_enters_following_user_details_with_columns(io.cucumber.datatable.DataTable dataTable) {

        System.out.println("In Function: user_enters_following_user_details()");
        List<Map<String, String >> userMap = dataTable.asMaps(String.class, String.class);
        userMap.forEach(System.out::println);
    }

}
