/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cesar
 */
@Embeddable
public class LibroPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LIBCODIGO")
    private long libcodigo;
    @Basic(optional = false)
    @Column(name = "LIBCOPIA")
    private int libcopia;

    public LibroPK() {
    }

    public LibroPK(long libcodigo, int libcopia) {
        this.libcodigo = libcodigo;
        this.libcopia = libcopia;
    }

    public long getLibcodigo() {
        return libcodigo;
    }

    public void setLibcodigo(long libcodigo) {
        this.libcodigo = libcodigo;
    }

    public int getLibcopia() {
        return libcopia;
    }

    public void setLibcopia(int libcopia) {
        this.libcopia = libcopia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) libcodigo;
        hash += (int) libcopia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroPK)) {
            return false;
        }
        LibroPK other = (LibroPK) object;
        if (this.libcodigo != other.libcodigo) {
            return false;
        }
        if (this.libcopia != other.libcopia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.LibroPK[ libcodigo=" + libcodigo + ", libcopia=" + libcopia + " ]";
    }
    
}
