package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.StudentEntity;
import com.fasteducation.feedbackmicroservice.resource.StudentResource;
import com.fasteducation.feedbackmicroservice.resource.CreateStudentResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateStudentResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private EnhancedModelMapper mapper;

    public StudentResource toResource(Student model){
        return mapper.map(model, StudentResource.class);
    }

    public Student toModel(CreateStudentResource resource){
        return mapper.map(resource, Student.class);
    }

    public Student toModel(StudentResource resource){
        return mapper.map(resource, Student.class);
    }

    public Student toModel(UpdateStudentResource resource){
        return mapper.map(resource, Student.class);
    }
}
