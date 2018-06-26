
package dao;
import model.Senador;
import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SenadorDao {
    
    public static boolean cadastrarSenador(Senador obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into senador (senadorNumero,senadorNom,"
                + "senadorSigla, senadorFotoDir,senadorTotalVotos) values"
                + "(?,?,?,?,?)";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getNum());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getSigla());
            stmt.setString(4, obj.getFoto());
            stmt.setInt(5, obj.getVotos());
         
            stmt.executeUpdate();            
            ConnectionFactory.closeConnection(conexao, stmt);            
            return true;
            
        } catch (SQLException ex) {
            System.err.println(ex);
            ConnectionFactory.closeConnection(conexao, stmt);
            return false;
        }
      
    }//Fim do Insert
    
    //Listar
    public static Senador exiberSenador(int num){
        
        Senador obj = new Senador(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "SELECT * FROM senador where senadorNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){   
                obj.setNum(rs.getInt("senadorNumero"));
                obj.setNome(rs.getString("senadorNom"));
                obj.setSigla(rs.getString("senadorSigla"));
                obj.setFoto(rs.getString("senadorFotoDir"));
                obj.setVotos(rs.getInt("senadorTotalVotos"));
                
                ConnectionFactory.closeConnection(conexao, stmt, rs);   
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro na consulta do banco");
            }
            
        } catch (SQLException ex) {
            //System.out.println("Deu ruim/!!");
            JOptionPane.showMessageDialog(null,"Erro: " + ex);
            System.err.println(ex);
        }
        return obj;
    }//Fim do Metodo
    
    //Editar
    public static boolean editarSenador(Senador obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "UPDATE senador set senadorFedNom = ?,"
                + " senadorSigla = ?, senadorFotoDir = ?, senadorTotalVotos = ?"
                + " where senadorNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getSigla());
            stmt.setString(3, obj.getFoto());
            stmt.setInt(4, obj.getVotos());
            stmt.setInt(5, obj.getNum());
            
            stmt.executeUpdate();            
            ConnectionFactory.closeConnection(conexao, stmt);            
            return true;
            
        } catch (SQLException ex) {
            System.err.println(ex);
            ConnectionFactory.closeConnection(conexao, stmt);
            return false;
        }
        
    }
    
    //Somar voto
    public static void votarSenador(int num){
        Senador obj = new Senador(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "update senador set senadorVotos = senadorVotos + 1"
                + " where senadorNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            
            stmt.executeUpdate();            
            ConnectionFactory.closeConnection(conexao, stmt);
            
        } catch (SQLException ex) {
            //System.out.println("Deu ruim/!!");
            JOptionPane.showMessageDialog(null,"Erro: " + ex);
            System.err.println(ex);
        }
        
    }
    
    public static boolean excluirSenador(int num){
               
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "Delete from senador where senadorNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            stmt.executeUpdate();         
            
            ConnectionFactory.closeConnection(conexao, stmt);
            return true; 
        } catch (SQLException ex) {
            //System.out.println("Deu ruim/!!");
            JOptionPane.showMessageDialog(null,"Erro: " + ex);
            System.err.println(ex);
            return false;
        }
    
    }
}//Fim da Classe
