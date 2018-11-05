package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LectureHall;

public interface LectureHallRepository extends JpaRepository<LectureHall, Integer> {

}
