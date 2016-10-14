package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class PmProjectFeesDtl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long feesId;
    private Double amount;
    private String remarks;
    private Integer status;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;


    @ManyToOne
    @JoinColumn(name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "project_job_mst_id")
    private PmProjectJobDtl pmProjectJobDtl;

    @ManyToOne
    @JoinColumn (name = "currency_id")
    private SetupCurrency setupCurrency;


}
