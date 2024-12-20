package com.uetbtlcsdl.hospital_management_be.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uetbtlcsdl.hospital_management_be.pojo.Admin;

public interface IAuthAdminDao extends JpaRepository<Admin, Integer>{

    @Query(value = "select a from Admin a where a.username=?1 and a.password=?2")
    Admin findAdminbyUsername(String username, String password);

}
