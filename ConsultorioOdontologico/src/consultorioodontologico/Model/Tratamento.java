package Model;

/**
 * @author Vitor Augusto Silva
 */
public class Tratamento {
    
    private int pkTratamento;
    private String nomeTratamento;

    public Tratamento(int pkTratamento, String nomeTratamento) {
        this.pkTratamento = pkTratamento;
        this.nomeTratamento = nomeTratamento;
    }

    public Tratamento() {
    }

    public int getPkTratamento() {
        return pkTratamento;
    }

    public void setPkTratamento(int pkTratamento) {
        this.pkTratamento = pkTratamento;
    }

    public String getNomeTratamento() {
        return nomeTratamento;
    }

    public void setNomeTratamento(String nomeTratamento) {
        this.nomeTratamento = nomeTratamento;
    }
    
    
    
}
