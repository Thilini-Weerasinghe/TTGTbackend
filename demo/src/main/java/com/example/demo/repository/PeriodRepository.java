package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Period;

public interface PeriodRepository extends JpaRepository<Period, Integer> {

}
