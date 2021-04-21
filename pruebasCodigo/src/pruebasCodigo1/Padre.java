package pruebasCodigo1;

public abstract class Padre // --------------------> representa a la clase de personas
{
	private String nombre, apellidos;
	private int edad;
	
	
	public Padre() {this.nombre="";this.apellidos="";this.edad=0;}
	public Padre(String nombre, String apellidos, int edad) {this.nombre=nombre;this.apellidos=apellidos;this.edad=edad;}
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getApellidos() { return apellidos; }
	public void setApellidos(String apellidos) { this.apellidos = apellidos; }
	
	public int getEdad() { return edad;}
	public void setEdad(int edad) { this.edad = edad; }
	
}