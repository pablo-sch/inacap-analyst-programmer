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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByClirut", query = "SELECT c FROM Cliente c WHERE c.clirut = :clirut")
    , @NamedQuery(name = "Cliente.findByClinombres", query = "SELECT c FROM Cliente c WHERE c.clinombres = :clinombres")
    , @NamedQuery(name = "Cliente.findByCliapaterno", query = "SELECT c FROM Cliente c WHERE c.cliapaterno = :cliapaterno")
    , @NamedQuery(name = "Cliente.findByCliamaterno", query = "SELECT c FROM Cliente c WHERE c.cliamaterno = :cliamaterno")
    , @NamedQuery(name = "Cliente.findByClidireccion", query = "SELECT c FROM Cliente c WHERE c.clidireccion = :clidireccion")
    , @NamedQuery(name = "Cliente.findByClifono", query = "SELECT c FROM Cliente c WHERE c.clifono = :clifono")
    , @NamedQuery(name = "Cliente.findByCliemail", query = "SELECT c FROM Cliente c WHERE c.cliemail = :cliemail")
    , @NamedQuery(name = "Cliente.findByClisexo", query = "SELECT c FROM Cliente c WHERE c.clisexo = :clisexo")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLIRUT")
    private Integer clirut;
    @Column(name = "CLINOMBRES")
    private String clinombres;
    @Column(name = "CLIAPATERNO")
    private String cliapaterno;
    @Column(name = "CLIAMATERNO")
    private String cliamaterno;
    @Column(name = "CLIDIRECCION")
    private String clidireccion;
    @Column(name = "CLIFONO")
    private Integer clifono;
    @Column(name = "CLIEMAIL")
    private String cliemail;
    @Column(name = "CLISEXO")
    private Character clisexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clirut")
    private Collection<Devolucion> devolucionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clirut")
    private Collection<Prestamos> prestamosCollection;

    public Cliente() {
    }

    public Cliente(Integer clirut) {
        this.clirut = clirut;
    }

    public Integer getClirut() {
        return clirut;
    }

    public void setClirut(Integer clirut) {
        this.clirut = clirut;
    }

    public String getClinombres() {
        return clinombres;
    }

    public void setClinombres(String clinombres) {
        this.clinombres = clinombres;
    }

    public String getCliapaterno() {
        return cliapaterno;
    }

    public void setCliapaterno(String cliapaterno) {
        this.cliapaterno = cliapaterno;
    }

    public String getCliamaterno() {
        return cliamaterno;
    }

    public void setCliamaterno(String cliamaterno) {
        this.cliamaterno = cliamaterno;
    }

    public String getClidireccion() {
        return clidireccion;
    }

    public void setClidireccion(String clidireccion) {
        this.clidireccion = clidireccion;
    }

    public Integer getClifono() {
        return clifono;
    }

    public void setClifono(Integer clifono) {
        this.clifono = clifono;
    }

    public String getCliemail() {
        return cliemail;
    }

    public void setCliemail(String cliemail) {
        this.cliemail = cliemail;
    }

    public Character getClisexo() {
        return clisexo;
    }

    public void setClisexo(Character clisexo) {
        this.clisexo = clisexo;
    }

    @XmlTransient
    public Collection<Devolucion> getDevolucionCollection() {
        return devolucionCollection;
    }

    public void setDevolucionCollection(Collection<Devolucion> devolucionCollection) {
        this.devolucionCollection = devolucionCollection;
    }

    @XmlTransient
    public Collection<Prestamos> getPrestamosCollection() {
        return prestamosCollection;
    }

    public void setPrestamosCollection(Collection<Prestamos> prestamosCollection) {
        this.prestamosCollection = prestamosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clirut != null ? clirut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clirut == null && other.clirut != null) || (this.clirut != null && !this.clirut.equals(other.clirut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cliente[ clirut=" + clirut + " ]";
    }
    
}
