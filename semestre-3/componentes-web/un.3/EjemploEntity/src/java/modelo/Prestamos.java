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
@Table(name = "prestamos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamos.findAll", query = "SELECT p FROM Prestamos p")
    , @NamedQuery(name = "Prestamos.findByPrestnumero", query = "SELECT p FROM Prestamos p WHERE p.prestnumero = :prestnumero")
    , @NamedQuery(name = "Prestamos.findByPrestfecha", query = "SELECT p FROM Prestamos p WHERE p.prestfecha = :prestfecha")
    , @NamedQuery(name = "Prestamos.findByPresthora", query = "SELECT p FROM Prestamos p WHERE p.presthora = :presthora")
    , @NamedQuery(name = "Prestamos.findByPrestfechadevolucion", query = "SELECT p FROM Prestamos p WHERE p.prestfechadevolucion = :prestfechadevolucion")})
public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRESTNUMERO")
    private Long prestnumero;
    @Column(name = "PRESTFECHA")
    @Temporal(TemporalType.DATE)
    private Date prestfecha;
    @Column(name = "PRESTHORA")
    @Temporal(TemporalType.TIME)
    private Date presthora;
    @Column(name = "PRESTFECHADEVOLUCION")
    @Temporal(TemporalType.DATE)
    private Date prestfechadevolucion;
    @ManyToMany(mappedBy = "prestamosCollection")
    private Collection<Libro> libroCollection;
    @JoinColumn(name = "CLIRUT", referencedColumnName = "CLIRUT")
    @ManyToOne(optional = false)
    private Cliente clirut;

    public Prestamos() {
    }

    public Prestamos(Long prestnumero) {
        this.prestnumero = prestnumero;
    }

    public Long getPrestnumero() {
        return prestnumero;
    }

    public void setPrestnumero(Long prestnumero) {
        this.prestnumero = prestnumero;
    }

    public Date getPrestfecha() {
        return prestfecha;
    }

    public void setPrestfecha(Date prestfecha) {
        this.prestfecha = prestfecha;
    }

    public Date getPresthora() {
        return presthora;
    }

    public void setPresthora(Date presthora) {
        this.presthora = presthora;
    }

    public Date getPrestfechadevolucion() {
        return prestfechadevolucion;
    }

    public void setPrestfechadevolucion(Date prestfechadevolucion) {
        this.prestfechadevolucion = prestfechadevolucion;
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
        hash += (prestnumero != null ? prestnumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.prestnumero == null && other.prestnumero != null) || (this.prestnumero != null && !this.prestnumero.equals(other.prestnumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Prestamos[ prestnumero=" + prestnumero + " ]";
    }
    
}
