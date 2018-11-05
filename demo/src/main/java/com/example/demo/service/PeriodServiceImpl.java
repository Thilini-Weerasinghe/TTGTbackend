package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Period;
import com.example.demo.repository.PeriodRepository;

@Service
public class PeriodServiceImpl implements PeriodService{

	@Autowired
	private PeriodRepository periodRepository;
	
	@Override
	public Iterable<Period> findAllPeriod() {
		// TODO Auto-generated method stub
		return periodRepository.findAll();
	}

}
