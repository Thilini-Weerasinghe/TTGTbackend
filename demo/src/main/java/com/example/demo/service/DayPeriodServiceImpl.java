package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DayPeriod;
import com.example.demo.repository.DayPeriodRepository;

@Service
public class DayPeriodServiceImpl implements DayPeriodService {

	@Autowired
	private DayPeriodRepository day_periodRepository;
	
	@Override
	public Iterable<DayPeriod> findAll() {
		
		return day_periodRepository.findAll();
	}

}
