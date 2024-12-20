package com.uetbtlcsdl.hospital_management_be.service;

import com.uetbtlcsdl.hospital_management_be.pojo.Forum;
import com.uetbtlcsdl.hospital_management_be.pojo.Message;

import java.util.List;

public interface IForumService {

    List<Message> getMessages();

    Message saveMessage(Message message);

    List<Forum> getForums();

    Forum saveForum(Forum forum);

    Forum getForumById(int forumId);

    List<Message> getMessagesByForumId(int forumId);
}
