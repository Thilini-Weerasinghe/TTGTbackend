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
@Table(name="yearTable")


public class YearTable {


		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name="id")
		private Integer id;
		
		@ManyToOne
		@JoinColumn(name="dp_id")
		private DayPeriod dayperiod;
		
		@ManyToOne
		@JoinColumn(name="s_id")
		private Subject subject;
		
		@ManyToOne
		@JoinColumn(name="lh_id")
		private LectureHall lechall;

		public YearTable() {
			
			// TODO Auto-generated constructor stub
		}
		
		

		public YearTable(Integer id, DayPeriod dayperiod, Subject subject, LectureHall lechall) {
			super();
			this.id = id;
			this.dayperiod = dayperiod;
			this.subject = subject;
			this.lechall = lechall;
		}



		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public DayPeriod getDayperiod() {
			return dayperiod;
		}

		public void setDayperiod(DayPeriod dayperiod) {
			this.dayperiod = dayperiod;
		}

		public Subject getSubject() {
			return subject;
		}

		public void setSubject(Subject subject) {
			this.subject = subject;
		}

		public LectureHall getLechall() {
			return lechall;
		}

		public void setLechall(LectureHall lechall) {
			this.lechall = lechall;
		}

		
		
		
	}


