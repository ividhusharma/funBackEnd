package com.aarpee.startfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aarpee.startfun.Entity.Patient;
import com.aarpee.startfun.dto.PatientDto;
import com.aarpee.startfun.repository.PatientRepository;

import java.security.Principal;

@Controller    
@RequestMapping(path="/patient") 
public class PatientController {
	@Autowired 
	private PatientRepository patientRepository;

	@RequestMapping(method=RequestMethod.POST, path="/create")
	public @ResponseBody Patient addNewUser (@RequestBody PatientDto patientDto) {

		Patient patient = new Patient();		
		patient.setFirstName(patientDto.getFirstName());
		patient.setLastName(patientDto.getLastName());
		patient.setMobileNumber(patientDto.getMobileNumber());
		patient.setAddress(patientDto.getAddress());
		patient.setEmail(patientDto.getEmail());
		
		return patientRepository.save(patient);
		//return "Saved";
	}

	@RequestMapping(method=RequestMethod.GET, path="/all")
	public @ResponseBody Iterable<Patient> getAllUsers() {
		// This returns a JSON or XML with the users
		return patientRepository.findAll();
	}

	@RequestMapping(method=RequestMethod.GET, path="/user")
	public @ResponseBody String user(Principal user) {
		return user.getName();
	}
}
