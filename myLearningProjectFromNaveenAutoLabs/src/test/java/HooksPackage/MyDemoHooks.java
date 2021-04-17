package HooksPackage;


import io.cucumber.java.*;
import io.cucumber.messages.Messages;

public class MyDemoHooks {


    @Before(order = 1)
    public void setupBrowser(Scenario sc){
        
        System.out.println("Launching Chrome Browser ");
        System.out.println("Scenario name: " + sc.getName());
    }

    @Before(order = 2)
    public void setupUrl(){

        System.out.println("Launch URL");
    }

    /*@BeforeStep
    public void takeScreenShot(){

        System.out.println("In BeforeStep takeScreenSHot() function");
    }

    @AfterStep
    public void refreshPage(Scenario sc){

        System.out.println("In AfterStep refreshPage() function");
    }*/

    @After(order = 2)
    public void tearDown_CloseApplication(Scenario sc){

        System.out.println("Scenario status before closing the application Status: " + sc.getStatus());
        System.out.println(" Order 2: Close the Application ");
    }

    @After(order = 1)
    public void tearDown_BrowseClose(){

        System.out.println(" Order 1: Close the browser ");
    }
}
