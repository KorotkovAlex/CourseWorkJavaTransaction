/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import facades.RoleFacadeLocal;
import facades.UserFacadeLocal;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Role;
import model.User;


/**
 *
 * @author Саня
 */
@Named(value = "userManagedBean")
@SessionScoped
public class UserManagedBean implements Serializable{

    /**
     * Creates a new instance of UserManagedBean
     */
    @EJB
    private UserFacadeLocal userFacadeLocal;
    private User user = new User();
    @EJB 
    private RoleFacadeLocal roleFacadeLocal;   
    private Role role = new Role();
    
    public UserManagedBean() {
    }
    
     public List<User> findAll () {
        return this.userFacadeLocal.findAll();
    }
    
    public String create() {
        this.userFacadeLocal.create(getUser());
//        this.userFacadeLocal.addInJoinTable(user.getLogin(), user.getIdRole());
        return "/faces/index.xhtml";
        
    }
    
    public String createNewUser() throws UnsupportedEncodingException, NoSuchAlgorithmException{
        String password = getHex(user.getPassword());
        user.setPassword(password);
        this.userFacadeLocal.create(user);
        role.setName("Client");
        role.setLogin(user);
        this.roleFacadeLocal.create(role);
        return "/faces/index.xhtml";
        
    }
    
    private static String getHex(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public String edit(User user) {
        this.setUser(user);
        return "edit";
    }
    
    public String edit() {
        this.userFacadeLocal.edit(this.getUser());
        return "index";
    }
    public void remove(User user) {
        this.userFacadeLocal.remove(user);
    }

    public User find(Object id) {
        return this.userFacadeLocal.find(id);
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }
}
