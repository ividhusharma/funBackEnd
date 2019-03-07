package com.aarpee.startfun.repository;

import org.springframework.data.repository.CrudRepository;
import com.aarpee.startfun.Entity.Patient;

// This will be AUTO IMPLEMENTED by Spring into a Bean called PatientRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
