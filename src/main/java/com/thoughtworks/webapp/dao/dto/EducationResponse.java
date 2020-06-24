package com.thoughtworks.webapp.dao.dto;

import com.thoughtworks.webapp.dao.Education;
import com.thoughtworks.webapp.dao.User;

import java.util.ArrayList;

public class EducationResponse {

    private long userId;
    private long year;
    private String title;
    private String description;

    public EducationResponse() {
    }

    public EducationResponse(long userId, long year, String title, String description) {
        this.userId = userId;
        this.year = year;
        this.title = title;
        this.description = description;
    }

    public static ArrayList<EducationResponse> toEducation(ArrayList<Education> educationArrayList) {
         ArrayList<EducationResponse> educationResponses = new ArrayList<>();
         EducationResponse educationResponse = new EducationResponse();
        for (Education arrayList: educationArrayList) {
            educationResponse.setUserId(arrayList.getUserId());
            educationResponse.setYear(arrayList.getYear());
            educationResponse.setTitle(arrayList.getTitle());
            educationResponse.setDescription(arrayList.getDescription());

            educationResponses.add(educationResponse);
        }
        return educationResponses;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
