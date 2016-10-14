package app.domain;

import javax.persistence.*;

/**
 * Created by arifhosain on 10/14/16.
 */
@Entity
@Table (name = "ums_role_dtl")
public class UmsRoleDtl implements app.entity.Entity{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "role_mst_id")
    private UmsRoleMst umsRoleMst;

    @ManyToOne
    @JoinColumn (name = "menu_id")
    private UmsMenuMain umsMenuMain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UmsRoleMst getUmsRoleMst() {
        return umsRoleMst;
    }

    public void setUmsRoleMst(UmsRoleMst umsRoleMst) {
        this.umsRoleMst = umsRoleMst;
    }

    public UmsMenuMain getUmsMenuMain() {
        return umsMenuMain;
    }

    public void setUmsMenuMain(UmsMenuMain umsMenuMain) {
        this.umsMenuMain = umsMenuMain;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
