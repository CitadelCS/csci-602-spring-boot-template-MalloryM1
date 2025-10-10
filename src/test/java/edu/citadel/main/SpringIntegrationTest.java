package edu.citadel.main;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("ghci")
public class SpringIntegrationTest {
    // executeGet implementation
    @LocalServerPort
    private int port;

    protected TestRestTemplate testRestTemplate = new TestRestTemplate();
    protected ResponseEntity<String> lastResponse;

    protected void execute(String uri) {
        lastResponse = testRestTemplate.getForEntity(uri, String.class);
    }

    protected String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}