/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class Inserts extends Conexion{
    public boolean InsertaUsuario(String nombre, String usuario, String contrasena) throws SQLException{
        PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (nombre,usuario,contrasena) VALUES (?,?,?)");
        ps.setString(1, nombre);
        ps.setString(2, usuario);
        ps.setString(3, contrasena);
        int res = ps.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Usuario registrado");
            return true;
        }
        return false;
    }
}
