package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Day;

@RestController

public class DayController {

	
	

		@Autowired
		private com.example.demo.service.DayService dayService;
		
		@GetMapping("/day")
		public Iterable<Day> findAllDay(){
			return dayService.findAllDay();
		}
	}


