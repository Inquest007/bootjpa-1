package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String aname;
	private int salary;
	

	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", salary=" + salary + "]";
	}
	
	
}
