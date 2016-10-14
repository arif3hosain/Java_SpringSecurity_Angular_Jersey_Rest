package app.domain.pms;

import app.domain.SetupCompany;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
public class SetupProjectRole {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;


    private String name;
    private String description;
    private Date createdDate;
    private Integer createdBy;
    private Date updatedDate;
    private Integer updatedBy;

    @ManyToOne
    @JoinColumn (name = "com_id")
    private SetupCompany setupCompany;
}
