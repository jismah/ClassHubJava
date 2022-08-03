package Register;

import BD.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

public class RegisterBack {

    public DefaultComboBoxModel LlenarCombo() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione carrera");

        try {
            java.sql.Connection con = Conexion.getConexion();
            CallableStatement cmd = con.prepareCall("{CALL SP_COMBO_CARRERAS}");
            ResultSet rs = cmd.executeQuery();
            
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
            
        } catch (SQLException e) {

        }
        return modelo;
    }
}
