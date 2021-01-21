package com.example.api.resttemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.common.pojo.Patient;
import com.example.api.resttemplate.service.IRestTemplateService;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {
	
	@Autowired
	private IRestTemplateService restTemplateService;
	
	@GetMapping(path = "/getPatientInfo/{patientId}", produces="application/json")
	public Patient getPatientData(@PathVariable("patientId") int patientId){
		return restTemplateService.getPatientData(patientId);
	}
	
	@GetMapping(path = "/getMedicationInfo/{patientId}", produces="application/json")
	public List<Object> getMedicationData(@PathVariable("patientId") int patientId){
		return restTemplateService.getMedicationData(patientId);
	}
}
