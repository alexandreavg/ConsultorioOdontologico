
package model;

public class DepEstado {
    
    int num;
    String nome;
    String sigla;
    String foto;
    int votos;

    public DepEstado(int votos) {
        this.votos = 0;
    }

    public DepEstado(int num, String nome, String sigla, String foto, int votos) {
        this.num = num;
        this.nome = nome;
        this.sigla = sigla;
        this.foto = foto;
        this.votos = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public boolean receberVoto(Eleitor obj){
        try{
            this.setVotos(this.getVotos()+1);
            serVotado(obj);
            return true;
        }catch(Exception ex){
            System.err.println("Erro:" + ex);
            return false;
        }
    }

    private void serVotado(Eleitor obj) {
        
    }
    
    
}
