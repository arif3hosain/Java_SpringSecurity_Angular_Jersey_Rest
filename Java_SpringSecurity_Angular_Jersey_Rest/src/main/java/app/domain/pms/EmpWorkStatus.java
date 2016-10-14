package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class EmpWorkStatus {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private  Long id;

    private Date entryDate;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;
    private Long jobId;
    private Long clientId;
    private Date startTime;
    private Date endTime;
    private Integer hrs_Worked;
    private Integer ws_Id;
    private String mot;
    private Double convRate;
    private String remarks;
    private String jslCode;
    private String aprvStatus;
    private Integer reviewBy;
    private Date reviewDate;


    @ManyToOne
    @JoinColumn (name = "emp_id")
    private  SetupEmployee setupEmployee;

    @ManyToOne
    @JoinColumn (name="com_id")
    private SetupCompany setupCompany;


}
