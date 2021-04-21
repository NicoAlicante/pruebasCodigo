package pruebasCodigo1;

public class Vecina //--------------------------> representa a la clase Asignatura.
{
			//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<|Atributos/propiedades|
	private String nomHobbie, localidad;
	private int numPersonas;
			//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<|Constructores|
	public Vecina() {this.nomHobbie=""; this.localidad=""; this.numPersonas=0; }
			//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<|métodos|
	public String getNomHobbie() { return nomHobbie;}
	public void setNomHobbie(String nomHobbie) {this.nomHobbie = nomHobbie;}


	public String getLocalidad() {return localidad;}
	public void setLocalidad(String localidad) {this.localidad = localidad;}

	public int getNumPersonas() {return numPersonas;}
	public void setNumPersonas(int numPersonas) {this.numPersonas = numPersonas;}

	@Override
	public String toString()
	{
		String cadena ="Nombre: "+ getNomHobbie()+"\nLugar: "+ getLocalidad()+"\nPersonas: "+getNumPersonas();
		return cadena;
	}





}
