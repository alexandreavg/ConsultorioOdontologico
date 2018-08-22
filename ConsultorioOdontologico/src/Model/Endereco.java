
package Model;

/**
 *
 * @author Nuala Morita
 */
public class Endereco {
    
    private int pkEndereco;
    private String ruaEndereco;
    private int numEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private String ufEndereco;
    private String complementoEndereco;

    public Endereco(int pkEndereco, String ruaEndereco, int numEndereco, String bairroEndereco, String cidadeEndereco, String ufEndereco, String complementoEndereco) {
        this.pkEndereco = pkEndereco;
        this.ruaEndereco = ruaEndereco;
        this.numEndereco = numEndereco;
        this.bairroEndereco = bairroEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.ufEndereco = ufEndereco;
        this.complementoEndereco = complementoEndereco;
    }

    public int getPkEndereco() {
        return pkEndereco;
    }

    public void setPkEndereco(int pkEndereco) {
        this.pkEndereco = pkEndereco;
    }

    public String getRuaEndereco() {
        return ruaEndereco;
    }

    public void setRuaEndereco(String ruaEndereco) {
        this.ruaEndereco = ruaEndereco;
    }

    public int getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(int numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        this.ufEndereco = ufEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }
    
    
}
