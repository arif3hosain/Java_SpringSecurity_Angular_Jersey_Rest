package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class PmProjectTeamDtl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date jobStartDate;
    private Date endDate;
    private Double hourlyRate;
    private Integer expectedHour;
    private Integer status;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;


    @ManyToOne
    @JoinColumn(name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "project_job_dtl_id")
    private PmProjectJobDtl pmProjectJobDtl;

    @ManyToOne
    @JoinColumn (name = "role_id")
    private SetupProjectRole setupProjectRole;

    @ManyToOne
    @JoinColumn (name = "emp_id")
    private SetupEmployee setupEmployee;
}
