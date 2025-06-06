/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "materias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m")
    , @NamedQuery(name = "Materias.findByMatcodigo", query = "SELECT m FROM Materias m WHERE m.matcodigo = :matcodigo")
    , @NamedQuery(name = "Materias.findByMatnombre", query = "SELECT m FROM Materias m WHERE m.matnombre = :matnombre")})
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MATCODIGO")
    private Integer matcodigo;
    @Column(name = "MATNOMBRE")
    private String matnombre;
    @OneToMany(mappedBy = "matcodigo")
    private Collection<Libro> libroCollection;

    public Materias() {
    }

    public Materias(Integer matcodigo) {
        this.matcodigo = matcodigo;
    }

    public Integer getMatcodigo() {
        return matcodigo;
    }

    public void setMatcodigo(Integer matcodigo) {
        this.matcodigo = matcodigo;
    }

    public String getMatnombre() {
        return matnombre;
    }

    public void setMatnombre(String matnombre) {
        this.matnombre = matnombre;
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
        hash += (matcodigo != null ? matcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.matcodigo == null && other.matcodigo != null) || (this.matcodigo != null && !this.matcodigo.equals(other.matcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Materias[ matcodigo=" + matcodigo + " ]";
    }
    
}
