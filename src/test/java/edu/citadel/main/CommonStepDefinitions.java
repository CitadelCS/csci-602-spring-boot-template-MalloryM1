package edu.citadel.main;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonStepDefinitions extends SpringIntegrationTest {

    @When("the client calls \\/version")
    public void theClientCallsVersion() {
        String url = createURLWithPort("/version");
        execute(url);
    }

    @When("the client calls \\/health")
    public void theClientCallsHealth() {
        String url = createURLWithPort("/health");
        execute(url);
    }

    @When("the client calls \\/info")
    public void theClientCallsInfo() {
        String url = createURLWithPort("/info");
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

    @And("the client receives health status ok")
    public void theClientReceivesHealthStatusOk() {
        String responseBody = lastResponse.getBody();
        assertTrue(responseBody.contains("\"status\""));
        assertTrue(responseBody.contains("\"ok\""));
    }

    @And("the client receives application info")
    public void theClientReceivesApplicationInfo() {
        String responseBody = lastResponse.getBody();
        assertTrue(responseBody.contains("\"name\""));
        assertTrue(responseBody.contains("\"version\""));
        assertTrue(responseBody.contains("\"description\""));
    }
}
