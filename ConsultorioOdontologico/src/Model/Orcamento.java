
package Model;

/**
 *
 * @author Nuala Morita
 */
public class Orcamento {
    
    private int pkOrcamento;
    private int fkAgendamento;
    private Float valorOrcamento;
    private int qtdParcelaOrcamento;
    private String tempoDuracaoOrcamento;

    public Orcamento(int pkOrcamento, int fkAgendamento, Float valorOrcamento, int qtdParcelaOrcamento, String tempoDuracaoOrcamento) {
        this.pkOrcamento = pkOrcamento;
        this.fkAgendamento = fkAgendamento;
        this.valorOrcamento = valorOrcamento;
        this.qtdParcelaOrcamento = qtdParcelaOrcamento;
        this.tempoDuracaoOrcamento = tempoDuracaoOrcamento;
    }

    public int getPkOrcamento() {
        return pkOrcamento;
    }

    public void setPkOrcamento(int pkOrcamento) {
        this.pkOrcamento = pkOrcamento;
    }

    public int getFkAgendamento() {
        return fkAgendamento;
    }

    public void setFkAgendamento(int fkAgendamento) {
        this.fkAgendamento = fkAgendamento;
    }

    public Float getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(Float valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getQtdParcelaOrcamento() {
        return qtdParcelaOrcamento;
    }

    public void setQtdParcelaOrcamento(int qtdParcelaOrcamento) {
        this.qtdParcelaOrcamento = qtdParcelaOrcamento;
    }

    public String getTempoDuracaoOrcamento() {
        return tempoDuracaoOrcamento;
    }

    public void setTempoDuracaoOrcamento(String tempoDuracaoOrcamento) {
        this.tempoDuracaoOrcamento = tempoDuracaoOrcamento;
    }
    
    
}
