
package Model;

/**
 *
 * @author Nuala Morita
 */
public class Atendimento {
    
    private int pkAtendimento;
    private int fkAgendamento;
    private String procedimentoAtendimento;
    private String obsAtendimento;
    private String nvlAvancoAtendimento;
    private String procedimentoFuturoAtendimento;

    public Atendimento(int pkAtendimento, int fkAgendamento, String procedimentoAtendimento, String obsAtendimento, String nvlAvancoAtendimento, String procedimentoFuturoAtendimento) {
        this.pkAtendimento = pkAtendimento;
        this.fkAgendamento = fkAgendamento;
        this.procedimentoAtendimento = procedimentoAtendimento;
        this.obsAtendimento = obsAtendimento;
        this.nvlAvancoAtendimento = nvlAvancoAtendimento;
        this.procedimentoFuturoAtendimento = procedimentoFuturoAtendimento;
    }

    public int getPkAtendimento() {
        return pkAtendimento;
    }

    public void setPkAtendimento(int pkAtendimento) {
        this.pkAtendimento = pkAtendimento;
    }

    public int getFkAgendamento() {
        return fkAgendamento;
    }

    public void setFkAgendamento(int fkAgendamento) {
        this.fkAgendamento = fkAgendamento;
    }

    public String getProcedimentoAtendimento() {
        return procedimentoAtendimento;
    }

    public void setProcedimentoAtendimento(String procedimentoAtendimento) {
        this.procedimentoAtendimento = procedimentoAtendimento;
    }

    public String getObsAtendimento() {
        return obsAtendimento;
    }

    public void setObsAtendimento(String obsAtendimento) {
        this.obsAtendimento = obsAtendimento;
    }

    public String getNvlAvancoAtendimento() {
        return nvlAvancoAtendimento;
    }

    public void setNvlAvancoAtendimento(String nvlAvancoAtendimento) {
        this.nvlAvancoAtendimento = nvlAvancoAtendimento;
    }

    public String getProcedimentoFuturoAtendimento() {
        return procedimentoFuturoAtendimento;
    }

    public void setProcedimentoFuturoAtendimento(String procedimentoFuturoAtendimento) {
        this.procedimentoFuturoAtendimento = procedimentoFuturoAtendimento;
    }
    
    
    
}
