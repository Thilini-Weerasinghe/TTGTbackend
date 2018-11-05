package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Period;
import com.example.demo.service.PeriodService;
@RestController


public class PeriodController {

	
	

		@Autowired
		private PeriodService periodService;
		
		@GetMapping("/period")
		public Iterable<Period> findAllPeriod(){
			
			return periodService.findAllPeriod();
		}
	}


