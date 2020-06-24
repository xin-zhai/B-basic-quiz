package com.thoughtworks.webapp.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResult {

    private String message;
    private Integer status;
    private String error;
    private String timestamp;

}
