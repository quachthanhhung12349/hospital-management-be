package com.uetbtlcsdl.hospital_management_be.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uetbtlcsdl.hospital_management_be.pojo.DocResponse;
import com.uetbtlcsdl.hospital_management_be.pojo.Doctor;
import com.uetbtlcsdl.hospital_management_be.pojo.Message;
import com.uetbtlcsdl.hospital_management_be.pojo.Patient;
import com.uetbtlcsdl.hospital_management_be.pojo.RequestTable;
import com.uetbtlcsdl.hospital_management_be.service.IDoctorService;
import com.uetbtlcsdl.hospital_management_be.service.IPatientService;

@RestController

public class DoctorController {



    //private IPatientService ips;
    private IDoctorService ids;

    @Autowired
    public DoctorController(IDoctorService ids) {
        this.ids = ids;
    }

    @GetMapping("/doctor/{doctorId}")
    @CrossOrigin
    public ResponseEntity<List<RequestTable>> getPatientRequestsById(@PathVariable int doctorId){
        System.out.println("called doctor servlet");
        return new ResponseEntity<List<RequestTable>>(ids.getRequestsByDoctorId(doctorId), HttpStatus.OK);

    }

    @GetMapping("/pendingRequest/{doctorId}")
    @CrossOrigin
    public ResponseEntity<List<RequestTable>> getPendingRequestsById(@PathVariable int doctorId){
        System.out.println("called doctor servlet - getPendingRequestsById");
        return new ResponseEntity<List<RequestTable>>(ids.getRequestByStatus(doctorId, false), HttpStatus.OK);

    }

    @GetMapping("/resolvedRequest/{doctorId}")
    @CrossOrigin
    public ResponseEntity<List<RequestTable>> getResolvedRequestsById(@PathVariable int doctorId){
        System.out.println("called doctor servlet - getResolvedRequestsById");
        return new ResponseEntity<List<RequestTable>>(ids.getRequestByStatus(doctorId, true), HttpStatus.OK);

    }

    @PostMapping("/doctor")
    @CrossOrigin
    public void postDoctorResponse(@RequestBody DocResponse docResp){
        ids.postDoctorResponse(docResp);

    }


}
