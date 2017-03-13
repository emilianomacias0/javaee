/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author emi
 */
public class Consultas extends Conexion {
    
    public boolean Autenticacion(String user, String pass) throws SQLException{
       Statement st = con.createStatement();
       String Consulta = "Select * FROM usuarios";
       ResultSet rs = null;
       rs = st.executeQuery(Consulta);
       while(rs.next()){
           if (user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contrasena"))) {
               return true;
           }
        }
        return false;
    }
    
    public static void main(String[] args) throws SQLException {
        Consultas con = new Consultas();
        System.out.println(con.Autenticacion("", "")); 
    }
}
