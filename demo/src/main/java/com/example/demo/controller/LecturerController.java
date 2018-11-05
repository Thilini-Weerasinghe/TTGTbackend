package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Lecturer;
import com.example.demo.service.LecturerService;

@RestController


public class LecturerController {

	
	

		@Autowired
		private LecturerService lecturerService;
		@GetMapping("/api/lecturer")
		public Iterable<Lecturer> findlecturer(){
			
			return lecturerService.findAllLecturer();
		}
		
		@PostMapping("/api/addlec")
		 public Iterable<Lecturer> saveLecturer(@RequestBody Iterable<Lecturer> lecturer) {
			 
			 return lecturerService.saveLecturer(lecturer);
		 	

	}
//		@PostMapping("add")
//		public String saveUser(@RequestBody Lecturer lecdata) {
//			
//			return lecturerService.saveAll();
//		}
	}


