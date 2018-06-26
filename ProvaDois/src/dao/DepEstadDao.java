
package dao;
import model.DepEstado;
import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DepEstadDao {
    
    //Gravar Deputado Estadual
    public static boolean cadastrarDepEstadual(DepEstado obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into deputadoestadual (depEstadNumero,depEstadNom,"
                + "depEstadSigla, depEstadFotoDir,depEstadTotalVotos) values"
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
    public static DepEstado exiberDepEstadual(int num){
        
        DepEstado obj = new DepEstado(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "SELECT * FROM deputadoestadual where depEstadNumero = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){   
                obj.setNum(rs.getInt("depEstadNumero"));
                obj.setNome(rs.getString("depEstadNom"));
                obj.setSigla(rs.getString("depEstadSigla"));
                obj.setFoto(rs.getString("depEstadFotoDir"));
                obj.setVotos(rs.getInt("depEstadTotalVotos"));
                
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
    public static boolean editarDepEstadual(DepEstado obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        //(depEstadNumero,depEstadNom,depEstadSigla, depEstadFotoDir,depEstadTotalVotos)
        
        String sql = "UPDATE deputadoestadual set depEstadNom = ?,"
                + " depEstadSigla = ?, depEstadFotoDir = ?, depEstadTotalVotos = ?"
                + " where depEstadNumero = ?";
        
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
    public static void votarDepEstadual(int num){
        DepEstado obj = new DepEstado(num);
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "update deputadoestadual set depEstadTotalVotos = depEstadTotalVotos + 1"
                + " where depEstadNumero = ?";
        
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
    
    public static boolean excluirDepEstadual(int num){
               
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "Delete from deputadoestadual where depEstadNumero = ?";
        
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
