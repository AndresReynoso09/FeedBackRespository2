package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeacherEntity;

import java.util.List;

public interface TeacherService {
    List<TeacherEntity> getAll();

    TeacherEntity getById(int Users_C_user_id;;

    TeacherEntity update(int Users_C_user_id;);
}