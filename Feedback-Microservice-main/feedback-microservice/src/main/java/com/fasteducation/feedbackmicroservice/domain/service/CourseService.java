package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;

import java.util.List;

public interface CourseService {
    List<CourseEntity> getAll();

    CourseEntity getById(int C_course_id;;

    CourseEntity update(int C_course_id;);
}