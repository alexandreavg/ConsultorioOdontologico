
package Model;

/**
 *
 * @author Nuala Morita
 */
public class Dentista_Tratamento {
    
    private int fkDentista;
    private int fkTratamento;

    public Dentista_Tratamento(int fkDentista, int fkTratamento) {
        this.fkDentista = fkDentista;
        this.fkTratamento = fkTratamento;
    }

    public int getFkDentista() {
        return fkDentista;
    }

    public void setFkDentista(int fkDentista) {
        this.fkDentista = fkDentista;
    }

    public int getFkTratamento() {
        return fkTratamento;
    }

    public void setFkTratamento(int fkTratamento) {
        this.fkTratamento = fkTratamento;
    }
    
    
}
