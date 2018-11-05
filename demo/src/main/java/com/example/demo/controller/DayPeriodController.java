package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DayPeriod;
import com.example.demo.service.DayPeriodService;

@RestController

public class DayPeriodController {

	

	@Autowired
		private DayPeriodService day_periodService;

	@GetMapping("/dayperiod")
	public Iterable<DayPeriod> findAll(){
		
		return day_periodService.findAll();
	}
	}

