/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import java.util.List;
import javax.ejb.Local;
import model.Request;

/**
 *
 * @author Саня
 */
@Local
public interface RequestFacadeLocal {

    void create(Request request);

    void edit(Request request);

    void remove(Request request);

    Request find(Object id);

    List<Request> findAll();

    List<Request> findRange(int[] range);

    int count();
    
}
