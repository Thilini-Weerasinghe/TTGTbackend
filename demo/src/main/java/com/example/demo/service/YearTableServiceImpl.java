package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.YearTable;
import com.example.demo.repository.YearTableRepository;

@Service
public class YearTableServiceImpl implements YearTableService {

	@Autowired
	private YearTableRepository years_tableRepository;
	
	
	@Override
	public Iterable<YearTable> findAll() {
		
		
		return years_tableRepository.findAll();
	}

}
