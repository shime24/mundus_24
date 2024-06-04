package modelo;

	public class Entrada {
		private int idEntradas;
		private String nombreEvento;
		private String comprador;
		private boolean reservar;
		private String metodoPago;
		private String email;
		private int telefono;
		private int cantidad;
	
		// Constructor vacío
		public Entrada() {
		}
	
		// Constructor con todos los atributos
		public Entrada(int idEntradas, String nombreEvento, String comprador, boolean reservar, String metodoPago, String email, int telefono, int cantidad) {
			this.idEntradas = idEntradas;
			this.nombreEvento = nombreEvento;
			this.comprador = comprador;
			this.reservar = reservar;
			this.metodoPago = metodoPago;
			this.email = email;
			this.telefono = telefono;
			this.cantidad = cantidad;
		}
	
		// Métodos Getters y Setters
		public int getIdEntradas() {
			return idEntradas;
		}
	
		public void setIdEntradas(int idEntradas) {
			this.idEntradas = idEntradas;
		}
	
		public String getNombreEvento() {
			return nombreEvento;
		}
	
		public void setNombreEvento(String nombreEvento) {
			this.nombreEvento = nombreEvento;
		}
	
		public String getComprador() {
			return comprador;
		}
	
		public void setComprador(String comprador) {
			this.comprador = comprador;
		}
	
		public boolean isReservar() {
			return reservar;
		}
	
		public void setReservar(boolean reservar) {
			this.reservar = reservar;
		}
	
		public String getMetodoPago() {
			return metodoPago;
		}
	
		public void setMetodoPago(String metodoPago) {
			this.metodoPago = metodoPago;
		}
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
	
		public int getTelefono() {
			return telefono;
		}
	
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
	
		public int getCantidad() {
			return cantidad;
		}
	
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
	
		// Método toString
		@Override
		public String toString() {
			return "Entrada"["idEntradas="+ idEntradas, "nombreEvento="+nombreEvento, "comprador="+comprador, "reservar="+Reservar, " metodoPago="+metodoPago, "email=" + email, 
			"Telefono="+ Telefono, "cantidad="cantidad]
			 
					}
		
	}
	