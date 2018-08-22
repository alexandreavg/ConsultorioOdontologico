
package Model;

import java.util.Date;

/**
 *
 * @author Nuala Morita
 */
public class ContaReceber {
    
    private int pkContasReceber;
    private Float valorcodContasReceber;
    private int numeroDaParcelacodContasReceber;
    private Date dtPagamentocodContasReceber;
    private Date dtVencimentocodContasReceber;
    private int fkContrato;
    private String statuscodContasReceber;
    private boolean reciboEmitidoContasReceber;

    public ContaReceber(int pkContasReceber, Float valorcodContasReceber, int numeroDaParcelacodContasReceber, Date dtPagamentocodContasReceber, Date dtVencimentocodContasReceber, int fkContrato, String statuscodContasReceber, boolean reciboEmitidoContasReceber) {
        this.pkContasReceber = pkContasReceber;
        this.valorcodContasReceber = valorcodContasReceber;
        this.numeroDaParcelacodContasReceber = numeroDaParcelacodContasReceber;
        this.dtPagamentocodContasReceber = dtPagamentocodContasReceber;
        this.dtVencimentocodContasReceber = dtVencimentocodContasReceber;
        this.fkContrato = fkContrato;
        this.statuscodContasReceber = statuscodContasReceber;
        this.reciboEmitidoContasReceber = reciboEmitidoContasReceber;
    }

    public int getPkContasReceber() {
        return pkContasReceber;
    }

    public void setPkContasReceber(int pkContasReceber) {
        this.pkContasReceber = pkContasReceber;
    }

    public Float getValorcodContasReceber() {
        return valorcodContasReceber;
    }

    public void setValorcodContasReceber(Float valorcodContasReceber) {
        this.valorcodContasReceber = valorcodContasReceber;
    }

    public int getNumeroDaParcelacodContasReceber() {
        return numeroDaParcelacodContasReceber;
    }

    public void setNumeroDaParcelacodContasReceber(int numeroDaParcelacodContasReceber) {
        this.numeroDaParcelacodContasReceber = numeroDaParcelacodContasReceber;
    }

    public Date getDtPagamentocodContasReceber() {
        return dtPagamentocodContasReceber;
    }

    public void setDtPagamentocodContasReceber(Date dtPagamentocodContasReceber) {
        this.dtPagamentocodContasReceber = dtPagamentocodContasReceber;
    }

    public Date getDtVencimentocodContasReceber() {
        return dtVencimentocodContasReceber;
    }

    public void setDtVencimentocodContasReceber(Date dtVencimentocodContasReceber) {
        this.dtVencimentocodContasReceber = dtVencimentocodContasReceber;
    }

    public int getFkContrato() {
        return fkContrato;
    }

    public void setFkContrato(int fkContrato) {
        this.fkContrato = fkContrato;
    }

    public String getStatuscodContasReceber() {
        return statuscodContasReceber;
    }

    public void setStatuscodContasReceber(String statuscodContasReceber) {
        this.statuscodContasReceber = statuscodContasReceber;
    }

    public boolean isReciboEmitidoContasReceber() {
        return reciboEmitidoContasReceber;
    }

    public void setReciboEmitidoContasReceber(boolean reciboEmitidoContasReceber) {
        this.reciboEmitidoContasReceber = reciboEmitidoContasReceber;
    }
    
    
}
