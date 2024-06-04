package modelo;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int cp;
    private long telefono;
    private String localidad;
    private String contraseña;
    private String email;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todos los atributos
    public Usuario(int idUsuario, String nombre, String apellidos, String direccion, int cp,
                   int telefono, String localidad, String contraseña, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cp = cp;
        this.telefono = telefono;
        this.localidad = localidad;
        this.contraseña = contraseña;
        this.email = email;
    }

    // Getters y setters para todos los atributos
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "Usuario" ["idUsuario=" + idUsuario + " nombre="+ nombre , " apellidos=" + apellidos,
              "direccion=" + direccion , "cp=" + cp ," telefono=" + telefono "localidad=" + localidad,  "contrasena=" + contrasena, "email=" email]
            
    }
}