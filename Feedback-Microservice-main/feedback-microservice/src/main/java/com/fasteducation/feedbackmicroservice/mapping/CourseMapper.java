package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;
import com.fasteducation.feedbackmicroservice.resource.CourseResource;
import com.fasteducation.feedbackmicroservice.resource.CreateCourseResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateCourseResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public CourseResource toResource(Course model){
        return mapper.map(model, CourseResource.class);
    }

    public Course toModel(CreateCourseResource resource){
        return mapper.map(resource, Course.class);
    }

    public Course toModel(CourseResource resource){
        return mapper.map(resource, Course.class);
    }

    public Course toModel(UpdateCourseResource resource){
        return mapper.map(resource, Course.class);
    }
}
