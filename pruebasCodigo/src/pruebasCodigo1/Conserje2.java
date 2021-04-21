package pruebasCodigo1;

import java.util.Scanner;

public class Conserje2
{
	private static int num1=0;
	private static Hijo []h =new Hijo [3];
	private static Vecina [] a = new Vecina [4];
	private static int indice=0;
	private static Scanner teclado = new Scanner(System.in);
	
	public static void agregarHobbie()
	{
		Hijo aux = new Hijo();
		if(indice < h.length)
		{
			for(int i =0; i < a.length; i++){if(a[i]!=null){ indice++; }else { break; }	}
			aux=introducirDatosV();
			h[indice]=new Hijo();
			h[indice].setNombre(aux.getNombre());
			h[indice].setApellidos(aux.getApellidos());
			h[indice].setEdad(aux.getEdad());
		}
		
	}
		
	public static Hijo introducirDatosV()
	{
		Hijo hobbie=new Hijo();
		
		System.out.print("introduce el nombre del hobbie ");
		hobbie.setNombre(teclado.nextLine());
		System.out.print("introduce donde sueles realizarlo ");
		hobbie.setApellidos(teclado.nextLine());
		System.out.print("¿Con cuántas personas sueles realizarlo? ");
		hobbie.setEdad(Integer.parseInt(teclado.nextLine()));
		return hobbie;
	}
	public static void main(String[] args) 
	{	
		for(Hijo inquilino: h) {System.out.println(inquilino);}	
		agregarHobbie();
		for(Hijo v: h) {System.out.println(v);}
		agregarHobbie();
		for(Hijo v: h) {System.out.println(v);}
		teclado.close();}
	

}
