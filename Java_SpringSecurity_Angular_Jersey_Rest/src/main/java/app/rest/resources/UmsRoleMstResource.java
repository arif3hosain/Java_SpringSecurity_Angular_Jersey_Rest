package app.rest.resources;

import app.dao.UmsRoleMst.UmsRoleMstDao;
import app.domain.UmsRoleMst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

/**
 * Created by arifhosain on 10/8/16.
 */
@Component
@Path("/role")
public class UmsRoleMstResource {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

  //  @Autowired
    private UserDetailsService userService;

   // @Autowired
    @Qualifier("authenticationManager")
    private AuthenticationManager authManager;

   // @Autowired
    private UmsRoleMstDao umsRoleMstDao;

    @Path("/getRoles")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UmsRoleMst> getRoles(){
        List<UmsRoleMst> umsRoleMsts=this.umsRoleMstDao.findAll();
        return umsRoleMsts;
    }


    @Path("/create")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void createRole(UmsRoleMst umsRoleMst){

       this.logger.info("Role", umsRoleMst);
        this.umsRoleMstDao.save(umsRoleMst);

    }
}
