﻿package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ResponseEntity;
import com.fasteducation.feedbackmicroservice.persistence.ResponseRepository;
import com.fasteducation.feedbackmicroservice.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ResponseServiceImpl implements ResponseService {
    private final static String ENTITY ="Response";

    @Autowired
    private ResponseRepository responseRepository;

    @Override
    public List<Response> getAll() {
        return responseRepository.findAll();
    }

    @Override
    public Response getById(int C_response_id;) {
        return responseRepository.findById(C_response_id).get();
    }

    @Override
    public Response update(int C_response_id;) {
        return null;
    }
}
