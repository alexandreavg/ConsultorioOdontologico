
package dao;
import model.Governador;
import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GovernadorDao {
    
    //Gravar Deputado Estadual
    public static boolean cadastrarGovernador(Governador obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into governador (governadorNumero,governadorNom,"
                + "governadorSigla, governadorFotoDir,governadorTotalVotos) values"
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
    
    //Listar Deputados Estaduais
    public static Governador exiberGovernador(int num){
        
        Governador obj = new Governador(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "SELECT * FROM governador where governadorNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){   
                obj.setNum(rs.getInt("governadorNumero"));
                obj.setNome(rs.getString("governadorNom"));
                obj.setSigla(rs.getString("governadorSigla"));
                obj.setFoto(rs.getString("governadorFotoDir"));
                obj.setVotos(rs.getInt("governadorTotalVotos"));
                
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
    public static boolean editarGovernador(Governador obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "UPDATE governador set governadorFedNom = ?,"
                + " governadorSigla = ?, governadorFotoDir = ?, governadorTotalVotos = ?"
                + " where governadorNumero = ?";
        
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
    public static void votarGovernador(int num){
        Governador obj = new Governador(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "update governador set governadorVotos = governadorVotos + 1"
                + " where governadorNumero = ?";
        
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
    
    public static boolean excluirGovernador(int num){
               
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "Delete from governador where governadorNumero = ?";
        
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
