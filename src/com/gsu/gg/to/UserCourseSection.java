package com.gsu.gg.to;

public class UserCourseSection {
	private String userID;
	private int crn;
	private int sectionID;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
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
		UserCourseSection other = (UserCourseSection) obj;
		if (crn != other.crn)
			return false;
		if (sectionID != other.sectionID)
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserCourseSection [userID=" + userID + ", crn=" + crn + ", sectionID=" + sectionID + "]";
	}
	
}
