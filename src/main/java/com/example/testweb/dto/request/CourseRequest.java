package com.example.testweb.dto.request;

import com.example.testweb.dto.Validator.ClassName;
import lombok.Data;

@Data
public class CourseRequest {
    @ClassName
    String className;
}
