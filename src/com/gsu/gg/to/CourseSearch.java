/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.gg.to;

/**
 *
 * @author jchemma
 */
public class CourseSearch {
    
    private String degree;
    private String subject;
    private String courseNumber;
    private String title;
    private String credits;
    //private String campus;
    private String partOfTerm;
    private String instructor;
    private String courseType;
    private String hourStart;
    private String hourEnd;
    private String minuteStart;
    private String minuteEnd;
    private String ampmStart;
    private String ampmEnd;
    private String days;
    
    public CourseSearch(String degree, String subject, String courseNumber,
            String title, String credits, String partOfTerm, String instructor,
            String courseType, String hourStart, String hourEnd, String minuteStart,
            String minuteEnd, String ampmStart, String ampmEnd, String days){
        this.degree = degree;
        this.subject = subject;
        this.courseNumber = courseNumber;
        this.title = title;
        this.credits = credits;
        this.partOfTerm = partOfTerm;
        this.instructor = instructor;
        this.courseType = courseType;
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.minuteStart = minuteStart;
        this.minuteEnd = minuteEnd;
        this.ampmStart = ampmStart;
        this.ampmEnd = ampmEnd;
        this.days = days;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getPartOfTerm() {
        return partOfTerm;
    }

    public void setPartOfTerm(String partOfTerm) {
        this.partOfTerm = partOfTerm;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getHourStart() {
        return hourStart;
    }

    public void setHourStart(String hourStart) {
        this.hourStart = hourStart;
    }

    public String getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
    }

    public String getMinuteStart() {
        return minuteStart;
    }

    public void setMinuteStart(String minuteStart) {
        this.minuteStart = minuteStart;
    }

    public String getMinuteEnd() {
        return minuteEnd;
    }

    public void setMinuteEnd(String minuteEnd) {
        this.minuteEnd = minuteEnd;
    }

    public String getAmpmStart() {
        return ampmStart;
    }

    public void setAmpmStart(String ampmStart) {
        this.ampmStart = ampmStart;
    }

    public String getAmpmEnd() {
        return ampmEnd;
    }

    public void setAmpmEnd(String ampmEnd) {
        this.ampmEnd = ampmEnd;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
    
    
}
