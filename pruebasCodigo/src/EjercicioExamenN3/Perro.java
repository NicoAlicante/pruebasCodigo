package EjercicioExamenN3;

public class Perro extends Animal 
{
	/* Atributos -----------------------*/
	protected int mordisco, olfato, velocidad;
	
	//-------------------------|Constructor
	public Perro() {super();mordisco=0; olfato=0; velocidad=0;}
	public Perro(int mordisco) {this(); this.mordisco = mordisco;}
	public Perro(int mordisco, int olfato) {this(mordisco); this.olfato = olfato;}
	public Perro(int mordisco, int olfato, int velocidad) 
		{this(mordisco,olfato); this.velocidad = velocidad;}
	
	public Perro(String nombre) {super(nombre);mordisco=0; olfato=0; velocidad=0;}
	public Perro(String nombre, int mordisco) {this(nombre);this.mordisco=mordisco;}
	public Perro(String nombre, int mordisco, int olfato) {this(nombre,mordisco);this.olfato=olfato;}
	public Perro(String nombre, int mordisco, int olfato, int velocidad)
		{this(nombre,mordisco,olfato);this.velocidad=velocidad;}
	
	public Perro(String nombre, String raza) {super(nombre, raza);mordisco=0; olfato=0; velocidad=0;}
	public Perro(String nombre, String raza, int mordisco) {this(nombre, raza);this.mordisco=mordisco;}
	public Perro(String nombre, String raza, int mordisco, int olfato) 
		{this(nombre, raza, mordisco);this.olfato=olfato;}
	public Perro(String nombre, String raza, int mordisco, int olfato, int velocidad) 
		{this(nombre, raza, mordisco, velocidad);this.velocidad=velocidad;}
	
	
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Methods
	
	public int getMordisco() {return mordisco;}
	public void setMordisco(int mordisco) {	this.mordisco = mordisco;}
	
	public int getOlfato() {return olfato;}
	public void setOlfato(int olfato) {	this.olfato = olfato;}
	
	public int getVelocidad() {	return velocidad;}
	public void setVelocidad(int velocidad) {this.velocidad = velocidad;}
	
	public boolean cazar(Gato g) 
	{
		boolean cazado=false;
		int ataque= (this.mordisco+this.olfato+this.velocidad)/3;
		int defensa= g.escapar();
		if(ataque > defensa) {cazado=true;}
		else {cazado=false;}
		
		return cazado;}
	
	

	
}
