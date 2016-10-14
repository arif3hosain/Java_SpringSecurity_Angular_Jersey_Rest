package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Blob;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class SetupEmployee {

    private Long id;
    private String empCode;
    private String employeeTitle;
    private String employeeName;
    private Date joiningDate;
    private String stdWorkingHour;
    private String overtime;
    private String tinNo;
    private Integer createdBy;
    private Date updatedDate;
    private Integer deptId;
    private String applicationId;
    private Blob picture;
    private String updatedBy;
    private Date createdDate;
    private Integer status;
    private Integer superiorId;
    private String degcode;
    private String employeeType;
    private String bloodGroup;
    private String email;
    private String phone;
    private String address;
    private Double hourlyRate;
    private Double fixedSalary;

    @ManyToOne
    @JoinColumn (name = "com_id")
    private SetupCompany setupCompany;


























}
