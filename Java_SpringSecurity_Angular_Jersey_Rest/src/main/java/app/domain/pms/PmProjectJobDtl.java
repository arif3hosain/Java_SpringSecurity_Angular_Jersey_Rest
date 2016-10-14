package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class PmProjectJobDtl {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private  Long id;
    private Integer jobId;
    private Date effectiveDate;
    private Date estimatedDeadline;
    private Integer jobAllocateStatus;
    private Integer jobAlcateBy;
    private Date jobAlctDate;
    private Integer jobAlcateAprvBy;
    private Date jobAlctAprvDate;
    private Integer completeStatus;
    private Date completeDate;
    private Integer completeBy;
    private Integer completeAprvStatus;
    private String completeAprvNote;
    private Date completeAprvDate;
    private Integer completeAprvBy;
    private String taxAssignmentLevel;
    private String incomeYear;
    private String assessmentYear;
    private String jobAlctReviewNote;
    private Date jobForTheMonth;
    private String reportingStatus;
    private String remarks;
    private Integer invoiceStatus;
    private Integer status;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;

    @ManyToOne
    @JoinColumn (name="com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "project_job_mst_id")
    private  PmProjectJobMst pmProjectJobMst;
















































}
