package com.uetbtlcsdl.hospital_management_be.service.impl;

import com.uetbtlcsdl.hospital_management_be.dao.IForumDao;
import com.uetbtlcsdl.hospital_management_be.dao.IMessageDao;
import com.uetbtlcsdl.hospital_management_be.pojo.Forum;
import com.uetbtlcsdl.hospital_management_be.pojo.Message;
import com.uetbtlcsdl.hospital_management_be.service.IForumService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumService implements IForumService {


    @Autowired
    private IForumDao forumDao;

    @Autowired
    private IMessageDao iMessageDao;

    @Override
    public List<Message> getMessages() {
        return iMessageDao.findAll();
    }

    @Override
    public Message saveMessage(Message message) {
        return iMessageDao.save(message);
    }

    @Override
    public List<Forum> getForums() {
        return forumDao.findAll();
    }

    @Override
    public Forum saveForum(Forum forum) {
        return forumDao.save(forum);
    }

    @Override
    public Forum getForumById(int forumId) {
        return forumDao.findById(forumId).get();
    }

    @Override
    public List<Message> getMessagesByForumId(int forumId) {

        return iMessageDao.getMessageByForumId(forumId);
    }
}


