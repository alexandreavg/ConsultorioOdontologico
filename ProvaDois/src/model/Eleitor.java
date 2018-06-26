
package model;

import java.util.Date;


public class Eleitor {
    
    long numInc;
    String nome;
    Date dataNasc;
    int zona;
    int secao;
    Date dataEmissao;
    String cidade;
    String uf;
    String pai;
    String mae;

    public Eleitor() {
    }

    public Eleitor(long numInc, String nome, Date dataNasc, int zona, int secao, Date dataEmissao, String cidade, String uf, String pai, String mae) {
        this.numInc = numInc;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.zona = zona;
        this.secao = secao;
        this.dataEmissao = dataEmissao;
        this.cidade = cidade;
        this.uf = uf;
        this.pai = pai;
        this.mae = mae;
    }

    public long getNumInc() {
        return numInc;
    }

    public void setNumInc(long numInc) {
        this.numInc = numInc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public void setLong(long aLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
