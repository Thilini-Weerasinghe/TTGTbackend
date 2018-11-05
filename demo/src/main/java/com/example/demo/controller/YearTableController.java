package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.YearTableService;
import com.example.demo.model.YearTable;

@RestController

public class YearTableController {

	


		@Autowired
		private YearTableService yearTableService;
		
		@GetMapping("/yeartable")
		public Iterable<YearTable> finfall(){
			
			return yearTableService.findAll();
		}
	}


