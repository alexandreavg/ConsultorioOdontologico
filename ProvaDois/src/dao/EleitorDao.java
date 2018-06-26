package dao;

import model.Eleitor;
import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DepEstado;
import model.Senador;

public class EleitorDao {
    
    public static boolean cadastrarEleitor(Eleitor obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "insert into eleitor (eleitorNumInsc,eleitorNome,"
                + "eleitorDtNasc,eleitorZona,eleitorSecao,eleitorDtEmi,"
                + "eleitorMunicipio,eleitorUf,eleitorNomePai,eleitorNomeMae)"
                + " values (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setLong(1, obj.getNumInc());
            stmt.setString(2, obj.getNome());
            stmt.setDate(3, (Date) obj.getDataNasc());
            stmt.setInt(4, obj.getZona());
            stmt.setInt(5, obj.getSecao());
            stmt.setDate(6, (Date) obj.getDataEmissao());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getUf());
            stmt.setString(9,obj.getPai());
            stmt.setString(10,obj.getMae());
            
            stmt.executeUpdate();            
            ConnectionFactory.closeConnection(conexao, stmt);            
            return true;
            
        } catch (SQLException ex) {
            System.err.println(ex);
            ConnectionFactory.closeConnection(conexao, stmt);
            return false;
        }
    }//Fim do Insert
    
    public static Eleitor exiberEleitor(int insc){
        
        Eleitor obj = new Eleitor();
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "SELECT * FROM eleitor where eleitorNumInsc = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, insc);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){   
                obj.setLong(rs.getLong("eleitorInsc"));
                obj.setNome(rs.getString("eleitorNome"));
                obj.setDataNasc(rs.getDate("eleitorDtNasc"));
                obj.setZona(rs.getInt("eleitorZona"));
                obj.setSecao(rs.getInt("eleitorSecao"));
                obj.setDataEmissao(rs.getDate("eleitorDtEmi"));
                obj.setCidade(rs.getString("eleitorMunicipio"));
                obj.setUf(rs.getString("eleitorUf"));
                obj.setPai(rs.getString("eleitorNomePai"));
                obj.setMae(rs.getString("eleitorNomeMae"));
                     
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
    
    public static boolean editarEleitor(Eleitor obj){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
         
        String sql = "UPDATE eleitor set"
                + " eleitorNome = ?, eleitorDtNasc = ?, eleitorZona = ?,"
                + "eleitorSecao = ?, eleitorDtEmi = ?, eleitorMunicipio = ?,"
                + "eleitorUf = ?, eleitorNomePai = ?, eleitorNomeMae = ?"
                + " where eleitorNumInsc = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
              
            stmt.setString(1, obj.getNome());
            stmt.setDate(2, (Date) obj.getDataNasc());
            stmt.setInt(3, obj.getZona());
            stmt.setInt(4, obj.getSecao());
            stmt.setDate(5, (Date) obj.getDataEmissao());
            stmt.setString(6, obj.getCidade());
            stmt.setString(7, obj.getUf());
            stmt.setString(8,obj.getPai());
            stmt.setString(9,obj.getMae());
            stmt.setLong(10, obj.getNumInc());
            
            stmt.executeUpdate();            
            ConnectionFactory.closeConnection(conexao, stmt);            
            return true;
            
        } catch (SQLException ex) {
            System.err.println(ex);
            ConnectionFactory.closeConnection(conexao, stmt);
            return false;
        }
        
    }
    
    public static boolean excluirEleitor(Long insc){
               
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "Delete from eleitor where eleitorNumInsc = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setLong(1, insc);
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
