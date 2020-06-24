package com.thoughtworks.webapp.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {

    private long userId;
    private long year;
    private String title;
    private String description;
}
