package com.example.testweb.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class CourseResponse {
    Long id;
    String className;
    String lecture;
    Date startTime;
    Date endTime;
    Long room;
    Date createdAt;
    Date updatedAt;

}
