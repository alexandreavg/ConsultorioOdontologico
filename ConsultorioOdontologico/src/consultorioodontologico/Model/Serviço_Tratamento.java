package Model;

/**
 * @author Vitor Augusto Silva
 */
public class Serviço_Tratamento {
    
    private int fkServiço;
    private int fkTratamento;

    public Serviço_Tratamento(int fkServiço, int fkTratamento) {
        this.fkServiço = fkServiço;
        this.fkTratamento = fkTratamento;
    }

    public Serviço_Tratamento() {
    }

    public int getFkServiço() {
        return fkServiço;
    }

    public void setFkServiço(int fkServiço) {
        this.fkServiço = fkServiço;
    }

    public int getFkTratamento() {
        return fkTratamento;
    }

    public void setFkTratamento(int fkTratamento) {
        this.fkTratamento = fkTratamento;
    }
    
}
