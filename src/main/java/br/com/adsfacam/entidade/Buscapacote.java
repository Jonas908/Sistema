/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Joao
 */
@Entity
@Table(name = "buscapacote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buscapacote.findAll", query = "SELECT b FROM Buscapacote b")
    , @NamedQuery(name = "Buscapacote.findByIdbuscaPacote", query = "SELECT b FROM Buscapacote b WHERE b.buscapacotePK.idbuscaPacote = :idbuscaPacote")
    , @NamedQuery(name = "Buscapacote.findByHotelIdhotel", query = "SELECT b FROM Buscapacote b WHERE b.buscapacotePK.hotelIdhotel = :hotelIdhotel")
    , @NamedQuery(name = "Buscapacote.findByVooVooId", query = "SELECT b FROM Buscapacote b WHERE b.buscapacotePK.vooVooId = :vooVooId")})
public class Buscapacote implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BuscapacotePK buscapacotePK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buscapacote")
    private Collection<Reservapacote> reservapacoteCollection;

    public Buscapacote() {
    }

    public Buscapacote(BuscapacotePK buscapacotePK) {
        this.buscapacotePK = buscapacotePK;
    }

    public Buscapacote(int idbuscaPacote, int hotelIdhotel, int vooVooId) {
        this.buscapacotePK = new BuscapacotePK(idbuscaPacote, hotelIdhotel, vooVooId);
    }

    public BuscapacotePK getBuscapacotePK() {
        return buscapacotePK;
    }

    public void setBuscapacotePK(BuscapacotePK buscapacotePK) {
        this.buscapacotePK = buscapacotePK;
    }

    @XmlTransient
    public Collection<Reservapacote> getReservapacoteCollection() {
        return reservapacoteCollection;
    }

    public void setReservapacoteCollection(Collection<Reservapacote> reservapacoteCollection) {
        this.reservapacoteCollection = reservapacoteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buscapacotePK != null ? buscapacotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buscapacote)) {
            return false;
        }
        Buscapacote other = (Buscapacote) object;
        if ((this.buscapacotePK == null && other.buscapacotePK != null) || (this.buscapacotePK != null && !this.buscapacotePK.equals(other.buscapacotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.Buscapacote[ buscapacotePK=" + buscapacotePK + " ]";
    }
    
}
