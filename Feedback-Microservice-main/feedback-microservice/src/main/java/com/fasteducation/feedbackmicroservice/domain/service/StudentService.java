package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAll();

    StudentEntity getById(int Users_C_user_id;;

    StudentEntity update(int Users_C_user_id;);
}