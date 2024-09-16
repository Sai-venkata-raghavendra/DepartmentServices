package com.raghavendera.project.SpringBootProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Entitys {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private int age;
	
	private String city;
	
	private int salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Entitys(long id, String name, int age, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}

	public Entitys() {
		
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}
	
	

}
