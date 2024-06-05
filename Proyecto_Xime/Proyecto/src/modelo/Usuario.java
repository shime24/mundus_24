package modelo;

public class Usuario extends Persona{
    private int idUsuario;
    private int cp;
    private String localidad;
    private String contrasenia;

    //constructor vacío.
    public Usuario(){

    }
    // Constructor con todos los atributos
    public Usuario(int idUsuario, String nombre, String apellidos, String direccion, int cp,
                   long telefono, String localidad, String contrasenia, String email) {
        super(nombre, apellidos, direccion, telefono, email);
        this.idUsuario = idUsuario;
        this.cp = cp;
        this.localidad = localidad;
        this.contrasenia = contrasenia;
    }



    // Getters y setters para todos los atributos
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getContraseña() {
        return contrasenia;
    }

    public void setContraseña(String contraseña) {
        this.contrasenia = contraseña;
    }


    // toString
    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellido() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", cp=" + cp +
                ", telefono=" + getTelefono() +
                ", localidad='" + localidad + '\'' +
                ", contraseña='" + contrasenia + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}