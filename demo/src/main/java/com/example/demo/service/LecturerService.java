package com.example.demo.service;


import com.example.demo.model.Lecturer;

public interface LecturerService {

	Iterable<Lecturer> findAllLecturer();
	
	Iterable<Lecturer> saveLecturer(Iterable<Lecturer> lecturer);
}
