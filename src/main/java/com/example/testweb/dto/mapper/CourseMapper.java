package com.example.testweb.dto.mapper;

import com.example.testweb.dto.request.CourseRequest;
import com.example.testweb.dto.response.CourseResponse;
import com.example.testweb.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    Course convertToCourse(CourseRequest request);
    CourseResponse convertToResponse(Course course);
    List<CourseResponse> convertsToResponse(List<Course> list);
}
