package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ResponseEntity;
import com.fasteducation.feedbackmicroservice.resource.ResponseResource;
import com.fasteducation.feedbackmicroservice.resource.CreateResponseResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateResponseResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Response{
    @Autowired
    private EnhancedModelMapper mapper;

    public ResponseResource toResource(Response model){
        return mapper.map(model, ResponseResource.class);
    }

    public Response toModel(CreateResponseResource resource){
        return mapper.map(resource, Response.class);
    }

    public Response toModel(ResponseResource resource){
        return mapper.map(resource, Response.class);
    }

    public Response toModel(UpdateResponseResource resource){
        return mapper.map(resource, Response.class);
    }
}
