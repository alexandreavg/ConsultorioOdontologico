
package Model;

import java.util.Date;

/**
 *
 * @author Nuala Morita
 */
public class Dentista {
    
    private int pkDentista;
    private Date dtNascimentoDentista;
    private double cpfDentista;
    private String rgDentista;
    private String estadoCivilDentista;
    private String emailDentista;
    private boolean statusDentista;
    private int fkEndereco;
    private String nomeDentista;
    private int telefoneDentista;
    private int celularDentista;

    public Dentista(int pkDentista, Date dtNascimentoDentista, double cpfDentista, String rgDentista, String estadoCivilDentista, String emailDentista, boolean statusDentista, int fkEndereco, String nomeDentista, int telefoneDentista, int celularDentista) {
        this.pkDentista = pkDentista;
        this.dtNascimentoDentista = dtNascimentoDentista;
        this.cpfDentista = cpfDentista;
        this.rgDentista = rgDentista;
        this.estadoCivilDentista = estadoCivilDentista;
        this.emailDentista = emailDentista;
        this.statusDentista = statusDentista;
        this.fkEndereco = fkEndereco;
        this.nomeDentista = nomeDentista;
        this.telefoneDentista = telefoneDentista;
        this.celularDentista = celularDentista;
    }

    public int getPkDentista() {
        return pkDentista;
    }

    public void setPkDentista(int pkDentista) {
        this.pkDentista = pkDentista;
    }

    public Date getDtNascimentoDentista() {
        return dtNascimentoDentista;
    }

    public void setDtNascimentoDentista(Date dtNascimentoDentista) {
        this.dtNascimentoDentista = dtNascimentoDentista;
    }

    public double getCpfDentista() {
        return cpfDentista;
    }

    public void setCpfDentista(double cpfDentista) {
        this.cpfDentista = cpfDentista;
    }

    public String getRgDentista() {
        return rgDentista;
    }

    public void setRgDentista(String rgDentista) {
        this.rgDentista = rgDentista;
    }

    public String getEstadoCivilDentista() {
        return estadoCivilDentista;
    }

    public void setEstadoCivilDentista(String estadoCivilDentista) {
        this.estadoCivilDentista = estadoCivilDentista;
    }

    public String getEmailDentista() {
        return emailDentista;
    }

    public void setEmailDentista(String emailDentista) {
        this.emailDentista = emailDentista;
    }

    public boolean isStatusDentista() {
        return statusDentista;
    }

    public void setStatusDentista(boolean statusDentista) {
        this.statusDentista = statusDentista;
    }

    public int getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(int fkEndereco) {
        this.fkEndereco = fkEndereco;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        this.nomeDentista = nomeDentista;
    }

    public int getTelefoneDentista() {
        return telefoneDentista;
    }

    public void setTelefoneDentista(int telefoneDentista) {
        this.telefoneDentista = telefoneDentista;
    }

    public int getCelularDentista() {
        return celularDentista;
    }

    public void setCelularDentista(int celularDentista) {
        this.celularDentista = celularDentista;
    }
    
    
}
