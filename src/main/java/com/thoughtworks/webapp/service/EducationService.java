package com.thoughtworks.webapp.service;

import com.thoughtworks.webapp.dao.Education;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class EducationService {

    private Map<Integer, Education> educationMap = new HashMap<>();

    public EducationService() {
        educationMap.put(1, new Education(1, 2020, "test", "pass"));
    }

    public ArrayList<Education> getEducation(Integer id) {
        ArrayList<Education> educationList = new ArrayList<>();
        for(Map.Entry<Integer, Education> entry : educationMap.entrySet()) {
            if(entry.getValue().getUserId() == id) {
                educationList.add(entry.getValue());
            }
        }
        return educationList;
    }

    public void createEducation(Integer id, Education education) {
        education.setUserId(id);
        educationMap.put(educationMap.size()+1, education);
    }

}
