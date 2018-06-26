package testes;

import connectionFactory.ConnectionFactory;
import model.DepEstado;
import dao.DepEstadDao;

/**
 * Classe criada para...
 * @author Alexandre Venezian Garcia
 * @since Clase criada em 08/06/2018
 */
public class TesteBasico {
    
    
    public static void main(String[] args) {
        
        //TESTE DE INSERT
        DepEstado teste = new DepEstado(10, "MARIO", "PPS", "C:/caraia", 8);
        DepEstadDao testeAdd = new DepEstadDao();
        testeAdd.cadastrarDepEstadual(teste);
        
        
          
    }
    
    
    
    
    

}//Fim da Classe
