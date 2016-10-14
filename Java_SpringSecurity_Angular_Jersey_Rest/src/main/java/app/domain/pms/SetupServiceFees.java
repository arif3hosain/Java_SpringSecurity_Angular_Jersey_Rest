package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class SetupServiceFees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private Double amount;
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
   @JoinColumn (name = "pm_project_fees_dtl_Id")
   private PmProjectFeesDtl pmProjectFeesDtl;

}
