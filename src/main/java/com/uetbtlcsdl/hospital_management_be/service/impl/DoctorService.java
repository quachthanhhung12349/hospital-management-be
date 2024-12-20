package com.uetbtlcsdl.hospital_management_be.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.uetbtlcsdl.hospital_management_be.dao.IRequestDao;
import com.uetbtlcsdl.hospital_management_be.pojo.DocResponse;
import com.uetbtlcsdl.hospital_management_be.pojo.Forum;
import com.uetbtlcsdl.hospital_management_be.pojo.RequestTable;
import com.uetbtlcsdl.hospital_management_be.service.IDoctorService;
import com.uetbtlcsdl.hospital_management_be.service.IPatientService;

@Service
public class DoctorService implements IDoctorService{


    private IRequestDao irdao;

    @Autowired
    public DoctorService(IRequestDao irdao) {
        this.irdao = irdao;
    }


    @Override
    public List<RequestTable> getRequestsByDoctorId(int doctorId) {
        return irdao.getRequestsByDoctorId(doctorId);
    }


    @Override
    public List<RequestTable> getRequestByStatus(int doctorId, boolean response) {
        return irdao.getRequestByStatus(doctorId, response);
    }


    @Override
    public void postDoctorResponse(DocResponse docResp) {
        int reqId = docResp.getRequestId();
        boolean appointment = docResp.isHasappointment();
        java.util.Date date=new java.util.Date();
        String docResponse = docResp.getDoctorresponse();
        String prescription = docResp.getPrescription();

        irdao.save(prescription, docResponse, appointment, date, true, true, reqId);
    }


}
