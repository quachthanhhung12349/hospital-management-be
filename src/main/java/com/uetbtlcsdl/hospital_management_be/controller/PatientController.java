package com.uetbtlcsdl.hospital_management_be.controller;

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

import com.uetbtlcsdl.hospital_management_be.pojo.Request;
import com.uetbtlcsdl.hospital_management_be.pojo.RequestTable;
import com.uetbtlcsdl.hospital_management_be.service.IPatientService;

@RestController
public class PatientController {



    private IPatientService ips;

    @Autowired
    public PatientController(IPatientService ips) {
        this.ips = ips;
    }

    @GetMapping("/patient/{patientId}")
    @CrossOrigin
    public ResponseEntity<List<RequestTable>> getPatientRequestsById(@PathVariable int patientId){

        return new ResponseEntity<List<RequestTable>>(ips.getRequestsByPatientId(patientId), HttpStatus.OK);

    }

    @PostMapping("/patient/req")
    @CrossOrigin
    public void postPatientRequests(@RequestBody Request req){

        ips.savePatientRequest(req);

    }

}