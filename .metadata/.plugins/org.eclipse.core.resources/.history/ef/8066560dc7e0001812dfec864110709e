package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Subject")

public class Subject {

		@Id
		 @GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Id") 
		private Integer id;
		
		@Column(name="Subject_Name") 
		private String Subject_name;
		  
		@Column(name="course_code") 
		private String coure_code;
		
		@Column(name="Year") 
		private Integer year;
		
//		@Column(name="Lec_Id") 
//		private String lec_id;
		
		@ManyToOne
		@JoinColumn(name="Lec_Id")
		private Lecturer lecturer;
		

		public Subject() {
			
			// TODO Auto-generated constructor stub
		}

		public Subject(Integer id, String subject_name, String coure_code, Integer year, Lecturer lecturer ) {
			super();
			this.id = id;
			this.Subject_name = subject_name;
			this.coure_code = coure_code;
			this.year = year;
			this.lecturer = lecturer;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSublect_name() {
			return Subject_name;
		}

		public void setSublect_name(String sublect_name) {
			Subject_name = sublect_name;
		}

		public String getCoure_code() {
			return coure_code;
		}

		public void setCoure_code(String coure_code) {
			this.coure_code = coure_code;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Lecturer getLec_id() {
			return lecturer;
		}

		public void setLec_id(Lecturer lecturer) {
			this.lecturer = lecturer;
		}
		
		

	}


