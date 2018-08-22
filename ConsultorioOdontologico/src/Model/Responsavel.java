
package Model;

import java.util.Date;

/**
 *
 * @author Nuala Morita
 */
public class Responsavel {
    
    private int pkResponsavel;
    private Date dtNascimentoResponsavel;
    private String nomeResponsavel;
    private String profissaoResponsavel;
    private String estadoCivilResponsavel;
    private int fkEnderecoResponsavel;

    public Responsavel(int pkResponsavel, Date dtNascimentoResponsavel, String nomeResponsavel, String profissaoResponsavel, String estadoCivilResponsavel, int fkEnderecoResponsavel) {
        this.pkResponsavel = pkResponsavel;
        this.dtNascimentoResponsavel = dtNascimentoResponsavel;
        this.nomeResponsavel = nomeResponsavel;
        this.profissaoResponsavel = profissaoResponsavel;
        this.estadoCivilResponsavel = estadoCivilResponsavel;
        this.fkEnderecoResponsavel = fkEnderecoResponsavel;
    }

    public int getPkResponsavel() {
        return pkResponsavel;
    }

    public void setPkResponsavel(int pkResponsavel) {
        this.pkResponsavel = pkResponsavel;
    }

    public Date getDtNascimentoResponsavel() {
        return dtNascimentoResponsavel;
    }

    public void setDtNascimentoResponsavel(Date dtNascimentoResponsavel) {
        this.dtNascimentoResponsavel = dtNascimentoResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getProfissaoResponsavel() {
        return profissaoResponsavel;
    }

    public void setProfissaoResponsavel(String profissaoResponsavel) {
        this.profissaoResponsavel = profissaoResponsavel;
    }

    public String getEstadoCivilResponsavel() {
        return estadoCivilResponsavel;
    }

    public void setEstadoCivilResponsavel(String estadoCivilResponsavel) {
        this.estadoCivilResponsavel = estadoCivilResponsavel;
    }

    public int getFkEnderecoResponsavel() {
        return fkEnderecoResponsavel;
    }

    public void setFkEnderecoResponsavel(int fkEnderecoResponsavel) {
        this.fkEnderecoResponsavel = fkEnderecoResponsavel;
    }
    
    
    
}
