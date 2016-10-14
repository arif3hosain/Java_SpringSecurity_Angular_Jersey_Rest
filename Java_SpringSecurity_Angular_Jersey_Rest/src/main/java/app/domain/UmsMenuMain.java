package app.domain;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by arifhosain on 10/14/16.
 */
@Entity
@Table(name = "ums_menu_main")
public class UmsMenuMain implements app.entity.Entity{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "menu_name", length = 100, nullable = true)
    private String menuName;

    @Column (name = "menu_type", length = 10, nullable = true)
    private String menuType;

    @Column (name = "run_file_name", length = 100, nullable = true)
    private String runFileName;

    @Column (name = "menu_sl",  nullable = true)
    private Integer menuSl;

    @Column (name = "parent_id", nullable = true)
    private Integer parentId;

    @Column (name = "status", length = 2, nullable = true)
    private String status;

    @Column (name = "home_dir", length = 200, nullable = true)
    private String homeDir;

    @Column (name = "remarks", length = 100, nullable = true)
    private String remarks;

    @Column (name = "menu_level", nullable = true)
    private Integer menuLevel;

    @Column (name = "prv_icon_img",  nullable = true)
    private Blob prvIconImg;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getRunFileName() {
        return runFileName;
    }

    public void setRunFileName(String runFileName) {
        this.runFileName = runFileName;
    }

    public Integer getMenuSl() {
        return menuSl;
    }

    public void setMenuSl(Integer menuSl) {
        this.menuSl = menuSl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHomeDir() {
        return homeDir;
    }

    public void setHomeDir(String homeDir) {
        this.homeDir = homeDir;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Blob getPrvIconImg() {
        return prvIconImg;
    }

    public void setPrvIconImg(Blob prvIconImg) {
        this.prvIconImg = prvIconImg;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
