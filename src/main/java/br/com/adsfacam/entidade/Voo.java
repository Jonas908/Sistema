/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.entidade;

import java.sql.Time;
import java.sql.Date;

public class Voo  {

    private Integer vooId;
    private String cidadeOrig;
    private String aeroOrig;
    private String cidadeDest;
    private String aerodest;
    private Time horaSaida;
    private Time horaChegada;
    private Date data;

    public Time getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Time horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Time getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Time horaChegada) {
        this.horaChegada = horaChegada;
    }
    private float valor;

    public Voo() {
    
    }

    public Voo(Integer vooId, String cidadeOrig, String aeroOrig, String cidadeDest, String aerodest, Time horaSaida, Time horaChegada,Date data, float valor) {
        this.vooId = vooId;
        this.cidadeOrig = cidadeOrig;
        this.aeroOrig = aeroOrig;
        this.cidadeDest = cidadeDest;
        this.aerodest = aerodest;
        this.horaSaida = horaSaida;
        this.horaChegada = horaChegada;
        this.data = data;
        this.valor = valor;
    }

    public Integer getVooId() {
        return vooId;
    }

    public void setVooId(Integer vooId) {
        this.vooId = vooId;
    }

    public String getCidadeOrig() {
        return cidadeOrig;
    }

    public void setCidadeOrig(String cidadeOrig) {
        this.cidadeOrig = cidadeOrig;
    }

    public String getAeroOrig() {
        return aeroOrig;
    }

    public void setAeroOrig(String aeroOrig) {
        this.aeroOrig = aeroOrig;
    }

    public String getCidadeDest() {
        return cidadeDest;
    }

    public void setCidadeDest(String cidadeDest) {
        this.cidadeDest = cidadeDest;
    }

    public String getAerodest() {
        return aerodest;
    }

    public void setAerodest(String aerodest) {
        this.aerodest = aerodest;
    }

   
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
        
    }

   
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    
    
}
