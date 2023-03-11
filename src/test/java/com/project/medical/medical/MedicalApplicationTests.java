package com.project.medical.medical;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MedicalApplicationTests {

	@Autowired
	MedicalService doctorService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testService() {
	  assertEquals(doctorService.sayHello(), "Hello from Doctor Ruchin");
	}
}
