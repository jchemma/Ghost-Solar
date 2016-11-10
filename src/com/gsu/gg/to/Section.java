package com.gsu.gg.to;

public class Section {
	private int sectionID;
	private int capacity;
	private String location;
	private String instructor;
	public int getSectionID() {
		return sectionID;
	}
	public void setSectionID(int sectionID) {
		this.sectionID = sectionID;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + sectionID;
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
		Section other = (Section) obj;
		if (capacity != other.capacity)
			return false;
		if (instructor == null) {
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (sectionID != other.sectionID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sections [sectionID=" + sectionID + ", capacity=" + capacity + ", location=" + location
				+ ", instructor=" + instructor + "]";
	}

}
