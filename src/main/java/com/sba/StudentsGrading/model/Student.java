package com.sba.StudentsGrading.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "std_id")
	private String stdId;

	@Column(name = "std_prename")
	private String stdPrename;
	
	@Column(name = "std_name")
	private String stdName;
	
	@Column(name = "std_lastname")
	private String stdLastname;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "id_card")
	private String idCard;
	public Student() {
		
	}
	
	public Student(String stdId, String stdPrename, String stdName, String stdLastname, String branch,String year, String idCard) {
		super();
		this.stdId = stdId;
		this.stdPrename = stdPrename;
		this.stdName = stdName;
		this.stdLastname = stdLastname;
		this.branch = branch;
		this.year = year;
		this.idCard = idCard;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	
	
	public String getStdPrename() {
		return stdPrename;
	}
	public void setStdPreName(String stdPrename) {
		this.stdPrename = stdPrename;
	}
	
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	
	public String getStdLastname() {
		return stdLastname;
	}
	public void setStdLastname(String stdLastname) {
		this.stdLastname = stdLastname;
	}
	
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
}

