package com.uetbtlcsdl.hospital_management_be.dao;

import com.uetbtlcsdl.hospital_management_be.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IMessageDao extends JpaRepository<Message,Integer> {

    @Query(value = "select m from Message m left join Forum f on m.forumId = f.forumId where f.forumId=?1")
    public List<Message> getMessageByForumId(int forumId);
}
