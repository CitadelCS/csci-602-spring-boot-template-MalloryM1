package edu.citadel.main;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"ghci", "test"})
public class RestApiApplicationTests {

	@Test
	public void contextLoads() {}

}

