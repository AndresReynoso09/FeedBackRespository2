package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeacherEntity;
import com.fasteducation.feedbackmicroservice.persistence.TeacherRepository;
import com.fasteducation.feedbackmicroservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeacherServiceImpl implements TeacherService {
    private final static String ENTITY ="Teacher";

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getById(int Users_C_user_id;) {
        return teacherRepository.findById(Users_C_user_id).get();
    }

    @Override
    public Teacher update(int Users_C_user_id;) {
        return null;
    }
}
