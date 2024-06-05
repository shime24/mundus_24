package modelo;

public class Evento {
    private int idEvento;
    private String nombreEvento;
    private String lugar;
    private int dia;
    private int fecha;
    private int hora;
    private String direccion;
    private String descripcion;
    private String web;
    private String condiciones;

    // Constructor vacío
    public Evento() {
    }

    // Constructor con todos los atributos
    public Evento(int idEvento, String nombreEvento, String lugar, int dia, int fecha,
                  int hora, String direccion, String descripcion, String web, String condiciones) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.lugar = lugar;
        this.dia = dia;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.web = web;
        this.condiciones = condiciones;
    }

    // Métodos Getters y Setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    // Método toString
    @Override
    public String toString() {
        return "Evento{" + "idEvento=" + idEvento + ",nombreEvento=" + nombreEvento + ",lugar=" +lugar + ",dia="+ lugar + ",dia=" + dia + 
            ",fecha="+ fecha + ",hora="+ hora + ",direccion=" + direccion +",descripcion=" + descripcion + ",web="+ web + ",condiciones="+ condiciones + "}";
           
                 }

  }