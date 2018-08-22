
package Model;

import java.util.Date;

/**
 *
 * @author Nuala Morita
 */
public class Paciente {
    
    private int pkPaciente;
    private Date dtNascimentoPaciente;
    private String nomePaciente;
    private double cpfPaciente;
    private String rgPaciente;
    private boolean statusPaciente;
    private String emailPaciente;
    private String anamnesePaciente;
    private int telefonePaciente;
    private int fkResponsavelPaciente;
    private int fkEnderecoPaciente;
    private String profissaoPaciente;
    private String estadoCivilPaciente;
    private String obsPaciente;
    private int celularPaciente;

    public Paciente(int pkPaciente, Date dtNascimentoPaciente, String nomePaciente, double cpfPaciente, String rgPaciente, boolean statusPaciente, String emailPaciente, String anamnesePaciente, int telefonePaciente, int fkResponsavelPaciente, int fkEnderecoPaciente, String profissaoPaciente, String estadoCivilPaciente, String obsPaciente, int celularPaciente) {
        this.pkPaciente = pkPaciente;
        this.dtNascimentoPaciente = dtNascimentoPaciente;
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        this.rgPaciente = rgPaciente;
        this.statusPaciente = statusPaciente;
        this.emailPaciente = emailPaciente;
        this.anamnesePaciente = anamnesePaciente;
        this.telefonePaciente = telefonePaciente;
        this.fkResponsavelPaciente = fkResponsavelPaciente;
        this.fkEnderecoPaciente = fkEnderecoPaciente;
        this.profissaoPaciente = profissaoPaciente;
        this.estadoCivilPaciente = estadoCivilPaciente;
        this.obsPaciente = obsPaciente;
        this.celularPaciente = celularPaciente;
    }

    public int getPkPaciente() {
        return pkPaciente;
    }

    public void setPkPaciente(int pkPaciente) {
        this.pkPaciente = pkPaciente;
    }

    public Date getDtNascimentoPaciente() {
        return dtNascimentoPaciente;
    }

    public void setDtNascimentoPaciente(Date dtNascimentoPaciente) {
        this.dtNascimentoPaciente = dtNascimentoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public double getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(double cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public boolean isStatusPaciente() {
        return statusPaciente;
    }

    public void setStatusPaciente(boolean statusPaciente) {
        this.statusPaciente = statusPaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public String getAnamnesePaciente() {
        return anamnesePaciente;
    }

    public void setAnamnesePaciente(String anamnesePaciente) {
        this.anamnesePaciente = anamnesePaciente;
    }

    public int getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(int telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public int getFkResponsavelPaciente() {
        return fkResponsavelPaciente;
    }

    public void setFkResponsavelPaciente(int fkResponsavelPaciente) {
        this.fkResponsavelPaciente = fkResponsavelPaciente;
    }

    public int getFkEnderecoPaciente() {
        return fkEnderecoPaciente;
    }

    public void setFkEnderecoPaciente(int fkEnderecoPaciente) {
        this.fkEnderecoPaciente = fkEnderecoPaciente;
    }

    public String getProfissaoPaciente() {
        return profissaoPaciente;
    }

    public void setProfissaoPaciente(String profissaoPaciente) {
        this.profissaoPaciente = profissaoPaciente;
    }

    public String getEstadoCivilPaciente() {
        return estadoCivilPaciente;
    }

    public void setEstadoCivilPaciente(String estadoCivilPaciente) {
        this.estadoCivilPaciente = estadoCivilPaciente;
    }

    public String getObsPaciente() {
        return obsPaciente;
    }

    public void setObsPaciente(String obsPaciente) {
        this.obsPaciente = obsPaciente;
    }

    public int getCelularPaciente() {
        return celularPaciente;
    }

    public void setCelularPaciente(int celularPaciente) {
        this.celularPaciente = celularPaciente;
    }

   

}