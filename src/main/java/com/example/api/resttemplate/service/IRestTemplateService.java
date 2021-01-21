package com.example.api.resttemplate.service;

import java.util.List;

import com.example.api.common.pojo.Patient;

public interface IRestTemplateService {

	public Patient getPatientData(int patientId);

	public List<Object> getMedicationData(int patientId);
	
}