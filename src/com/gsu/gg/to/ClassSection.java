package com.gsu.gg.to;

public class ClassSection {
	private int crn;
	private int sectionID;
	private String dayOfTheWeek;
	private String time;
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
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crn;
		result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
		result = prime * result + sectionID;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		ClassSection other = (ClassSection) obj;
		if (crn != other.crn)
			return false;
		if (dayOfTheWeek == null) {
			if (other.dayOfTheWeek != null)
				return false;
		} else if (!dayOfTheWeek.equals(other.dayOfTheWeek))
			return false;
		if (sectionID != other.sectionID)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClassSection [crn=" + crn + ", sectionID=" + sectionID + ", dayOfTheWeek=" + dayOfTheWeek + ", time="
				+ time + "]";
	}
	
}
