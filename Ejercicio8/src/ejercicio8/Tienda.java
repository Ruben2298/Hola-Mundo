package ejercicio8;

public class Tienda {
	// Atributos
	protected int id;
	private String nombre;
	private String ubicacion;
	
	// Constructores
	public Tienda(int id, String nombre, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	// Métodos
	public static boolean consultaAbierto() {
		return false;
		
	}	
}
