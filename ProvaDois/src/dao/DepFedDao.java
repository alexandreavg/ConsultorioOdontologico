
package dao;
import model.DepFed;
import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DepFedDao {
    
    //Gravar Deputado Federal
    public static boolean cadastrarDepFed(DepFed obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into deputadofederal (depFedNumero,depFedNom,"
                + "depFedSigla, depFedFotoDir,depFedTotalVotos) values"
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
    public static DepFed exiberDepFed(int num){
        
        DepFed obj = new DepFed(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "SELECT * FROM deputadofederal where depFedNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){   
                obj.setNum(rs.getInt("depFedNumero"));
                obj.setNome(rs.getString("depFedNom"));
                obj.setSigla(rs.getString("depFedSigla"));
                obj.setFoto(rs.getString("depFedFotoDir"));
                obj.setVotos(rs.getInt("depFedTotalVotos"));
                
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
    public static boolean editarDepFed(DepFed obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "UPDATE deputadofederal set depFedNom = ?,"
                + " depFedSigla = ?, depFedFotoDir = ?, depFedTotalVotos = ?"
                + " where depFedNumero = ?";
        
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
    public static void votarDepFed(int num){
        DepFed obj = new DepFed(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "update deputadofederal set depFedTotalVotos = depFedTotalVotos + 1"
                + " where depFedNumero = ?";
        
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
    
    public static boolean excluirDepFed(int num){
               
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "Delete from deputadofederal where depFedNumero = ?";
        
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
