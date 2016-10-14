package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class PmProjectMain {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;


    private String refNo;
    private Date refDate;
    private Integer status;
    private String type;
    private String subject;
    private String methodology;
    private String activities;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;



    @ManyToOne
    @JoinColumn (name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "client_dtl_id")
    private ClientDtl clientDtl;

    @ManyToOne
    @JoinColumn (name = "client_mst_id")
    private ClientMst clientMst;

























}
