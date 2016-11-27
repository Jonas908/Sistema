/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joao
 */
@Entity
@Table(name = "reservapacote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservapacote.findAll", query = "SELECT r FROM Reservapacote r")
    , @NamedQuery(name = "Reservapacote.findByIdcompraPacote", query = "SELECT r FROM Reservapacote r WHERE r.reservapacotePK.idcompraPacote = :idcompraPacote")
    , @NamedQuery(name = "Reservapacote.findByValorTotal", query = "SELECT r FROM Reservapacote r WHERE r.valorTotal = :valorTotal")
    , @NamedQuery(name = "Reservapacote.findByData", query = "SELECT r FROM Reservapacote r WHERE r.data = :data")
    , @NamedQuery(name = "Reservapacote.findByIdbuscaPacote", query = "SELECT r FROM Reservapacote r WHERE r.reservapacotePK.idbuscaPacote = :idbuscaPacote")
    , @NamedQuery(name = "Reservapacote.findByFormaPagamentoidFormaPagamento", query = "SELECT r FROM Reservapacote r WHERE r.reservapacotePK.formaPagamentoidFormaPagamento = :formaPagamentoidFormaPagamento")
    , @NamedQuery(name = "Reservapacote.findByStatusIdstatus", query = "SELECT r FROM Reservapacote r WHERE r.reservapacotePK.statusIdstatus = :statusIdstatus")
    , @NamedQuery(name = "Reservapacote.findByClienteIdcliente", query = "SELECT r FROM Reservapacote r WHERE r.reservapacotePK.clienteIdcliente = :clienteIdcliente")})
public class Reservapacote implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReservapacotePK reservapacotePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotal")
    private float valorTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinColumn(name = "FormaPagamento_idFormaPagamento", referencedColumnName = "idFormaPagamento", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Formapagamento formapagamento;
    @JoinColumn(name = "idbuscaPacote", referencedColumnName = "idbuscaPacote", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Buscapacote buscapacote;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "status_idstatus", referencedColumnName = "idstatus", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Status status;

    public Reservapacote() {
    }

    public Reservapacote(ReservapacotePK reservapacotePK) {
        this.reservapacotePK = reservapacotePK;
    }

    public Reservapacote(ReservapacotePK reservapacotePK, float valorTotal, Date data) {
        this.reservapacotePK = reservapacotePK;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public Reservapacote(int idcompraPacote, int idbuscaPacote, int formaPagamentoidFormaPagamento, int statusIdstatus, int clienteIdcliente) {
        this.reservapacotePK = new ReservapacotePK(idcompraPacote, idbuscaPacote, formaPagamentoidFormaPagamento, statusIdstatus, clienteIdcliente);
    }

    public ReservapacotePK getReservapacotePK() {
        return reservapacotePK;
    }

    public void setReservapacotePK(ReservapacotePK reservapacotePK) {
        this.reservapacotePK = reservapacotePK;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Formapagamento getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(Formapagamento formapagamento) {
        this.formapagamento = formapagamento;
    }

    public Buscapacote getBuscapacote() {
        return buscapacote;
    }

    public void setBuscapacote(Buscapacote buscapacote) {
        this.buscapacote = buscapacote;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservapacotePK != null ? reservapacotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservapacote)) {
            return false;
        }
        Reservapacote other = (Reservapacote) object;
        if ((this.reservapacotePK == null && other.reservapacotePK != null) || (this.reservapacotePK != null && !this.reservapacotePK.equals(other.reservapacotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.Reservapacote[ reservapacotePK=" + reservapacotePK + " ]";
    }
    
}
