package com.iiht.training.skills.entity;


public class Skills {


	private Integer id;
	private Integer employeeId;
	private String name;
	private String description;
	private String profeciencyLevel;
	private String yearsOfExperience;
	
	private String environment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfeciencyLevel() {
		return profeciencyLevel;
	}

	public void setProfeciencyLevel(String profeciencyLevel) {
		this.profeciencyLevel = profeciencyLevel;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	

} 
