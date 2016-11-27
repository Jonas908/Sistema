/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Joao
 */
@Entity
@Table(name = "formapagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formapagamento.findAll", query = "SELECT f FROM Formapagamento f")
    , @NamedQuery(name = "Formapagamento.findByIdFormaPagamento", query = "SELECT f FROM Formapagamento f WHERE f.idFormaPagamento = :idFormaPagamento")
    , @NamedQuery(name = "Formapagamento.findByTipoPagamento", query = "SELECT f FROM Formapagamento f WHERE f.tipoPagamento = :tipoPagamento")})
public class Formapagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFormaPagamento")
    private Integer idFormaPagamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipoPagamento")
    private String tipoPagamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formapagamento")
    private Collection<Reservapacote> reservapacoteCollection;

    public Formapagamento() {
    }

    public Formapagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public Formapagamento(Integer idFormaPagamento, String tipoPagamento) {
        this.idFormaPagamento = idFormaPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    public Integer getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
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
        hash += (idFormaPagamento != null ? idFormaPagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formapagamento)) {
            return false;
        }
        Formapagamento other = (Formapagamento) object;
        if ((this.idFormaPagamento == null && other.idFormaPagamento != null) || (this.idFormaPagamento != null && !this.idFormaPagamento.equals(other.idFormaPagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.Formapagamento[ idFormaPagamento=" + idFormaPagamento + " ]";
    }
    
}
