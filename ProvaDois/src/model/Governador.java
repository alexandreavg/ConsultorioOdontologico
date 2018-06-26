
package model;


public class Governador {
        
    int num;
    String nome;
    String sigla;
    String foto;
    int votos;

    public Governador(int votos) {
        this.votos = 0;
    }

    public Governador(int num, String nome, String sigla, String foto, int votos) {
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
    
    
}
