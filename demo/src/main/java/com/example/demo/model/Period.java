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
@Table(name="period")


public class Period {

	

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name="id")
		private Integer id;
		
		@Column(name="time")
		private String time;
		
		@OneToMany(mappedBy="period")
		@JsonIgnore
		private List <DayPeriod> dayperiod = new ArrayList<>();

		public Period() {
			
			// TODO Auto-generated constructor stub
		}

		public Period(Integer id, String time) {
			super();
			this.id = id;
			this.time = time;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		
		
		
	}


