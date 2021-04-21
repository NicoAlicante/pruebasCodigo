package pruebasCodigo1;

public class Hijo extends Padre 	//------------------------> la clase hijo, representa a las clases heredadas de Alumno y Profesor.
{
		//<------------------------------------|Atrubutos|
	private String [] aficiones = new String[3];
	//private Vecina a;
	//int contador;

	
	
		//------------------------------------>|Constructores|
	public Hijo() 
	{ 
		super();
		//contador=10;
	/*	for(int i=0; i <aficiones.length; i++)
		{
			aficiones[i]=null;
		
			//aficiones[i].setLocalidad(null);
			//aficiones[i].setNumPersonas(contador);
		} */
			
	}
	public Hijo(String nombre, String apellidos, int edad) {super(nombre,apellidos,edad);for(int i = 0; i < aficiones.length; i++) {aficiones[i]=null;}}
	
		
		//				|Métodos|

	@Override
	public String toString()
	{
//		String cadena2= aficiones[1].getNomHobbie();
		String cadena ="Nombre: "+ getNombre()+"\nApellidos: "+ getApellidos()+"\nEdad: "+getEdad() + "\nAficiones: " /*+ cadena2*/;
		return cadena;
	}

	
	public void setAficiones(String aficion)
	{for(String lista : aficiones) {if(lista==null){lista=aficion;}else{System.out.println("Ya has alcanzado el limite de aficiones que puedes realizar");}}}
	
	
	
	
	
	
}			//<<<<<<<<<<<<<Cierre de la clase
