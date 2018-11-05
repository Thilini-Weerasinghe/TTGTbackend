package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;
@Service
class subjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository ;
	@Override
	public Iterable<Subject> findAllSubject() {
		
		return subjectRepository.findAll();
	}
	

	
	
}
