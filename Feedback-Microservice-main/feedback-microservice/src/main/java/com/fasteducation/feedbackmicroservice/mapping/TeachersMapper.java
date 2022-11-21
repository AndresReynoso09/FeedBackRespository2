package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeacherEntity;
import com.fasteducation.feedbackmicroservice.resource.TeacherResource;
import com.fasteducation.feedbackmicroservice.resource.CreateTeacherResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateTeacherResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
    @Autowired
    private EnhancedModelMapper mapper;

    public TeacherResource toResource(Teacher model){
        return mapper.map(model, TeacherResource.class);
    }

    public Teacher toModel(CreateTeacherResource resource){
        return mapper.map(resource, Teacher.class);
    }

    public Teacher toModel(TeacherResource resource){
        return mapper.map(resource, Teacher.class);
    }

    public Teacher toModel(UpdateTeacherResource resource){
        return mapper.map(resource, Teacher.class);
    }
}
