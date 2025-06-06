/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l")
    , @NamedQuery(name = "Libro.findByLibcodigo", query = "SELECT l FROM Libro l WHERE l.libroPK.libcodigo = :libcodigo")
    , @NamedQuery(name = "Libro.findByLibtitulo", query = "SELECT l FROM Libro l WHERE l.libtitulo = :libtitulo")
    , @NamedQuery(name = "Libro.findByLibautor", query = "SELECT l FROM Libro l WHERE l.libautor = :libautor")
    , @NamedQuery(name = "Libro.findByLibeditorial", query = "SELECT l FROM Libro l WHERE l.libeditorial = :libeditorial")
    , @NamedQuery(name = "Libro.findByLibcopia", query = "SELECT l FROM Libro l WHERE l.libroPK.libcopia = :libcopia")
    , @NamedQuery(name = "Libro.findByLibcodbarra", query = "SELECT l FROM Libro l WHERE l.libcodbarra = :libcodbarra")
    , @NamedQuery(name = "Libro.findByLibestado", query = "SELECT l FROM Libro l WHERE l.libestado = :libestado")})
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LibroPK libroPK;
    @Column(name = "LIBTITULO")
    private String libtitulo;
    @Column(name = "LIBAUTOR")
    private String libautor;
    @Column(name = "LIBEDITORIAL")
    private String libeditorial;
    @Column(name = "LIBCODBARRA")
    private Integer libcodbarra;
    @Column(name = "LIBESTADO")
    private Character libestado;
    @JoinTable(name = "inventariolibros", joinColumns = {
        @JoinColumn(name = "LIBCOPIA", referencedColumnName = "LIBCOPIA")
        , @JoinColumn(name = "LIBCODIGO", referencedColumnName = "LIBCODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "INVNUMERO", referencedColumnName = "INVNUMERO")})
    @ManyToMany
    private Collection<Inventario> inventarioCollection;
    @JoinTable(name = "prestamoslibros", joinColumns = {
        @JoinColumn(name = "LIBCOPIA", referencedColumnName = "LIBCOPIA")
        , @JoinColumn(name = "LIBCODIGO", referencedColumnName = "LIBCODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "PRESTNUMERO", referencedColumnName = "PRESTNUMERO")})
    @ManyToMany
    private Collection<Prestamos> prestamosCollection;
    @JoinTable(name = "devolucionlibros", joinColumns = {
        @JoinColumn(name = "LIBCOPIA", referencedColumnName = "LIBCOPIA")
        , @JoinColumn(name = "LIBCODIGO", referencedColumnName = "LIBCODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "DEVNUMERO", referencedColumnName = "DEVNUMERO")})
    @ManyToMany
    private Collection<Devolucion> devolucionCollection;
    @JoinColumn(name = "MATCODIGO", referencedColumnName = "MATCODIGO")
    @ManyToOne
    private Materias matcodigo;

    public Libro() {
    }

    public Libro(LibroPK libroPK) {
        this.libroPK = libroPK;
    }

    public Libro(long libcodigo, int libcopia) {
        this.libroPK = new LibroPK(libcodigo, libcopia);
    }

    public LibroPK getLibroPK() {
        return libroPK;
    }

    public void setLibroPK(LibroPK libroPK) {
        this.libroPK = libroPK;
    }

    public String getLibtitulo() {
        return libtitulo;
    }

    public void setLibtitulo(String libtitulo) {
        this.libtitulo = libtitulo;
    }

    public String getLibautor() {
        return libautor;
    }

    public void setLibautor(String libautor) {
        this.libautor = libautor;
    }

    public String getLibeditorial() {
        return libeditorial;
    }

    public void setLibeditorial(String libeditorial) {
        this.libeditorial = libeditorial;
    }

    public Integer getLibcodbarra() {
        return libcodbarra;
    }

    public void setLibcodbarra(Integer libcodbarra) {
        this.libcodbarra = libcodbarra;
    }

    public Character getLibestado() {
        return libestado;
    }

    public void setLibestado(Character libestado) {
        this.libestado = libestado;
    }

    @XmlTransient
    public Collection<Inventario> getInventarioCollection() {
        return inventarioCollection;
    }

    public void setInventarioCollection(Collection<Inventario> inventarioCollection) {
        this.inventarioCollection = inventarioCollection;
    }

    @XmlTransient
    public Collection<Prestamos> getPrestamosCollection() {
        return prestamosCollection;
    }

    public void setPrestamosCollection(Collection<Prestamos> prestamosCollection) {
        this.prestamosCollection = prestamosCollection;
    }

    @XmlTransient
    public Collection<Devolucion> getDevolucionCollection() {
        return devolucionCollection;
    }

    public void setDevolucionCollection(Collection<Devolucion> devolucionCollection) {
        this.devolucionCollection = devolucionCollection;
    }

    public Materias getMatcodigo() {
        return matcodigo;
    }

    public void setMatcodigo(Materias matcodigo) {
        this.matcodigo = matcodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libroPK != null ? libroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.libroPK == null && other.libroPK != null) || (this.libroPK != null && !this.libroPK.equals(other.libroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Libro[ libroPK=" + libroPK + " ]";
    }
    
}
