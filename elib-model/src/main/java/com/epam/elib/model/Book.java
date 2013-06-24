package com.epam.elib.model;

import com.epam.elib.model.base.BaseEntity;

public class Book extends BaseEntity {
	
	private Long id;
	
	private String direction;
	
	private String name;
	
	private Boolean availability;
	
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}
	
}
