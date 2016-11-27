/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Joao
 */
@Embeddable
public class BuscapacotePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idbuscaPacote")
    private int idbuscaPacote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hotel_idhotel")
    private int hotelIdhotel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "voo_voo_id")
    private int vooVooId;

    public BuscapacotePK() {
    }

    public BuscapacotePK(int idbuscaPacote, int hotelIdhotel, int vooVooId) {
        this.idbuscaPacote = idbuscaPacote;
        this.hotelIdhotel = hotelIdhotel;
        this.vooVooId = vooVooId;
    }

    public int getIdbuscaPacote() {
        return idbuscaPacote;
    }

    public void setIdbuscaPacote(int idbuscaPacote) {
        this.idbuscaPacote = idbuscaPacote;
    }

    public int getHotelIdhotel() {
        return hotelIdhotel;
    }

    public void setHotelIdhotel(int hotelIdhotel) {
        this.hotelIdhotel = hotelIdhotel;
    }

    public int getVooVooId() {
        return vooVooId;
    }

    public void setVooVooId(int vooVooId) {
        this.vooVooId = vooVooId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idbuscaPacote;
        hash += (int) hotelIdhotel;
        hash += (int) vooVooId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuscapacotePK)) {
            return false;
        }
        BuscapacotePK other = (BuscapacotePK) object;
        if (this.idbuscaPacote != other.idbuscaPacote) {
            return false;
        }
        if (this.hotelIdhotel != other.hotelIdhotel) {
            return false;
        }
        if (this.vooVooId != other.vooVooId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.BuscapacotePK[ idbuscaPacote=" + idbuscaPacote + ", hotelIdhotel=" + hotelIdhotel + ", vooVooId=" + vooVooId + " ]";
    }
    
}
