package com.example.testweb.service;

import com.example.testweb.dto.mapper.CourseMapper;
import com.example.testweb.dto.request.CourseRequest;
import com.example.testweb.model.Course;
import com.example.testweb.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository repository;
    private final CourseMapper mapper;

    public Course create(CourseRequest request) {
        Course course = mapper.convertToCourse(request);
        repository.save(course);
        return course;
    }
}
