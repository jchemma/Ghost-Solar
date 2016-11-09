package com.gsu.gg.to;

public class TeacherClassSection {
	private String StudentID;
	private int crn;
	private int sectionID;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
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
		result = prime * result + ((StudentID == null) ? 0 : StudentID.hashCode());
		result = prime * result + crn;
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
		TeacherClassSection other = (TeacherClassSection) obj;
		if (StudentID == null) {
			if (other.StudentID != null)
				return false;
		} else if (!StudentID.equals(other.StudentID))
			return false;
		if (crn != other.crn)
			return false;
		if (sectionID != other.sectionID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TeacherClassSection [StudentID=" + StudentID + ", crn=" + crn + ", sectionID=" + sectionID + "]";
	}
	
}
