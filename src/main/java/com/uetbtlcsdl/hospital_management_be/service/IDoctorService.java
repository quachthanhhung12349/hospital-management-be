package com.uetbtlcsdl.hospital_management_be.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.uetbtlcsdl.hospital_management_be.pojo.DocResponse;
import com.uetbtlcsdl.hospital_management_be.pojo.Patient;
import com.uetbtlcsdl.hospital_management_be.pojo.RequestTable;
import com.uetbtlcsdl.hospital_management_be.pojo.User;

public interface IDoctorService {

    public List<RequestTable> getRequestsByDoctorId(int doctorId);

    public List<RequestTable> getRequestByStatus(int doctorId, boolean status);

    void postDoctorResponse(DocResponse docResp);


}
