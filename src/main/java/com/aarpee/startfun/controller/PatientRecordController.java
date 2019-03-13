package com.aarpee.startfun.controller;

import com.aarpee.startfun.Entity.Patient;
import com.aarpee.startfun.Entity.PatientRecord;
import com.aarpee.startfun.dto.PatientRecordDto;
import com.aarpee.startfun.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(path = "/patient_record")
public class PatientRecordController {
  @Autowired private PatientRecordRepository patientRecordRepository;

  @RequestMapping(method = RequestMethod.POST, path = "/create")
  public @ResponseBody PatientRecord createRecord(@RequestBody PatientRecordDto patientRecordDto) {
    PatientRecord patientRecord = new PatientRecord();
    Patient patient=new Patient();
    patientRecord.setPatientRecordFee(patientRecordDto.getPatientRecordFee());
    patientRecord.setPatientRecordDoctorName(patientRecordDto.getPatientRecordDoctorName());
    patientRecord.setPatientRecordBloodPressure(patientRecordDto.getPatientRecordBloodPressure());
    patientRecord.setPatientRecordDate(new Date());
    patientRecord.setPatientRecordHeartBeat(patientRecordDto.getPatientRecordHeartBeat());
    patientRecord.setPatientRecordHeight(patientRecordDto.getPatientRecordHeight());
    patientRecord.setPatientRecordWeight(patientRecordDto.getPatientRecordWeight());
    patient.setPatientId(patientRecordDto.getPatientId());
    patientRecord.setPatient(patient);
    return patientRecordRepository.save(patientRecord);
  }
  PatientController patientController=new PatientController();
  @RequestMapping(method = RequestMethod.GET, path = "/all")
  public @ResponseBody Iterable<PatientRecord> getAllUsers() {
    // This returns a JSON or XML with the users
    return patientRecordRepository.findAll();
  }
}
