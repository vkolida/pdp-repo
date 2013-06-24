package com.epam.elib.model;

import java.util.List;

import com.epam.elib.model.base.BaseEntity;

public class Employee extends BaseEntity {
	
	private Long employeeID;
	
	private String firstName;
	
	private String lastName;
	
	private List<Book> books;

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String secondName) {
		this.lastName = secondName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
