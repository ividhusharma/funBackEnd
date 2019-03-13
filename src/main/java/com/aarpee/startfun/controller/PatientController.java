package com.aarpee.startfun.controller;

import com.aarpee.startfun.dto.MailDto;
import com.aarpee.startfun.microservice.mailer.MailerServiceProxy;
import com.aarpee.startfun.Entity.Patient;
import com.aarpee.startfun.dto.PatientDto;
import com.aarpee.startfun.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.security.Principal;
import java.util.Date;
import java.util.Optional;

@Controller    
@RequestMapping(path="/patient") 
public class PatientController {
	@Autowired 
	private PatientRepository patientRepository;

	@Autowired
	private MailerServiceProxy mailerServiceProxy;

	@RequestMapping(method=RequestMethod.POST, path="/create")
	public @ResponseBody Patient addNewUser (@RequestBody PatientDto patientDto) {

		Patient patient = new Patient();
		patient.setFirstName(patientDto.getFirstName());
		patient.setLastName(patientDto.getLastName());
		patient.setMobileNumber(patientDto.getMobileNumber());
		patient.setAddress(patientDto.getAddress());
		patient.setEmail(patientDto.getEmail());

		Patient savedPatient = patientRepository.save(patient);
		System.out.println(mailerServiceProxy.sendMail(String.valueOf(savedPatient.getUserId())));
		return savedPatient;
	}

	/*
  @RequestMapping(method = RequestMethod.POST, path = "/create")
  public @ResponseBody Patient createPatient(@RequestBody PatientDto patientDto) {
    Patient patient = new Patient();
    patient.setPatientFirstName(patientDto.getPatientFirstName());
    patient.setPatientLastName(patientDto.getPatientLastName());
    patient.setPatientAge(patientDto.getPatientAge());
    patient.setPatientEmail(patientDto.getPatientEmail());
    patient.setPatientMobileNumber(patientDto.getPatientMobileNumber());
    patient.setPatientAddress(patientDto.getPatientAddress());
    patient.setPatientRegistrationDate(new Date());

    return patientRepository.save(patient);
    // return "Saved";
  }
*/
  @RequestMapping(method = RequestMethod.GET, path = "/all")
  public @ResponseBody Iterable<Patient> getAllUsers() {
    // This returns a JSON or XML with the users
    return patientRepository.findAll();
  }

  @RequestMapping(method = RequestMethod.GET, path = "/user")
  public @ResponseBody String user(Principal user) {
    return user.getName();
  }

  @RequestMapping(method = RequestMethod.GET, path = "/patientId/{patientId}")
  public @ResponseBody Optional<Patient> getPatientById(@PathParam("patientId") String patientId) {
    return patientRepository.findById(Long.parseLong(patientId));
  }
}
