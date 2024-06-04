package conexion_bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.google.gson.Gson;
import modelo.Usuario;

public class ConexionBBDD {
    private static final String URL = "jdbc:mysql://localhost:3306/mundus";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    private Connection conexion;

    public ConexionBBDD() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexion = DriverManager.getConnection(URL, "root", "1234");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() throws SQLException {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Usuario> obtenerUsuarios() throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try (PreparedStatement ps = conexion.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setCp(rs.getInt("cp"));
                usuario.setTelefono(rs.getInt("telefono"));
                usuario.setLocalidad(rs.getString("localidad"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setEmail(rs.getString("email"));
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    public void insertarUsuario(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuarios (nombre, apellidos, direccion, cp, telefono, localidad, contrasena, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellidos());
            ps.setString(3, usuario.getDireccion());
            ps.setInt(4, usuario.getCp());
            ps.setInt(5, usuario.getTelefono());
            ps.setString(6, usuario.getLocalidad());
            ps.setString(7, usuario.getContrasena());
            ps.setString(8, usuario.getEmail());
            ps.executeUpdate();
        }
    }

    public void actualizarUsuario(Usuario usuario) throws SQLException {
        String query = "UPDATE usuarios SET nombre = ?, apellidos = ?, direccion = ?, cp = ?, telefono = ?, localidad = ?, contrasena = ?, email = ? WHERE idUsuario = ?";
        try (PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellidos());
            ps.setString(3, usuario.getDireccion());
            ps.setInt(4, usuario.getCp());
            ps.setInt(5, usuario.getTelefono());
            ps.setString(6, usuario.getLocalidad());
            ps.setString(7, usuario.getContrasena());
            ps.setString(8, usuario.getEmail());
            ps.setInt(9, usuario.getIdUsuario());
            ps.executeUpdate();
        }
    }

    public void eliminarUsuario(int idUsuario) throws SQLException {
        String query = "DELETE FROM usuarios WHERE idUsuario = ?";
        try (PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setInt(1, idUsuario);
            ps.executeUpdate();
        }
    }

    public String usuariosToJson(ArrayList<Usuario> usuarios) {
        Gson gson = new Gson();
        return gson.toJson(usuarios);
    }
}
