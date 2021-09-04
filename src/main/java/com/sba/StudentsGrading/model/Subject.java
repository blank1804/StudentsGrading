package com.sba.StudentsGrading.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "subjects")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "subject_id")
	private String subjectId;

	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "subject_credit")
	private int subjectCredit;


	
	public Subject() {
		
	}
	
	public Subject(String subjectId, String subjectName, int subjectCredit) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectCredit = subjectCredit;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	public int getSubjectCredit() {
		return subjectCredit;
	}
	public void setSubjectCredit(int subjectCredit) {
		this.subjectCredit = subjectCredit;
	}
	
	
}

