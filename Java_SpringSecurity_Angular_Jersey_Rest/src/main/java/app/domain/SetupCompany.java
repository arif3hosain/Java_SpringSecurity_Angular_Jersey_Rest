package app.domain;

import app.entity.*;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by arifhosain on 10/14/16.
 */
@Entity
@Table(name = "setup_company")
public class SetupCompany implements app.entity.Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "ccode", length = 10, nullable = true)
    private String ccode;

    @Column (name = "name", length = 50, nullable = true)
    private String name;

    @Column (name = "add1", length = 100, nullable = true)
    private String add1;

    @Column (name = "add2", length =100, nullable = true)
    private String add2;

    @Column (name = "phone1", length = 30, nullable = true)
    private String phone1;

    @Column (name = "phone2", length = 30, nullable = true)
    private String phone2;

    @Column (name = "fax", length = 30, nullable = true)
    private String fax;

    @Column (name = "email", length = 30, nullable = true)
    private String email;

    @Column (name = "vatno1", length = 50, nullable = true)
    private String vatno1;

    @Column (name = "web", length = 50, nullable = true)
    private String web;

    @Column (name = "tin", length = 30, nullable = true)
    private String tin;

    @Column (name = "csymbol", length = 10, nullable = true)
    private String csymbol;

    @Column (name = "secuse", length = 3, nullable = true)
    private String secuse;

    @Column (name = "bcsymbol", length = 10, nullable = true)
    private String bcsymbol;

    @Column (name = "cfname", length = 10, nullable = true)
    private String cfname;

    @Column (name = "status", nullable = true)
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVatno1() {
        return vatno1;
    }

    public void setVatno1(String vatno1) {
        this.vatno1 = vatno1;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getCsymbol() {
        return csymbol;
    }

    public void setCsymbol(String csymbol) {
        this.csymbol = csymbol;
    }

    public String getSecuse() {
        return secuse;
    }

    public void setSecuse(String secuse) {
        this.secuse = secuse;
    }

    public String getBcsymbol() {
        return bcsymbol;
    }

    public void setBcsymbol(String bcsymbol) {
        this.bcsymbol = bcsymbol;
    }

    public String getCfname() {
        return cfname;
    }

    public void setCfname(String cfname) {
        this.cfname = cfname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
