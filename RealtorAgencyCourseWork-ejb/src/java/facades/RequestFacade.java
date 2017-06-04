/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Request;

/**
 *
 * @author Саня
 */
@Stateless
public class RequestFacade extends AbstractFacade<Request> implements RequestFacadeLocal {

    @PersistenceContext(unitName = "RealtorAgencyCourseWork-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequestFacade() {
        super(Request.class);
    }
    
}
