package controlador;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAcceso extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mundus";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Usuario = request.getParameter("Usuario");
        String contraseña = request.getParameter("Contraseña");

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        
        if (validateUser(Usuario, contrseña)) {
            out.println("{\"success\": true}");
        } else {
            out.println("{\"success\": false, \"message\": \"Credenciales inválidas.\"}");
        }
    }

    private boolean validateUser(String Usuario, String contraseña) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_usuario, DB_contrasena);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM usuario WHERE nombre = ? AND contraseña = ?");
            statement.setString(1, usuario);
            statement.setString(7, contraseña);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}