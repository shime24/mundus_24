package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;


	public class ServletPerfilUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private Usuario Usuario;
    
    public ServletPerfilUsuario() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        Connection con = // Obtener la conexión a la base de datos
        Usuario = new Usuario(con);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        
        try {
            Persona persona = personaDAO.obtenerPersona(idUsuario);
            if (persona != null) {
                out.println("<h1>Perfil de Usuario</h1>");
                out.println("<p>ID: " + persona.getId() + "</p>");
                out.println("<p>Nombre: " + persona.getNombre() + "</p>");
                out.println("<p>Apellidos: " + persona.getApellidos() + "</p>");
                out.println("<p>Dirección: " + persona.getDireccion() + "</p>");
                out.println("<p>CP: " + persona.getCp() + "</p>");
                out.println("<p>Teléfono: " + persona.getTelefono() + "</p>");
                out.println("<p>Localidad: " + persona.getLocalidad() + "</p>");
                out.println("<p>Email: " + persona.getEmail() + "</p>");
            } else {
                out.println("<p>No se encontró el usuario con ID: " + idUsuario + "</p>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<p>Error al obtener la información del usuario</p>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String direccion = request.getParameter("direccion");
        int cp = Integer.parseInt(request.getParameter("cp"));
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String localidad = request.getParameter("localidad");
        String contraseña = request.getParameter("contrasena");
        String email = request.getParameter("email");
        
        try {
            personaDAO.actualizarPersona(idUsuario, nombre, apellidos, direccion, cp, telefono, localidad, contraseña, email);
            out.println("<p>Perfil actualizado correctamente</p>");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<p>Error al actualizar el perfil del usuario</p>");
        } finally {
            out.close();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            if (Usuario != null && Usuario.getConnection() != null) {
                Usuario.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}





