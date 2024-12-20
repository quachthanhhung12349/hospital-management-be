package com.uetbtlcsdl.hospital_management_be.service;

import java.util.List;

import com.uetbtlcsdl.hospital_management_be.pojo.Admin;
import com.uetbtlcsdl.hospital_management_be.pojo.Doctor;
import com.uetbtlcsdl.hospital_management_be.pojo.Patient;
import com.uetbtlcsdl.hospital_management_be.pojo.User;

public interface IAuthService {

    Doctor registerDoctorService(Doctor doctor);

    Patient registerPatientService(Patient patient);

    Doctor loginDoctorService(User user);

    Patient loginPatientService(User user);

    List<Patient> getPatients();

    List<Doctor> getDoctors();

    Admin loginAdminService(User user);

    Admin registerAdminService(Admin admin);


    int updateDoctorService(int doctorId, String status);


}
