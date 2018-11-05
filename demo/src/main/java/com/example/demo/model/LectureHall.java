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
@Table(name="LecHall")

public class LectureHall {

	

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private Integer id;
		
		@Column(name="lh_code")
		private String lh_code;
		
		@OneToMany(mappedBy="lechall")
		@JsonIgnore
		private List<YearTable> yeartable = new ArrayList<>();
		
		

		public LectureHall() {

			// TODO Auto-generated constructor stub
		}

		public LectureHall(Integer id, String lh_code) {
			super();
			this.id = id;
			this.lh_code = lh_code;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getLh_code() {
			return lh_code;
		}

		public void setLh_code(String lh_code) {
			this.lh_code = lh_code;
		}
		
		
	}


