package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="DayPeriod")
public class DayPeriod {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name="id")
		private Integer id;
		
		@ManyToOne
		@JoinColumn(name="d_id")
		private Day day;
		
		@ManyToOne
		@JoinColumn(name="p_id")
		private Period period ;
		
		@OneToMany(mappedBy="dayperiod")
		@JsonIgnore
		private List<YearTable> yeartable = new ArrayList<>();

		public DayPeriod() {
		
			// TODO Auto-generated constructor stub
		}

		public DayPeriod(Integer id, Day day,  Period period) {
			super();
			this.id = id;
			this.day = day;
			this.period = period;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Day getDay() {
			return day;
		}

		public void setDay(Day day) {
			this.day = day;
		}

		public Period getPeriod() {
			return period;
		}

		public void setPeriod(Period period) {
			this.period = period;
		}

}


