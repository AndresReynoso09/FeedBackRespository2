package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.QueryEntity;
import com.fasteducation.feedbackmicroservice.resource.QueryResource;
import com.fasteducation.feedbackmicroservice.resource.CreateQueryResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateQueryResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Query {
    @Autowired
    private EnhancedModelMapper mapper;

    public QueryResource toResource(Query model){
        return mapper.map(model, QueryResource.class);
    }

    public Query toModel(CreateQueryResource resource){
        return mapper.map(resource, Query.class);
    }

    public Query toModel(QueryResource resource){
        return mapper.map(resource, Query.class);
    }

    public Query toModel(UpdateQueryResource resource){
        return mapper.map(resource, Query.class);
    }
}
