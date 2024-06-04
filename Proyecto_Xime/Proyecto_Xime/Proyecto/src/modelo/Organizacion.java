package modelo;

public class Organizacion {
    private int idOrganizacion;
    private String nombre;
    private String direccion;
    private int telefono;
    private String tipo;
    private String web;
    private String localidad;

    // Constructor
    public Organizacion(int idOrganizacion, String nombre, String direccion, int telefono, String tipo, String web, String localidad) {
        this.idOrganizacion = idOrganizacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.web = web;
        this.localidad = localidad;
    }

    // Getters and setters
    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Organizacion [idOrganizacion=" + idOrganizacion + ", nombre=" + nombre + ", direccion=" + direccion
                + ", telefono=" + telefono + ", tipo=" + tipo + ", web=" + web + ", localidad=" + localidad + "]";
    }
}
