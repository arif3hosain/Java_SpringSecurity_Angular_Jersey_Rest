package app.dao.UmsRoleMst;
import app.dao.JpaDao;
import app.domain.UmsRoleMst;
import java.util.List;

/**
 * Created by arifhosain on 10/2/16.
 */
public class JpaUmsRoleMst extends JpaDao<UmsRoleMst, Long> implements UmsRoleMstDao{

    @Override
    public List<UmsRoleMst> findAll() {
        return null;
    }

    @Override
    public UmsRoleMst find(Long id) {
        return null;
    }

    @Override
    public UmsRoleMst save(UmsRoleMst newsEntry) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

}

