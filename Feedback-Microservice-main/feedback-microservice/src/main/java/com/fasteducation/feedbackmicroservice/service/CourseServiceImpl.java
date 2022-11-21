package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;
import com.fasteducation.feedbackmicroservice.persistence.CourseRepository;
import com.fasteducation.feedbackmicroservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseServiceImpl implements CourseService {
    private final static String ENTITY ="Course";

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getById(int C_course_id;) {
        return courseRepository.findById(C_course_id).get();
    }

    @Override
    public Course update(int C_course_id;) {
        return null;
    }

    @Override
    public String value(String D_name) {
        return null;
    }
}
