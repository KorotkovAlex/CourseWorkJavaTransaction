/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import java.util.List;
import javax.ejb.Local;
import model.Criterion;

/**
 *
 * @author Саня
 */
@Local
public interface CriterionFacadeLocal {

    void create(Criterion criterion);

    void edit(Criterion criterion);

    void remove(Criterion criterion);

    Criterion find(Object id);

    List<Criterion> findAll();

    List<Criterion> findRange(int[] range);

    int count();
    
}
