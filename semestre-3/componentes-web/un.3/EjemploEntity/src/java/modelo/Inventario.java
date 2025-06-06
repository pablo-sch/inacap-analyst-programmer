/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i")
    , @NamedQuery(name = "Inventario.findByInvnumero", query = "SELECT i FROM Inventario i WHERE i.invnumero = :invnumero")
    , @NamedQuery(name = "Inventario.findByInvfecha", query = "SELECT i FROM Inventario i WHERE i.invfecha = :invfecha")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVNUMERO")
    private Long invnumero;
    @Column(name = "INVFECHA")
    @Temporal(TemporalType.DATE)
    private Date invfecha;
    @ManyToMany(mappedBy = "inventarioCollection")
    private Collection<Libro> libroCollection;

    public Inventario() {
    }

    public Inventario(Long invnumero) {
        this.invnumero = invnumero;
    }

    public Long getInvnumero() {
        return invnumero;
    }

    public void setInvnumero(Long invnumero) {
        this.invnumero = invnumero;
    }

    public Date getInvfecha() {
        return invfecha;
    }

    public void setInvfecha(Date invfecha) {
        this.invfecha = invfecha;
    }

    @XmlTransient
    public Collection<Libro> getLibroCollection() {
        return libroCollection;
    }

    public void setLibroCollection(Collection<Libro> libroCollection) {
        this.libroCollection = libroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invnumero != null ? invnumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.invnumero == null && other.invnumero != null) || (this.invnumero != null && !this.invnumero.equals(other.invnumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Inventario[ invnumero=" + invnumero + " ]";
    }
    
}
