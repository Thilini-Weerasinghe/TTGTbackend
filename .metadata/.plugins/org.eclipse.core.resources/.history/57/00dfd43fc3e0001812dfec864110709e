package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="period")


public class Period {

	

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name="id")
		private Integer id;
		
		@Column(name="time")
		private String time;

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


