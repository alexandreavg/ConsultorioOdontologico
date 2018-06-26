/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionFactory {

 
    public static Connection getConnection() {
              try {
                  return DriverManager.getConnection(
                          "jdbc:mysql://127.0.0.1:3306/provaDois", 
                          "root", "mgtrda");
                  
              } catch (SQLException e) {
                  throw new RuntimeException(e);
              }
              catch(Exception ex){
                  JOptionPane.showMessageDialog(null, "Erro ao abrir conexão: " + ex);
              }
              return null;
          }
    
    public static void closeConnection(Connection con){
            if(con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conxão: " + ex);
                }
            }
        }

        public static void closeConnection(Connection con, PreparedStatement stmt){
            closeConnection(con);
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar Statement: " + ex);
                }
            }
        }

        public static void closeConnection(Connection con, PreparedStatement stmt,
            ResultSet rs){
            closeConnection(con, stmt);
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao fechar conxão: " + ex);
                }
            }
        }
    
 
}//Fim da Classe
