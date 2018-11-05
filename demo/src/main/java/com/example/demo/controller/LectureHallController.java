package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LectureHall;
import com.example.demo.service.LectureHallService;

@RestController


public class LectureHallController {

	


		@Autowired
		private LectureHallService lecHallService;
		
		@GetMapping("/lecturehall")
		public Iterable<LectureHall> findAllHall(){
			
			return lecHallService.findAllHall();
		}
	}


