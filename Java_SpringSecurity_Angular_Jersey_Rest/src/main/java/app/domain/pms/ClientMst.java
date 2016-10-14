package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class ClientMst {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String website;
    private String industryName;
    private String clientType;
    private Date createdDate;
    private Date updatedDate;
    private Integer createdBy;
    private Integer updatedBy;
    private String custVatChalCode;
    private String custVatRegNo;
    private String country;


    @ManyToOne
    @JoinColumn (name = "com_id")
    private SetupCompany setupCompany;
























}
