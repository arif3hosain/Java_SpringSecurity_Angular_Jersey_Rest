package app.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arifhosain on 10/14/16.
 */
@Entity
@Table(name = "ums_user_com_assign")
public class UmsUserComAssign implements app.entity.Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "created_date",  nullable = true)
    private Date createdDate;

    @Column (name = "created_by",  nullable = true)
    private Integer createdBy;

    @Column (name = "updated_date",  nullable = true)
    private Date updatedDate;

    @Column (name = "update_by",  nullable = true)
    private Integer updatedBy;

    @Column (name = "status",  nullable = true)
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "setup_company_id",nullable = true)
    private  SetupCompany setupCompany;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SetupCompany getSetupCompany() {
        return setupCompany;
    }

    public void setSetupCompany(SetupCompany setupCompany) {
        this.setupCompany = setupCompany;
    }
}
