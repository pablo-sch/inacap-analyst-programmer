/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByUsunombre", query = "SELECT u FROM Usuarios u WHERE u.usunombre = :usunombre")
    , @NamedQuery(name = "Usuarios.findByUsucontrasena", query = "SELECT u FROM Usuarios u WHERE u.usucontrasena = :usucontrasena")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USUNOMBRE")
    private String usunombre;
    @Column(name = "USUCONTRASENA")
    private String usucontrasena;
    @JoinColumn(name = "PRICODIGO", referencedColumnName = "PRICODIGO")
    @ManyToOne(optional = false)
    private Privilegios pricodigo;

    public Usuarios() {
    }

    public Usuarios(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsucontrasena() {
        return usucontrasena;
    }

    public void setUsucontrasena(String usucontrasena) {
        this.usucontrasena = usucontrasena;
    }

    public Privilegios getPricodigo() {
        return pricodigo;
    }

    public void setPricodigo(Privilegios pricodigo) {
        this.pricodigo = pricodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usunombre != null ? usunombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usunombre == null && other.usunombre != null) || (this.usunombre != null && !this.usunombre.equals(other.usunombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuarios[ usunombre=" + usunombre + " ]";
    }
    
}
