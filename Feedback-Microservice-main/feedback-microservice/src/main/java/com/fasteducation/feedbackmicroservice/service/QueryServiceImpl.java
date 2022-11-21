package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.QueryEntity;
import com.fasteducation.feedbackmicroservice.persistence.QueryRepository;
import com.fasteducation.feedbackmicroservice.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QueryServiceImpl implements QueryService {
    private final static String ENTITY ="Query";

    @Autowired
    private QueryRepository queryRepository;

    @Override
    public List<Query>> getAll() {
        return queryRepository.findAll();
    }

    @Override
    public Query getById(int C_query_id;) {
        return queryRepository.findById(C_query_id).get();
    }

    @Override
    public Query update(int C_query_id;) {
        return null;
    }

    @Override
    public String value(String D_description) {
        return null;
    }
}
