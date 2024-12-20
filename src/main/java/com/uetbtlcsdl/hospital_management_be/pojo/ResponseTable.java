package com.uetbtlcsdl.hospital_management_be.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "responsetable")
public class ResponseTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="responseid" )
    private int responseId;

    @Column(name = "prescription")
    private String prescription;

    @Column(name = "detail")
    private String detail;

    @Column(name = "timestamp")
    private Date timeStamp;

    @Column(name = "hasappointment")
    private boolean hasAppointment;

    @OneToOne
    @JoinColumn(name="requesttableid")
    private com.uetbtlcsdl.hospital_management_be.pojo.RequestTable requestTableId;
}


