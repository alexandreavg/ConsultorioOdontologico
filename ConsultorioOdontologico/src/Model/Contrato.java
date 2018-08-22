
package Model;

import java.util.Date;

/**
 *
 * @author Nuala Morita
 */
public class Contrato {
    
    private int pkContrato;
    private int fkOrcamento;
    private String posContrato;
    private String riscoContrato;
    private Date dtInicioContrato;

    public Contrato(int pkContrato, int fkOrcamento, String posContrato, String riscoContrato, Date dtInicioContrato) {
        this.pkContrato = pkContrato;
        this.fkOrcamento = fkOrcamento;
        this.posContrato = posContrato;
        this.riscoContrato = riscoContrato;
        this.dtInicioContrato = dtInicioContrato;
    }

    public int getPkContrato() {
        return pkContrato;
    }

    public void setPkContrato(int pkContrato) {
        this.pkContrato = pkContrato;
    }

    public int getFkOrcamento() {
        return fkOrcamento;
    }

    public void setFkOrcamento(int fkOrcamento) {
        this.fkOrcamento = fkOrcamento;
    }

    public String getPosContrato() {
        return posContrato;
    }

    public void setPosContrato(String posContrato) {
        this.posContrato = posContrato;
    }

    public String getRiscoContrato() {
        return riscoContrato;
    }

    public void setRiscoContrato(String riscoContrato) {
        this.riscoContrato = riscoContrato;
    }

    public Date getDtInicioContrato() {
        return dtInicioContrato;
    }

    public void setDtInicioContrato(Date dtInicioContrato) {
        this.dtInicioContrato = dtInicioContrato;
    }
    
        
}
