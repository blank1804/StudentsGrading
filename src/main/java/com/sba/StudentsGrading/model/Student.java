package com.sba.StudentsGrading.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "students")
public class Student {
	
	private long stdId;
	private String stdPrename;
	private String stdName;
	private String stdLastname;
	
	public Student() {
		
	}
	
	public Student(long stdId, String stdPrename, String stdName, String stdLastname) {
		this.stdId = stdId;
		this.stdPrename = stdPrename;
		this.stdName = stdName;
		this.stdLastname = stdLastname;
	}
	
	@Id
	@Column(name = "std_id", nullable = false)
	public long getStdId() {
		return stdId;
	}
	public void setStdId(long stdId) {
		this.stdId = stdId;
	}
	
	@Column(name = "std_prename", nullable = false)
	public String getStdPrename() {
		return stdPrename;
	}
	public void setStdPrename(String stdPrename) {
		this.stdPrename = stdPrename;
	}
	
	@Column(name = "std_name", nullable = false)
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	@Column(name = "std_lastname", nullable = false)
	public String getStdLastname() {
		return stdLastname;
	}
	public void setStdLastname(String stdLastname) {
		this.stdLastname = stdLastname;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdPrename=" + stdPrename + ", stdName=" + stdName + ", stdLastname=" + stdLastname
				+ "]";
	}

}
