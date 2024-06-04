package modelo;

public class trabajador {
    private INT idtrabajador;
    private String nombre;
    private String apellidos;
    private String departamento;
    private String cargo;
    private int telefono;
    private boolean esAdministrador;
    private String direccion;


    //constructor vacio.

    public trabajador(){

        
    }

    // Constructor
    public Trabajador(int idtrabajador, String nombre, String apellidos, String departamento, String cargo, INT telefono, boolean esAdministrador, String direccion) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.cargo = cargo;
        this.telefono = telefono;
        this.esAdministrador = esAdministrador;
        this.direccion = direccion;
    }

    // Getters and setters
    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(INT telefono) {
        this.telefono = telefono;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
     return "trabajador" [idtrabajador=" + idtrabajador + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", departamento=" + departamento + ", cargo=" + cargo + ", telefono=" + telefono + ", esAdministrador=" + esAdministrador + ", "direccion=" + directon;]
            
        }


    }