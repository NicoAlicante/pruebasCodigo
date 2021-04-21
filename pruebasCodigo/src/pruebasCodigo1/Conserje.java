package pruebasCodigo1;

import java.util.Scanner;

public class Conserje
{
	private static Hijo []h =new Hijo [3];
	private static Vecina [] a = new Vecina [4];
	private static int indice=0;
	private static Scanner teclado = new Scanner(System.in);
	
	public static void agregarHobbie()
	{
		Vecina aux = new Vecina();
		if(indice<3)
		{
			for(int i =0; i < a.length; i++){if(a[i]!=null){ indice++; }else { break; }	}
			aux=introducirDatosV();
			a[indice]=new Vecina();
			a[indice].setNomHobbie(aux.getNomHobbie());
			a[indice].setLocalidad(aux.getLocalidad());
			a[indice].setNumPersonas(aux.getNumPersonas());
		}
	
	
	
	
	}
		
	public static Vecina introducirDatosV()
	{
		Vecina hobbie=new Vecina();
		
		System.out.print("introduce el nombre del hobbie ");
		hobbie.setNomHobbie(teclado.nextLine());
		System.out.print("introduce donde sueles realizarlo ");
		hobbie.setLocalidad(teclado.nextLine());
		System.out.print("¿Con cuántas personas sueles realizarlo? ");
		hobbie.setNumPersonas(Integer.parseInt(teclado.nextLine()));
		return hobbie;
	}
	public static void main(String[] args) 
	{	
		for(Vecina inquilino: a) {System.out.println(inquilino);}	
		agregarHobbie();
		for(Vecina v: a) {System.out.println(v);}
		agregarHobbie();
		for(Vecina v: a) {System.out.println(v);}
		teclado.close();}
	

}
