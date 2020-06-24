package com.thoughtworks.webapp.controller;

import com.thoughtworks.webapp.dao.Education;
import com.thoughtworks.webapp.dao.dto.EducationRequest;
import com.thoughtworks.webapp.dao.dto.EducationResponse;
import com.thoughtworks.webapp.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EducationController {

    @Autowired
    private EducationService educationService;

    @GetMapping("/users/{userId}/educations")
    public ResponseEntity<ArrayList<EducationResponse>> getEduction(@PathVariable Integer userId) {
        ArrayList<EducationResponse> educationResponses = EducationResponse.toEducation(educationService.getEducation(userId));

        return ResponseEntity.ok().body(educationResponses);
    }

    @PostMapping("/users/{userId}/educations")
    public ResponseEntity<EducationRequest> createEducation(@PathVariable Integer userId, @RequestBody EducationRequest educationRequest) {
        Education education = educationRequest.toEducation();
        educationService.createEducation(userId, education);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
