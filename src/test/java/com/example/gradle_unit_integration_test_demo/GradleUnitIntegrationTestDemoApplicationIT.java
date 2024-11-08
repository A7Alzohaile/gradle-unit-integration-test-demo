package com.example.gradle_unit_integration_test_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradleUnitIntegrationTestDemoApplicationIT {

	@Test
	void contextLoads() {
	}
	@Test
	void my_simple_unit_test() {
	System.out.println("This is a unit test!");
	}


}
