package modelo;

public class Trabajador extends Persona{
    private  int idTrabajador;
    private String departamento;
    private String cargo;
    private boolean esAdministrador;


    //constructor vacio.
    public Trabajador(){
        
    }

    // Constructor
    public Trabajador(int idTrabajador, String nombre, String apellidos, String departamento, String cargo, long telefono, boolean esAdministrador, String direccion, String email) {
        super(nombre, apellidos, direccion, telefono, email);
        this.idTrabajador = idTrabajador;
        this.departamento = departamento;
        this.cargo = cargo;
        this.esAdministrador = esAdministrador;
    }

    // Getters and setters
    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
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


    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }



    @Override
    public String toString() {
        return "Trabajador{" +
                "idTrabajador=" + idTrabajador +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellido() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono=" + getTelefono() +
                ", esAdministrador=" + esAdministrador +
                ", direccion='" + getDireccion() + '\'' +
                '}';


    }
}