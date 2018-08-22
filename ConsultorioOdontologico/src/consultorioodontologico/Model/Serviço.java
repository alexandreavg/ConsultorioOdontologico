package Model;

/**
 * @author Vitor Augusto Silva
 */
public class Serviço {
    
    private int pkServiço;
    private String nomeServiço;
    private int duraçãoServiço;

    public Serviço(int pkServiço, String nomeServiço, int duraçãoServiço) {
        this.pkServiço = pkServiço;
        this.nomeServiço = nomeServiço;
        this.duraçãoServiço = duraçãoServiço;
    }

    public Serviço() {
    }

    public int getPkServiço() {
        return pkServiço;
    }

    public void setPkServiço(int pkServiço) {
        this.pkServiço = pkServiço;
    }

    public String getNomeServiço() {
        return nomeServiço;
    }

    public void setNomeServiço(String nomeServiço) {
        this.nomeServiço = nomeServiço;
    }

    public int getDuraçãoServiço() {
        return duraçãoServiço;
    }

    public void setDuraçãoServiço(int duraçãoServiço) {
        this.duraçãoServiço = duraçãoServiço;
    }
    
    
   
}
