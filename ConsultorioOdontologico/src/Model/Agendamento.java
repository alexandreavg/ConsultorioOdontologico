
package Model;

import java.util.Date;

/**
 *
 * @author Nuala Morita
 */
public class Agendamento {
    
    private int pkAgendamento;
    private int fkDentistaAgendamento;
    private int fkPacienteAgendamento;
    private String obsAgendamento;
    private Date dataLancamentoAgendamento;
    private Date dataConsultaAgendamento;
    private int fkServicoAgendamento;
    private String tipoAgendamento;

    public Agendamento(int pkAgendamento, int fkDentistaAgendamento, int fkPacienteAgendamento, String obsAgendamento, Date dataLancamentoAgendamento, Date dataConsultaAgendamento, int fkServicoAgendamento, String tipoAgendamento) {
        this.pkAgendamento = pkAgendamento;
        this.fkDentistaAgendamento = fkDentistaAgendamento;
        this.fkPacienteAgendamento = fkPacienteAgendamento;
        this.obsAgendamento = obsAgendamento;
        this.dataLancamentoAgendamento = dataLancamentoAgendamento;
        this.dataConsultaAgendamento = dataConsultaAgendamento;
        this.fkServicoAgendamento = fkServicoAgendamento;
        this.tipoAgendamento = tipoAgendamento;
    }

    public int getPkAgendamento() {
        return pkAgendamento;
    }

    public void setPkAgendamento(int pkAgendamento) {
        this.pkAgendamento = pkAgendamento;
    }

    public int getFkDentistaAgendamento() {
        return fkDentistaAgendamento;
    }

    public void setFkDentistaAgendamento(int fkDentistaAgendamento) {
        this.fkDentistaAgendamento = fkDentistaAgendamento;
    }

    public int getFkPacienteAgendamento() {
        return fkPacienteAgendamento;
    }

    public void setFkPacienteAgendamento(int fkPacienteAgendamento) {
        this.fkPacienteAgendamento = fkPacienteAgendamento;
    }

    public String getObsAgendamento() {
        return obsAgendamento;
    }

    public void setObsAgendamento(String obsAgendamento) {
        this.obsAgendamento = obsAgendamento;
    }

    public Date getDataLancamentoAgendamento() {
        return dataLancamentoAgendamento;
    }

    public void setDataLancamentoAgendamento(Date dataLancamentoAgendamento) {
        this.dataLancamentoAgendamento = dataLancamentoAgendamento;
    }

    public Date getDataConsultaAgendamento() {
        return dataConsultaAgendamento;
    }

    public void setDataConsultaAgendamento(Date dataConsultaAgendamento) {
        this.dataConsultaAgendamento = dataConsultaAgendamento;
    }

    public int getFkServicoAgendamento() {
        return fkServicoAgendamento;
    }

    public void setFkServicoAgendamento(int fkServicoAgendamento) {
        this.fkServicoAgendamento = fkServicoAgendamento;
    }

    public String getTipoAgendamento() {
        return tipoAgendamento;
    }

    public void setTipoAgendamento(String tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }
    
       
}
