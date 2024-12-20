package com.uetbtlcsdl.hospital_management_be.service.impl;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uetbtlcsdl.hospital_management_be.dao.IRequestDao;
import com.uetbtlcsdl.hospital_management_be.pojo.Doctor;
import com.uetbtlcsdl.hospital_management_be.pojo.Patient;
import com.uetbtlcsdl.hospital_management_be.pojo.Request;
import com.uetbtlcsdl.hospital_management_be.pojo.RequestTable;
import com.uetbtlcsdl.hospital_management_be.service.IPatientService;

import net.bytebuddy.asm.Advice.Local;

@Service
public class PatientService implements IPatientService{


    private IRequestDao irdao;

    @Autowired
    public PatientService(IRequestDao irdao) {
        this.irdao = irdao;
    }


    @Override
    public List<RequestTable> getRequestsByPatientId(int patientid) {

        return irdao.getRequestsByPatientId(patientid);
    }


    @Override
    public RequestTable savePatientRequest(Request req) {

        RequestTable rt = new RequestTable();
        Doctor d = new Doctor();
        Patient p = new Patient();
        p.setPatientId(req.getPatientId());
        d.setDoctorId(req.getDoctorId());
        rt.setDoctorId(d);
        rt.setProblem(req.getProblem());
        LocalDateTime ld = LocalDateTime.now();
        Timestamp today = Timestamp.valueOf(ld);
        rt.setTimeStamp(today);
        rt.setResponsed(false);
        rt.setPatientId(p);
        rt.setHasappointment(false);

        return irdao.save(rt);
    }

}
