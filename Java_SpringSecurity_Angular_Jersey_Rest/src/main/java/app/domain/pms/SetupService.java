package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class SetupService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer code;
    private String name;
    private String description;
    private Long parentId;
    private Long coa_id;
    private Integer status;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;


    @ManyToOne
    @JoinColumn(name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "pm_project_job_dtl_id")
    private PmProjectJobDtl pmProjectJobDtl;
}
