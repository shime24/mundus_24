package modelo;

public abstract class Persona {
private String nombre;
private String apellido;
private String direccion;
private long telefono;
private String email;

public Persona(){
    
}
public Persona(String nombre, String apellido, String direccion, long telefono, String email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getApellido() {
    return apellido;
}


public void setApellido(String apellido) {
    this.apellido = apellido;
}


public String getDireccion() {
    return direccion;
}


public void setDireccion(String direccion) {
    this.direccion = direccion;
}


public long getTelefono() {
    return telefono;
}


public void setTelefono(int telefono) {
    this.telefono = telefono;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}

}
