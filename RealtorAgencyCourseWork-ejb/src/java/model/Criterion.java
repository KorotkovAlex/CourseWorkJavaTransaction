/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Саня
 */
@Entity
@Table(name = "criterion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criterion.findAll", query = "SELECT c FROM Criterion c")
    , @NamedQuery(name = "Criterion.findByIdcriterion", query = "SELECT c FROM Criterion c WHERE c.idcriterion = :idcriterion")
    , @NamedQuery(name = "Criterion.findBySquer", query = "SELECT c FROM Criterion c WHERE c.squer = :squer")
    , @NamedQuery(name = "Criterion.findByMinPrice", query = "SELECT c FROM Criterion c WHERE c.minPrice = :minPrice")
    , @NamedQuery(name = "Criterion.findByMaxPrice", query = "SELECT c FROM Criterion c WHERE c.maxPrice = :maxPrice")
    , @NamedQuery(name = "Criterion.findByNumberRoom", query = "SELECT c FROM Criterion c WHERE c.numberRoom = :numberRoom")
    , @NamedQuery(name = "Criterion.findByStreet", query = "SELECT c FROM Criterion c WHERE c.street = :street")
    , @NamedQuery(name = "Criterion.findByDistrict", query = "SELECT c FROM Criterion c WHERE c.district = :district")
    , @NamedQuery(name = "Criterion.findByFloor", query = "SELECT c FROM Criterion c WHERE c.floor = :floor")
    , @NamedQuery(name = "Criterion.findByTypeHome", query = "SELECT c FROM Criterion c WHERE c.typeHome = :typeHome")
    , @NamedQuery(name = "Criterion.findByNumberFloors", query = "SELECT c FROM Criterion c WHERE c.numberFloors = :numberFloors")
    , @NamedQuery(name = "Criterion.findByIsAccepted", query = "SELECT c FROM Criterion c WHERE c.isAccepted = :isAccepted")})
public class Criterion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcriterion")
    private Integer idcriterion;
    @Column(name = "squer")
    private Integer squer;
    @Size(max = 45)
    @Column(name = "minPrice")
    private String minPrice;
    @Size(max = 45)
    @Column(name = "maxPrice")
    private String maxPrice;
    @Column(name = "numberRoom")
    private Integer numberRoom;
    @Size(max = 45)
    @Column(name = "street")
    private String street;
    @Size(max = 45)
    @Column(name = "district")
    private String district;
    @Column(name = "floor")
    private Integer floor;
    @Size(max = 45)
    @Column(name = "typeHome")
    private String typeHome;
    @Column(name = "numberFloors")
    private Integer numberFloors;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isAccepted")
    private boolean isAccepted;
    @JoinColumn(name = "idRequest", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Request idRequest;

    public Criterion() {
    }

    public Criterion(Integer idcriterion) {
        this.idcriterion = idcriterion;
    }

    public Criterion(Integer idcriterion, boolean isAccepted) {
        this.idcriterion = idcriterion;
        this.isAccepted = isAccepted;
    }

    public Integer getIdcriterion() {
        return idcriterion;
    }

    public void setIdcriterion(Integer idcriterion) {
        this.idcriterion = idcriterion;
    }

    public Integer getSquer() {
        return squer;
    }

    public void setSquer(Integer squer) {
        this.squer = squer;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(Integer numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getTypeHome() {
        return typeHome;
    }

    public void setTypeHome(String typeHome) {
        this.typeHome = typeHome;
    }

    public Integer getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
    }

    public boolean getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Request getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Request idRequest) {
        this.idRequest = idRequest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcriterion != null ? idcriterion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criterion)) {
            return false;
        }
        Criterion other = (Criterion) object;
        if ((this.idcriterion == null && other.idcriterion != null) || (this.idcriterion != null && !this.idcriterion.equals(other.idcriterion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Criterion[ idcriterion=" + idcriterion + " ]";
    }
    
}
