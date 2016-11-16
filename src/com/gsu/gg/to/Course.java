package com.gsu.gg.to;

public class Course {
	private int crn; 
	private String name;
	private int creditHours;
	private String description;
	private Course[] prerequisites;
	
	public Course(int crn){
		this.crn = crn;
		
	}
	
	public Course(int crn, String name, int creditHours, String description, Course[] prerequsites){
		this.crn = crn;
		this.name = name;
		this.creditHours = creditHours;
		this.description = description;
		this.prerequisites = prerequisites;
	}

	public int getCrn() {
		return crn;
	}
	public void setCrn(int crn) {
		this.crn = crn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Course[] getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(Course[] prerequisites) {
		this.prerequisites = prerequisites;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creditHours;
		result = prime * result + crn;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((prerequisites == null) ? 0 : prerequisites.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (creditHours != other.creditHours)
			return false;
		if (crn != other.crn)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prerequisites == null) {
			if (other.prerequisites != null)
				return false;
		} else if (!prerequisites.equals(other.prerequisites))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [crn=" + crn + ", name=" + name + ", creditHours=" + creditHours + ", description=" + description
				+ ", prerequisites=" + prerequisites + "]";
	}
	
	
	
}
