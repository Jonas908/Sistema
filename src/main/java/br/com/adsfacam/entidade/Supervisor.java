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
@Table(name = "supervisor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supervisor.findAll", query = "SELECT s FROM Supervisor s")
    , @NamedQuery(name = "Supervisor.findByIdsupervisor", query = "SELECT s FROM Supervisor s WHERE s.idsupervisor = :idsupervisor")
    , @NamedQuery(name = "Supervisor.findByLogin", query = "SELECT s FROM Supervisor s WHERE s.login = :login")
    , @NamedQuery(name = "Supervisor.findBySenha", query = "SELECT s FROM Supervisor s WHERE s.senha = :senha")})
public class Supervisor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsupervisor")
    private Integer idsupervisor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "senha")
    private String senha;

    public Supervisor() {
    }

    public Supervisor(Integer idsupervisor) {
        this.idsupervisor = idsupervisor;
    }

    public Supervisor(Integer idsupervisor, String login, String senha) {
        this.idsupervisor = idsupervisor;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdsupervisor() {
        return idsupervisor;
    }

    public void setIdsupervisor(Integer idsupervisor) {
        this.idsupervisor = idsupervisor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsupervisor != null ? idsupervisor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supervisor)) {
            return false;
        }
        Supervisor other = (Supervisor) object;
        if ((this.idsupervisor == null && other.idsupervisor != null) || (this.idsupervisor != null && !this.idsupervisor.equals(other.idsupervisor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.adsfacam.entidade.Supervisor[ idsupervisor=" + idsupervisor + " ]";
    }
    
}
