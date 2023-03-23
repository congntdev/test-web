package com.example.testweb.controller;

import com.example.testweb.dto.mapper.CourseMapper;
import com.example.testweb.dto.request.CourseRequest;
import com.example.testweb.dto.response.CourseResponse;
import com.example.testweb.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseService service;
    private final CourseMapper mapper;

    @PostMapping
    public ResponseEntity<CourseResponse> create(@Valid @RequestBody CourseRequest request) {
        return ResponseEntity.ok(mapper.convertToResponse(service.create(request)));
    }
}
