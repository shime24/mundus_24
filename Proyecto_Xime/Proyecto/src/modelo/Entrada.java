package modelo;

	public class Entrada extends Persona{
		private int idEntradas;
		private String nombreEvento;
		private String comprador;
		private boolean reservar;
		private String metodoPago;
		private int cantidad;
	
		// Constructor vacío
		public Entrada() {
		}
	
		// Constructor con todos los atributos
		public Entrada(int idEntradas, String nombreEvento, String comprador, boolean reservar, String metodoPago, String email, int telefono, int cantidad) {
			super(nombreEvento, comprador, metodoPago, telefono, email);
			this.idEntradas = idEntradas;
			this.nombreEvento = nombreEvento;
			this.comprador = comprador;
			this.reservar = reservar;
			this.metodoPago = metodoPago;
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
	
		public int getCantidad() {
			return cantidad;
		}
	
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
	
		// Método toString
		@Override
		public String toString() {
			return "Entrada{"+"idEntradas="+ idEntradas + ",nombreEvento="+nombreEvento + ",comprador="+comprador+ ",reservar="+reservar+ ", metodoPago="+metodoPago+",email=" + getEmail()+ 
			",Telefono="+ getTelefono() + ",cantidad="+ cantidad+"}";
			 
					}
		
	}
	