 package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Day;
import com.example.demo.repository.DayRepository ;

@Service
public class DayServiceImpl implements DayService {

	@Autowired
	private DayRepository dayRepository ;

	@Override
	public Iterable<Day> findAllDay() {
		// TODO Auto-generated method stub
		return dayRepository.findAll();
	}
	
	
}
