package com.thoughtworks.webapp.dao.dto;

import com.thoughtworks.webapp.dao.Education;

public class EducationRequest {

    private long year;
    private String title;
    private String description;

    public EducationRequest(long year, String title, String description) {
        this.year = year;
        this.title = title;
        this.description = description;
    }

    public Education toEducation() {
        Education education = new Education();
        education.setYear(this.getYear());
        education.setTitle(this.getTitle());
        education.setDescription(this.description);

        return education;
    }
    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
