package app.domain;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * Created by arifhosain on 10/14/16.
 */
@Entity
@Table (name = "test")
public class Test extends AbstractAuditingEntity implements app.entity.Entity{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public String getCreatedBy() {
        return super.getCreatedBy();
    }

    @Override
    public void setCreatedBy(String createdBy) {
        super.setCreatedBy(createdBy);
    }

    @Override
    public ZonedDateTime getCreatedDate() {
        return super.getCreatedDate();
    }

    @Override
    public void setCreatedDate(ZonedDateTime createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public String getLastModifiedBy() {
        return super.getLastModifiedBy();
    }

    @Override
    public void setLastModifiedBy(String lastModifiedBy) {
        super.setLastModifiedBy(lastModifiedBy);
    }

    @Override
    public ZonedDateTime getLastModifiedDate() {
        return super.getLastModifiedDate();
    }

    @Override
    public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
        super.setLastModifiedDate(lastModifiedDate);
    }
}
