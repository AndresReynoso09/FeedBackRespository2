package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ForumEntity;
import com.fasteducation.feedbackmicroservice.resource.ForumResource;
import com.fasteducation.feedbackmicroservice.resource.CreateForumResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateForumResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Forum {
    @Autowired
    private EnhancedModelMapper mapper;

    public ForumResource toResource(Forum model){
        return mapper.map(model, ForumResource.class);
    }

    public Forum toModel(CreateForumResource resource){
        return mapper.map(resource, Forum.class);
    }

    public Forum toModel(ForumResource resource){
        return mapper.map(resource, Forum.class);
    }

    public Forum toModel(UpdateForumResource resource){
        return mapper.map(resource, Forum.class);
    }
}
