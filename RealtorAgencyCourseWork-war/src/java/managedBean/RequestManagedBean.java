/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import facades.CriterionFacadeLocal;
import facades.RequestFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Criterion;
import model.Request;

/**
 *
 * @author Саня
 */
@Named(value = "requestManagedBean")
@SessionScoped
public class RequestManagedBean implements Serializable{

    @EJB
    private RequestFacadeLocal requestFacadeLocal;
    @EJB
    private CriterionFacadeLocal criterionFacadeLocal;
    
    private Request request = new Request();
    private Request request2 = new Request();
    private Criterion criterion = new Criterion();
    
    public RequestManagedBean() {
    }

    /**
     * @return the request
     */
    
    public List<Request> findAll () {
        return this.requestFacadeLocal.findAll();
    }
    
    public List<Request> findAll2 () {
        return this.requestFacadeLocal.findAll();
    }
    
    public String save (Request request2) {
       this.request2 = request2;
       return "/faces/Request/checkByCriteria.xhtml";
    }
    
    public List<Request> findById (int id) {
        List<Request> reqL = new ArrayList<>();
        reqL.add(this.requestFacadeLocal.find(id));
        return reqL;
        
    }
    
    public String create() {
        this.requestFacadeLocal.create(request);
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
     * @return the request2
     */
    public Request getRequest2() {
        return request2;
    }

    /**
     * @param request2 the request2 to set
     */
    public void setRequest2(Request request2) {
        this.request2 = request2;
    }
    
}
