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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "devolucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devolucion.findAll", query = "SELECT d FROM Devolucion d")
    , @NamedQuery(name = "Devolucion.findByDevnumero", query = "SELECT d FROM Devolucion d WHERE d.devnumero = :devnumero")
    , @NamedQuery(name = "Devolucion.findByDevfecha", query = "SELECT d FROM Devolucion d WHERE d.devfecha = :devfecha")
    , @NamedQuery(name = "Devolucion.findByDevhora", query = "SELECT d FROM Devolucion d WHERE d.devhora = :devhora")})
public class Devolucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEVNUMERO")
    private Long devnumero;
    @Column(name = "DEVFECHA")
    @Temporal(TemporalType.DATE)
    private Date devfecha;
    @Column(name = "DEVHORA")
    @Temporal(TemporalType.TIME)
    private Date devhora;
    @ManyToMany(mappedBy = "devolucionCollection")
    private Collection<Libro> libroCollection;
    @JoinColumn(name = "CLIRUT", referencedColumnName = "CLIRUT")
    @ManyToOne(optional = false)
    private Cliente clirut;

    public Devolucion() {
    }

    public Devolucion(Long devnumero) {
        this.devnumero = devnumero;
    }

    public Long getDevnumero() {
        return devnumero;
    }

    public void setDevnumero(Long devnumero) {
        this.devnumero = devnumero;
    }

    public Date getDevfecha() {
        return devfecha;
    }

    public void setDevfecha(Date devfecha) {
        this.devfecha = devfecha;
    }

    public Date getDevhora() {
        return devhora;
    }

    public void setDevhora(Date devhora) {
        this.devhora = devhora;
    }

    @XmlTransient
    public Collection<Libro> getLibroCollection() {
        return libroCollection;
    }

    public void setLibroCollection(Collection<Libro> libroCollection) {
        this.libroCollection = libroCollection;
    }

    public Cliente getClirut() {
        return clirut;
    }

    public void setClirut(Cliente clirut) {
        this.clirut = clirut;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devnumero != null ? devnumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolucion)) {
            return false;
        }
        Devolucion other = (Devolucion) object;
        if ((this.devnumero == null && other.devnumero != null) || (this.devnumero != null && !this.devnumero.equals(other.devnumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Devolucion[ devnumero=" + devnumero + " ]";
    }
    
}
