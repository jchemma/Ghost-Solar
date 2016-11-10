package com.gsu.gg.to;

public class Course {
	private int crn; 
	private String name;
	private int creditHours;
	private String description;
	private String prequistes;
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
	public String getPrequistes() {
		return prequistes;
	}
	public void setPrequistes(String prequistes) {
		this.prequistes = prequistes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creditHours;
		result = prime * result + crn;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((prequistes == null) ? 0 : prequistes.hashCode());
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
		if (prequistes == null) {
			if (other.prequistes != null)
				return false;
		} else if (!prequistes.equals(other.prequistes))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Class [crn=" + crn + ", name=" + name + ", creditHours=" + creditHours + ", description=" + description
				+ ", prequistes=" + prequistes + "]";
	} 

	
}
