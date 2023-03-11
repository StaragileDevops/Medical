package com.project.medical.medical;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMedicalService {
	
	@Autowired
	MedicalService doctorService;
	
	@Test
	public void testRegisterDoctor() {
		Doctor doctor = new Doctor("Doc101","Ruchin","psychiatrist","10 Years");
		assertEquals(doctor.getDoctorRegistrationId(), doctorService.registerDummyDoctor().getDoctorRegistrationId());
	}

}
