package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.YearTable;

public interface YearTableRepository extends JpaRepository<YearTable, Integer> {

}
