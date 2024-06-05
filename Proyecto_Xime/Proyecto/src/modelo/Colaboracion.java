package modelo;

public class Colaboracion {
    private int id_colaboraciones;
    private String nombre;
    private String telefono;
    private String direccion;
    private String apellidos;
    private String email;
    private String metodo;
    private double cantidad;

    // Constructor vacío
    public Colaboracion() {
    }

    // Constructor con parámetros
    public Colaboracion(int id_colaboraciones, String nombre, String telefono, String direccion, 
                        String apellidos, String email, String metodo, double cantidad) {
        this.id_colaboraciones = id_colaboraciones;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.apellidos = apellidos;
        this.email = email;
        this.metodo = metodo;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public int getId_colaboraciones() {
        return id_colaboraciones;
    }

    public void setId_colaboraciones(int id_colaboraciones) {
        this.id_colaboraciones = id_colaboraciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
	public String toString() {
        return "Colaboracion{"+ " ideColaboraciones="+ id_colaboraciones + ",nombre="+ nombre + ",direccion="+ direccion + ",telefono="+ telefono + ",apellidos=" +apellidos + ",metodo="+ metodo +  ",email=" + email +  ",cantidad="+cantidad +"}";
                
    }
}