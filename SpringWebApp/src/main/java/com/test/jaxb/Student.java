package com.test.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private Integer sno;
	private String sname;
	private String course;

	public Student(Integer sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + "]";
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
