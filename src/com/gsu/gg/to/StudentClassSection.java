package com.gsu.gg.to;

public class StudentClassSection {
	private String studentID;
	private int crn;
	private int sectionID;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getCrn() {
		return crn;
	}
	public void setCrn(int crn) {
		this.crn = crn;
	}
	public int getSectionID() {
		return sectionID;
	}
	public void setSectionID(int sectionID) {
		this.sectionID = sectionID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crn;
		result = prime * result + sectionID;
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
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
		StudentClassSection other = (StudentClassSection) obj;
		if (crn != other.crn)
			return false;
		if (sectionID != other.sectionID)
			return false;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentClassSection [studentID=" + studentID + ", crn=" + crn + ", sectionID=" + sectionID + "]";
	}
	
}
