package com.greatlearing.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String departmentName;
   
public Employee(String firstName, String lastName, String departmentName ) {
	this.setFirstName(firstName);
	this.setLastName(lastName);
	this.setDepartmentName(departmentName);


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

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
    
}

