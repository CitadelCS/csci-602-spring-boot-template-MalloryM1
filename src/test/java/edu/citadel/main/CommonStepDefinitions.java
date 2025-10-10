package edu.citadel.main;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonStepDefinitions extends SpringIntegrationTest {

    @When("the client calls \\/version")
    public void theClientCallsVersion() {
        String url = createURLWithPort("/version");
        execute(url);
    }

    @Then("the client receives status code of {int}")
    public void theClientReceivesStatusCodeOf(int statusCode) {
        assertEquals(statusCode, lastResponse.getStatusCode().value());
    }

    @And("the client receives server version {double}")
    public void theClientReceivesServerVersion(double version) {
        assertEquals(String.valueOf(version), lastResponse.getBody());
    }
}
