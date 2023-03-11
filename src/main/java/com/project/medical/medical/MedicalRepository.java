package com.project.medical.medical;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRepository extends JpaRepository<Doctor,String> {

}
