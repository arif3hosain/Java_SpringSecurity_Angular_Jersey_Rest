package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class SetupWorkStatus {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String wsCode;
    private String wsName;
    private Double convRate;
    private String location;
    private Integer status;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;

    @ManyToOne
    @JoinColumn(name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "emp_work_status_id")
    private EmpWorkStatus empWorkStatus;
}
