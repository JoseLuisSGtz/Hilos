package MainPackage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Proceso {

    public void agregarUsuario(Usuario user) {
        CBD conn = new CBD();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO tablauser VALUES('" + user.Id + "', '" + user.Nombre+ "', '" + user.Correo+  "')";
            consulta.executeUpdate(sql);
            System.out.println("Usuario registrado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }

    public ArrayList<Usuario> obtenUser() {
        ArrayList<Usuario> arrUser = new ArrayList<>();
        CBD conn = new CBD();
        String sql = "SELECT * FROM tablauser";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Usuario user = new Usuario(rs.getInt("ID"),rs.getString("Nombre"), rs.getString("Correo") );
                arrUser.add(user);
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrUser;
    }

}
