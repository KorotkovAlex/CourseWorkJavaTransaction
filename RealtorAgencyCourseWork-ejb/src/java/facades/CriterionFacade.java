/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Criterion;

/**
 *
 * @author Саня
 */
@Stateless
public class CriterionFacade extends AbstractFacade<Criterion> implements CriterionFacadeLocal {

    @PersistenceContext(unitName = "RealtorAgencyCourseWork-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CriterionFacade() {
        super(Criterion.class);
    }
    
}
