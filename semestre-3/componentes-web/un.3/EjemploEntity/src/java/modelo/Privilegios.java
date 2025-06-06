/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "privilegios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Privilegios.findAll", query = "SELECT p FROM Privilegios p")
    , @NamedQuery(name = "Privilegios.findByPricodigo", query = "SELECT p FROM Privilegios p WHERE p.pricodigo = :pricodigo")
    , @NamedQuery(name = "Privilegios.findByPrinombre", query = "SELECT p FROM Privilegios p WHERE p.prinombre = :prinombre")})
public class Privilegios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRICODIGO")
    private Short pricodigo;
    @Column(name = "PRINOMBRE")
    private String prinombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pricodigo")
    private Collection<Usuarios> usuariosCollection;

    public Privilegios() {
    }

    public Privilegios(Short pricodigo) {
        this.pricodigo = pricodigo;
    }

    public Short getPricodigo() {
        return pricodigo;
    }

    public void setPricodigo(Short pricodigo) {
        this.pricodigo = pricodigo;
    }

    public String getPrinombre() {
        return prinombre;
    }

    public void setPrinombre(String prinombre) {
        this.prinombre = prinombre;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pricodigo != null ? pricodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilegios)) {
            return false;
        }
        Privilegios other = (Privilegios) object;
        if ((this.pricodigo == null && other.pricodigo != null) || (this.pricodigo != null && !this.pricodigo.equals(other.pricodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Privilegios[ pricodigo=" + pricodigo + " ]";
    }
    
}
