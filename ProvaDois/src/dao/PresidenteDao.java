
package dao;
import model.Presidente;
import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PresidenteDao {
    
    public static boolean cadastrarPresidente(Presidente obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into presidente (presidenteNumero,presidenteNom,"
                + "presidenteSigla, presidenteFotoDir,presidenteTotalVotos) values"
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
    public static Presidente exiberPresidente(int num){
        
        Presidente obj = new Presidente(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "SELECT * FROM presidente where presidenteNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){   
                obj.setNum(rs.getInt("presidenteNumero"));
                obj.setNome(rs.getString("presidenteNom"));
                obj.setSigla(rs.getString("presidenteSigla"));
                obj.setFoto(rs.getString("presidenteFotoDir"));
                obj.setVotos(rs.getInt("presidenteTotalVotos"));
                
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
    public static boolean editarPresidente(Presidente obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "UPDATE presidente set presidenteFedNom = ?,"
                + " presidenteSigla = ?, presidenteFotoDir = ?, presidenteTotalVotos = ?"
                + " where presidenteNumero = ?";
        
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
    public static void votarPresidente(int num){
        Presidente obj = new Presidente(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "update presidente set presidenteVotos = presidenteVotos + 1"
                + " where presidenteNumero = ?";
        
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
    
    public static boolean excluirPresidente(int num){
               
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "Delete from presidente where presidenteNumero = ?";
        
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
