package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="day")
public class Day {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private Integer id;
		
		@Column(name="name")
		private String name;
		
		@OneToMany(mappedBy="day")
		@JsonIgnore
		private List <DayPeriod> dayperiod = new ArrayList<>();

		public Day() {
			
		}

		public Day(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	}


