package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LectureHall;
import com.example.demo.repository.LectureHallRepository;

@Service
public class LectureHallServiceImpl implements LectureHallService {

	@Autowired
	private LectureHallRepository lec_hallRepository;
	
	@Override
	public Iterable<LectureHall> findAllHall() {
		// TODO Auto-generated method stub
		return lec_hallRepository.findAll();
	}

}
