package EjercicioExamenN3;

public abstract class Animal 
{
	protected String nombre, raza;
	
	//--------------| Constructores.
	public Animal() {nombre=""; raza="";}
	public Animal(String nombre) {this(); this.nombre=nombre;}
	public Animal(String nombre, String raza) {this(nombre);this.raza=raza;}
	
	public String getNombre() {	return nombre;}
	public void setNombre(String nombre) {	this.nombre = nombre; }
	
	public String getRaza() {return raza;}
	public void setRaza(String raza) {this.raza = raza;}
	
	
}
