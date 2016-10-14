package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;

/**
 * Created by arifhosain on 10/14/16.
 */
public class ClientDtl {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String contactPerson;
    private String addressType;
    private String addressLine1;
    private String address_line2;
    private String custVatChalCode;
    private String custVatRegNo;
    private String phoneNumber;
    private String email;
    private String officePhone;

    @ManyToOne
    @JoinColumn (name = "com_id")
    private SetupCompany setupCompany;

    @ManyToOne
    @JoinColumn (name = "client_mst_id")
    private ClientDtl clientDtl;











}
