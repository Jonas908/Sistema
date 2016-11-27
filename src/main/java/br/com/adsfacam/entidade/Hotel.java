/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joao
 */
@Entity
@Table(name = "hotel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
    , @NamedQuery(name = "Hotel.findByIdhotel", query = "SELECT h FROM Hotel h WHERE h.idhotel = :idhotel")
    , @NamedQuery(name = "Hotel.findByPais", query = "SELECT h FROM Hotel h WHERE h.pais = :pais")
    , @NamedQuery(name = "Hotel.findByEstado", query = "SELECT h FROM Hotel h WHERE h.estado = :estado")
    , @NamedQuery(name = "Hotel.findByCidade", query = "SELECT h FROM Hotel h WHERE h.cidade = :cidade")
    , @NamedQuery(name = "Hotel.findByValorDiaria", query = "SELECT h FROM Hotel h WHERE h.valorDiaria = :valorDiaria")})
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhotel")
    private Integer idhotel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorDiaria")
    private float valorDiaria;
   @Basic(optional = false)
   @NotNull
   @Column(name = "nomeHotel")
    private String nomeHotel;

    public Hotel() {
    }

    public Hotel(Integer idhotel) {
        this.idhotel = idhotel;
    }

    public Hotel(Integer idhotel, String nomeHotel, String pais, String estado, String cidade, float valorDiaria) {
        this.idhotel = idhotel;
        this.nomeHotel=nomeHotel;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.valorDiaria = valorDiaria;
    }

    public Integer getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Integer idhotel) {
        this.idhotel = idhotel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhotel != null ? idhotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.idhotel == null && other.idhotel != null) || (this.idhotel != null && !this.idhotel.equals(other.idhotel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.Hotel[ idhotel=" + idhotel + " ]";
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
    
}
