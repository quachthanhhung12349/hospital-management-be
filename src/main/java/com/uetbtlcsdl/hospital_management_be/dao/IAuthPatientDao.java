package com.uetbtlcsdl.hospital_management_be.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uetbtlcsdl.hospital_management_be.pojo.Patient;

public interface IAuthPatientDao extends JpaRepository<Patient, Integer>{

    @Query(value = "select p from Patient p where p.username=?1 and p.password=?2")
    Patient findPatientbyUsername(String username, String password);
}
