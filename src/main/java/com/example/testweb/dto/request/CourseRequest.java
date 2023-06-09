package com.example.testweb.dto.request;

import com.example.testweb.dto.Validator.ClassName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class CourseRequest {
    @ClassName
    String className;
    String lecture;
    Date startTime;
    Date endTime;
    Long room;
    Date createdAt;
    Date updatedAt;
}
