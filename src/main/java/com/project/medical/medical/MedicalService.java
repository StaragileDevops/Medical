package com.project.medical.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalService {
	
	@Autowired
	MedicalRepository doctorRepository;
	
	public Doctor registerDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
		}

	public Doctor createDoctor() {
		Doctor doctor = new Doctor("Doc101","Ruchin","psychiatrist","10 Years");
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctorDetails(String doctorRegistrationId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorRegistrationId).get();
	}
	
	public Doctor registerDummyDoctor() {
		Doctor doctor = new Doctor("Doc101","Ruchin","psychiatrist","10 Years");
		return doctor;
	}
	
	public String sayHello() {
		return "Hello from Doctor Ruchin";
	}

}
