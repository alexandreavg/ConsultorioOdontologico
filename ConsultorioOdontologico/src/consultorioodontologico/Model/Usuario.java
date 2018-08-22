package Model;

/**
 *
 * @author Vitor Augusto Silva
 */
public class Usuario {
    
    private int pkUsuario;
    private String nomeUsuario;
    private String senhaUsuario;
    private boolean nivelUsuario;

    public Usuario(int pkUsuario, String nomeUsuario, String senhaUsuario, boolean nivelUsuario) {
        this.pkUsuario = pkUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.nivelUsuario = nivelUsuario;
    }
    
    public Usuario() {
    }

    public int getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public boolean isNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(boolean nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }
    
}
