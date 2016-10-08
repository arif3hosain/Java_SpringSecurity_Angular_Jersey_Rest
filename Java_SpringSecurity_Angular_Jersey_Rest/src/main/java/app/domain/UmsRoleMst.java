package app.domain;

import app.entity.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by arifhosain on 9/27/16.
 */
@Entity
@Table(name = "ums_role_mst")
public class UmsRoleMst implements app.entity.Entity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column (name = "role_name", length = 20, nullable = false, insertable = false, updatable = false)
    private String role_Name;

    @Column (name = "role_desc", length = 200, nullable = true)
    private String roleDesc;

    @NotNull
    @Column (name = "status", nullable = false)
    private String status;

    @Column (name = "create_by", length = 10, nullable = true)
    private String createBy;

    @Column (name = "create_date", nullable = true)
    private Date createDate;

    public UmsRoleMst(Long id, String role_Name, String status) {
        this.id = id;
        this.role_Name = role_Name;
        this.status = status;
    }

    public UmsRoleMst() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole_Name() {
        return role_Name;
    }

    public void setRole_Name(String role_Name) {
        this.role_Name = role_Name;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "UmsRoleMst{ id"+id+", role "+role_Name+",desc="+roleDesc+", status= "+status+", createdBy="+createBy+
                ", create date ="+createDate;
    }
}