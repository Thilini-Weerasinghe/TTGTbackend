package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;

@RestController

public class SubjectController {


		
		@Autowired
		private SubjectService subjectService;
		
		@GetMapping("/subject")
		public Iterable<Subject> findAllSubject(){
			return subjectService.findAllSubject();
		}
		}


