package ejercicio8;

public class Producto implements Descuento{
	// Atributos
	private int id;
	private String talla;
	private String marca;
	private double precio;
	private String color;
	private String tipoProducto;
	private Tienda tienda;
	
	//Constructor
	public Producto(int id, String talla, String marca, double precio, String color, String tipoProducto, Tienda tienda) {
		super();
		this.id = id;
		this.talla = talla;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.tipoProducto = tipoProducto;
		this.tienda = tienda;
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	
	// toString
	public String toString() {
		return "Producto [id=" + id + ", talla=" + talla + 
				", marca=" + marca + ", precio=" + precio + ", color="
				+ color + ", tipoProducto=" + tipoProducto + ", tienda=" + tienda + "]";
	}

	// Métodos
	public static void darAltaProducto() {
		
	}
	public static void darBajaProducto() {
		
	}
	public static int stock(int stock) {
		return stock;
	}

}
