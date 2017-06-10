/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import facades.CriterionFacadeLocal;
import facades.OfferFacadeLocal;
import facades.RequestFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import model.Criterion;
import model.Offer;
import model.Request;

/**
 *
 * @author Саня
 */
@Named(value = "offerManagedBean")
@SessionScoped
public class OfferManagedBean implements Serializable{

    @EJB
    private OfferFacadeLocal offerFacadeLocal;
    @EJB
    private CriterionFacadeLocal criterionFacadeLocal;
    
    private Request request = new Request();
    private Criterion criterion = new Criterion();
    private Offer offer = new Offer();
    
    public OfferManagedBean() {
    }

    /**
     * @return the request
     */
    
    public List<Offer> findAll () {
        return this.offerFacadeLocal.findAll();
    }
    
    public String create() {
        this.offerFacadeLocal.create(getOffer());
        return "/faces/privateOffice.xhtml";        
    }
    
    public Request getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * @return the criterion
     */
    public Criterion getCriterion() {
        return criterion;
    }

    /**
     * @param criterion the criterion to set
     */
    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    /**
     * @return the offer
     */
    public Offer getOffer() {
        return offer;
    }

    /**
     * @param offer the offer to set
     */
    public void setOffer(Offer offer) {
        this.offer = offer;
    }
    
}
