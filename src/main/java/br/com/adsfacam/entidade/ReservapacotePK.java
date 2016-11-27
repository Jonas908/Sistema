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
public class ReservapacotePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idcompraPacote")
    private int idcompraPacote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idbuscaPacote")
    private int idbuscaPacote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormaPagamento_idFormaPagamento")
    private int formaPagamentoidFormaPagamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status_idstatus")
    private int statusIdstatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;

    public ReservapacotePK() {
    }

    public ReservapacotePK(int idcompraPacote, int idbuscaPacote, int formaPagamentoidFormaPagamento, int statusIdstatus, int clienteIdcliente) {
        this.idcompraPacote = idcompraPacote;
        this.idbuscaPacote = idbuscaPacote;
        this.formaPagamentoidFormaPagamento = formaPagamentoidFormaPagamento;
        this.statusIdstatus = statusIdstatus;
        this.clienteIdcliente = clienteIdcliente;
    }

    public int getIdcompraPacote() {
        return idcompraPacote;
    }

    public void setIdcompraPacote(int idcompraPacote) {
        this.idcompraPacote = idcompraPacote;
    }

    public int getIdbuscaPacote() {
        return idbuscaPacote;
    }

    public void setIdbuscaPacote(int idbuscaPacote) {
        this.idbuscaPacote = idbuscaPacote;
    }

    public int getFormaPagamentoidFormaPagamento() {
        return formaPagamentoidFormaPagamento;
    }

    public void setFormaPagamentoidFormaPagamento(int formaPagamentoidFormaPagamento) {
        this.formaPagamentoidFormaPagamento = formaPagamentoidFormaPagamento;
    }

    public int getStatusIdstatus() {
        return statusIdstatus;
    }

    public void setStatusIdstatus(int statusIdstatus) {
        this.statusIdstatus = statusIdstatus;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcompraPacote;
        hash += (int) idbuscaPacote;
        hash += (int) formaPagamentoidFormaPagamento;
        hash += (int) statusIdstatus;
        hash += (int) clienteIdcliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservapacotePK)) {
            return false;
        }
        ReservapacotePK other = (ReservapacotePK) object;
        if (this.idcompraPacote != other.idcompraPacote) {
            return false;
        }
        if (this.idbuscaPacote != other.idbuscaPacote) {
            return false;
        }
        if (this.formaPagamentoidFormaPagamento != other.formaPagamentoidFormaPagamento) {
            return false;
        }
        if (this.statusIdstatus != other.statusIdstatus) {
            return false;
        }
        if (this.clienteIdcliente != other.clienteIdcliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.ReservapacotePK[ idcompraPacote=" + idcompraPacote + ", idbuscaPacote=" + idbuscaPacote + ", formaPagamentoidFormaPagamento=" + formaPagamentoidFormaPagamento + ", statusIdstatus=" + statusIdstatus + ", clienteIdcliente=" + clienteIdcliente + " ]";
    }
    
}
