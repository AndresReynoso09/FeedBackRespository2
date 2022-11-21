package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ForumEntity;
import com.fasteducation.feedbackmicroservice.persistence.ForumRepository;
import com.fasteducation.feedbackmicroservice.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ForumServiceImpl implements ForumService {
    private final static String ENTITY ="Forum";

    @Autowired
    private ForumRepository forumRepository;

    @Override
    public List<Forum> getAll() {
        return forumRepository.findAll();
    }

    @Override
    public Forum getById(int C_forum_id;) {
        return forumRepository.findById(C_forum_id).get();
    }

    @Override
    public Forum update(int C_forum_id;) {
        return null;
    }

    @Override
    public String value(String D_description) {
        return null;
    }
}
