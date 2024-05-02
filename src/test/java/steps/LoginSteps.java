package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @When("User enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        System.out.println("Hello World");
        System.out.println("userEntersTheUsernameAndPassword");
    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("userIsOnLoginPage");
         System.out.println("This sop is added in master remote");
    }

    @And("Click on the login button")
    public void clickOnTheLoginButton() {
        System.out.println("clickOnTheLoginButton");
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage");
    }
}
