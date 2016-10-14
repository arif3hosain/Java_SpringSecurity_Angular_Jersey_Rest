package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class PmProjectJobMst {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;


    private  Integer status;
    private String completeStatus;
    private String completeNote;
    private Date completeDate;
    private Integer completeBy;
    private String aprvStatus;
    private Date aprvDate;
    private Integer asgnaprvBy;
    private String aprvNote;
    private String invoiceStatus;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;

    @ManyToOne
    @JoinColumn (name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "pm_project_main_id")
    private PmProjectMain pmProjectMain;



























}
