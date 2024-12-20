package com.uetbtlcsdl.hospital_management_be.service;

import java.util.List;

import com.uetbtlcsdl.hospital_management_be.pojo.Request;
import com.uetbtlcsdl.hospital_management_be.pojo.RequestTable;

public interface IPatientService {

    public List<RequestTable> getRequestsByPatientId(int patientid);

    public RequestTable savePatientRequest(Request reqTable);

}
