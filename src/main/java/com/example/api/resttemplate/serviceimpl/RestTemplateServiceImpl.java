package com.example.api.resttemplate.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.api.common.pojo.Patient;
import com.example.api.resttemplate.service.IRestTemplateService;

@Service
public class RestTemplateServiceImpl implements IRestTemplateService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Patient getPatientData(int patientId) {
		return restTemplate.getForObject("http://patient-application/patient/get/" + patientId, Patient.class);
	}

	@Override
	public List<Object> getMedicationData(int patientId) {
		Object[] objects = restTemplate.getForObject("http://medication-application/medication/get/" + patientId, Object[].class);
		List<Object> medicine = Arrays.asList(objects);
		return medicine;
	}
	
}
