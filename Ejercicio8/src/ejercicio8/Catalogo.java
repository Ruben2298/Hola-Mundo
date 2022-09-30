package ejercicio8;

public class Catalogo {
	// Atributos
	private int id;
	private int año;
	private String tipoTemporada;
	private Tienda tienda;
	private Producto producto;
	
	// Constructor
	public Catalogo(int id, int año, String tipoTemporada, Tienda tienda, Producto producto) {
		this.id = id;
		this.año = año;
		this.tipoTemporada = tipoTemporada;
		this.tienda = tienda;
		this.producto = producto;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getTipoTemporada() {
		return tipoTemporada;
	}

	public void setTipoTemporada(String tipoTemporada) {
		this.tipoTemporada = tipoTemporada;
	}
	
	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	//toString
	public String toString() {
		return "Catalogo [id=" + id + ", año=" + año + ", tipoTemporada=" 
				+ tipoTemporada + ", tienda=" + tienda
				+ ", producto=" + producto + "]";
	}
	
	//Métodos
	public static boolean operativo(int año) {
		return false;
		
	}
	
	public static void añadirProducto() {
		
	}
	
	public static void eliminarProducto() {
		
	}
	
	
	
	
	
}
