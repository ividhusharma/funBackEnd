package com.aarpee.startfun.repository;

import com.aarpee.startfun.Entity.Patient;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called PatientRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Long> {}
