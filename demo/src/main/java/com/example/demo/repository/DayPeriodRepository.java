package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DayPeriod;

public interface DayPeriodRepository extends JpaRepository<DayPeriod, Integer> {

}
