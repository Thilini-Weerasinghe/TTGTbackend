package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Lecturer;

public interface LectureRepository extends JpaRepository<Lecturer, Integer> {

}
